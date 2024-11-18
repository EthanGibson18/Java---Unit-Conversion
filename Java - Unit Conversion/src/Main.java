import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Original unit to convert
        String ogUnit;
        //New unit that's being converted to
        String newUnit;
        //Number of the original unit
        double ogNum;
        //New number it was converted to
        double newNum;

        //Unit types
        String inch;
        String foot;
        String cubit;
        String step;
        String yard;
        String mile;

        //Units numbers for conversions
        double inchNum;
        double footNum;
        double cubitNum;
        double stepNum;
        double yardNum;
        double mileNum;

        Scanner inputDevice = new Scanner (System.in);
        //Shows the text in quotations
        System.out.println("Enter the original unit type: ");
        //User enters the original unit they want to convert
        ogUnit = inputDevice.nextLine(inch, foot, cubit, step, yard, mile);
        //Shows the text in quotations
        System.out.println("Enter the number for that unit type: ");
        //User enters the original number of the original unit
        ogNum = Double.parseDouble(inputDevice.nextLine());

        //Shows the text in quotations
        System.out.println("Enter the new unit type: ");
        //User enters the new unit that it is converted to
        newUnit = inputDevice.nextLine(inch, foot, cubit, step, yard, mile);

        //Inches conversion
        double inchToFoot = inchNum / 12;
        double inchToCubit = inchNum / 18;
        double inchToStep = inchNum / 30;
        double inchToYard = inchNum / 36;
        double inchToMile = inchNum / 63360;

        //foot conversions
        double footToInch = footNum * 12;
        double footToCubit = footNum / 1.5;
        double footToStep = footNum / 2.5;
        double footToYard = footNum / 3;
        double footToMile = footNum / 5280;

        //cubit conversions
        double cubitToInch = cubitNum * 18;
        double cubitToFoot = cubitNum * 1.5;
        double cubitToStep = cubitNum * 0.6;
        double cubitToYard = cubitNum * 0.5;
        double cubitToMile = cubitNum / 3520 ;

        //step conversions
        double stepToInch = stepNum * 30;
        double stepToFoot = stepNum * 2.5;
        double stepToCubit = stepNum / 0.6;
        double stepToYard = stepNum / 1.2;
        double stepToMile = stepNum / 2112;

        //yard conversions
        double yardToInch = yardNum * 36;
        double yardToFoot = yardNum * 3;
        double yardToCubit = yardNum * 2;
        double yardToStep = yardNum * 1.2;
        double yardToMile = yardNum / 1760;

        //mile conversions
        double mileToInch = mileNum * 63360;
        double mileToFoot = mileNum * 5280;
        double mileToCubit = mileNum * 3520;
        double mileToStep = mileNum * 2112;
        double mileToYard = mileNum * 1760;



        conversion =

        // 12 inches = 1 foot, 18 inches = 1 cubit, 2.5 feet = 1 step, 3 feet = 1 yard, 5280 feet = 1 mile
        System.out.print(conversion);
    }
}