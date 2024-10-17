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
        double ogNumb;
        //New number it was converted to
        double newNumb;

        //Unit types
        String

        //Units numbers for conversions
        double inchNum;
        double footNum;
        double cubitNum;
        double step;
        double yard;
        double mile;

        Scanner inputDevice = new Scanner (System.in);
        //Shows the text in quotations
        System.out.println("Enter the original unit type: ");
        //User enters the original unit they want to convert
        ogUnit = inputDevice.nextLine(inch, foot, cubit, step, yard, mile);
        //Shows the text in quotations
        System.out.println("Enter the number for that unit type: ");
        //User enters the original number of the original unit
        ogNumb = Double.parseDouble(inputDevice.nextLine());

        //Shows the text in quotations
        System.out.println("Enter the new unit type: ");
        //User enters the new unit that it is converted to
        newUnit = inputDevice.nextLine(inch, foot, cubit, step, yard, mile);

        float inchToFoot = inch / 12;
        float inchToCubit = inch / 18;
        double inchToStep = (inch / 12) / 2.5;
        float inchToYard = (inch / 12) / 3;
        float inchToMile = (inch / 12) / 5280;

        float foot;
        float footToInch = foot * 12;
        float footToCubit = (foot * 12) / 18;

        float cubit;
        float cubit = inch * 18;

        float step;
        float step = (float) (foot * 2.5);

        float yard;
        float yard = foot * 3;

        float mile;
        float mile = foot * 5280;


        conversion =

        // 12 inches = 1 foot, 18 inches = 1 cubit, 2.5 feet = 1 step, 3 feet = 1 yard, 5280 feet = 1 mile
        System.out.print(conversion);
    }
}