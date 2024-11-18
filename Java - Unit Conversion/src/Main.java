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
        double cubitToStep = cubitNum ;

        //step conversions
        float step;
        float step = (float) (foot * 2.5);

        //yard conversions
        float yard;
        float yard = foot * 3;

        //mile conversions
        float mile;
        float mile = foot * 5280;


        conversion =

        // 12 inches = 1 foot, 18 inches = 1 cubit, 2.5 feet = 1 step, 3 feet = 1 yard, 5280 feet = 1 mile
        System.out.print(conversion);
    }
}