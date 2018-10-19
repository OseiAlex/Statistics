import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Utility ut = new Utility();
        ut.inputData();
        int option = ut.getOption();
        DecimalFormat four_DecimalForm = new DecimalFormat("#.0000");

        switch (option) {
            //option menu for mean
            case 1:
                System.out.println("The mean is : " +  four_DecimalForm.format(ut.mean()));
                break;

                //option menu for standard deviation
            case 2:
                System.out.println("The standard deviation is : " +
                        four_DecimalForm.format(ut.sDeviation()));
                break;

            //option menu for mode
            case 3:
                System.out.println("The mode is : " + ut.mode());
                break;

            default:
                System.out.println("Invalid menu!");
        }
    }
}