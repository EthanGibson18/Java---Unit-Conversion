import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //ogUnit is converted to newUnit and ogNum is given to ogUnit
        String ogUnit;
        String newUnit;
        double ogNum;

        Scanner inputConverter = new Scanner(System.in);
        //inputs for ogUnit, newUnit, and ogNum
        System.out.print("Please enter the unit of measure that you want to convert from: ");
        ogUnit = inputConverter.nextLine();

        System.out.print("Please enter the unit of measure that you want to convert to: ");
        newUnit = inputConverter.nextLine();

        System.out.print("Please enter the number for the unit of measure that you want to convert from: ");
        ogNum = inputConverter.nextDouble();

        //stores the conversion result
        double result = 0;

        //performs the conversion according to the input and output units
        result = convertUnits(ogUnit, newUnit, ogNum);

        //if result = -1, it means an invalid unit was used
        if (result != -1)
        {
            System.out.println(ogNum + " " + ogUnit + " = " + result + " " + newUnit);
        }
        else
        {
            System.out.println("The unit entered is invalid. Please use the words inches, feet, cubits, steps, yards, and miles.");
        }
    }

    //unit conversion is done here
    public static double convertUnits(String ogUnit, String newUnit, double ogNum)
    {

        //unit conversion to inches as a base
        double inchesPerFoot = 12.0;
        double inchesPerCubit = 18.0;
        double inchesPerStep = 30.0;
        double inchesPerYard = 36.0;
        double inchesPerMile = 63360.0;

        //convert ogUnit to inches first
        double valueInInches = 0;

        switch (ogUnit)
        {
            case "inches":
                valueInInches = ogNum;
                break;
            case "feet":
                valueInInches = ogNum * inchesPerFoot;
                break;
            case "cubits":
                valueInInches = ogNum * inchesPerCubit;
                break;
            case "steps":
                valueInInches = ogNum * inchesPerStep;
                break;
            case "yards":
                valueInInches = ogNum * inchesPerYard;
                break;
            case "miles":
                valueInInches = ogNum * inchesPerMile;
                break;
            //indicates the use of an invalid input unit
            default:
                return -1;
        }

        //convert from inches to desired unit
        switch (newUnit)
        {
            case "inches":
                return valueInInches;
            case "feet":
                return valueInInches * inchesPerFoot;
            case "cubits":
                return valueInInches * inchesPerCubit;
            case "steps":
                return valueInInches * inchesPerStep;
            case "yards":
                return valueInInches * inchesPerYard;
            case "miles":
                return valueInInches * inchesPerMile;
            //indicates the use of an invalid output unit
            default:
                return -1;
        }
    }
}