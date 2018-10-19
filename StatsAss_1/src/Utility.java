import java.util.Scanner;

public class Utility {

    int[] num;
    int option;

    public int[] getNum(){ return num; }

    public int getOption(){
        return option;
    }

    public double mean(){
        double sum = 0;
        for (int number : num) {
            sum = sum + number;
        }
        double mean = sum / num.length;
        return mean;
    }

    public void inputData(){
        Scanner input = new Scanner(System.in);

        //Display option menu
        System.out.println("\n1. Mean");
        System.out.println("2. Standard deviation");
        System.out.println("3. Mode");

        System.out.print("\nSelect an option: ");
        option = input.nextInt();

        System.out.print("\nEnter number of items: ");
        int size = input.nextInt();

        num = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter number " + (i + 1) + ": ");
            num[i] = input.nextInt();
            i++;
        }
    }

    public double sDeviation(){
        double mn = mean();
        double sd = 0;
        for (int number : num) {
            sd = sd + (number - mn) * (number - mn);
        }
        return Math.sqrt(sd/num.length);
    }

    public int mode(){
        int maxValue = 0;
        int maxCount = 0;
        for (int number : num) {
            int count = 0;
            for (int number1 : num) {
                if (number1 == number) ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = number;
            }
        }
        return maxValue;
    }
}
