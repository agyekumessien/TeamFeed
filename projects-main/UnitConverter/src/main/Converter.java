package main;

import java.util.Scanner;

public class Converter {
	static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int submenu;
        String menu = "Please select an option:"
                + "\n" + "1. Temperature Conversion"
                + "\n" + "2. Distance Conversion"
                + "\n" + "3. Weight Conversion"
                + "\n" + "4. Quit";
        while (true) {
            System.out.println(menu);
            System.out.print(">> ");
            int menuSelection = scan.nextInt();

            switch(menuSelection) {
                case 1:
                    subMenu(menuSelection);
                    System.out.print("    >> ");
                    submenu = scan.nextInt();
                    tempCalc(submenu);
                    

                    break;
                case 2:
                	subMenu(menuSelection);
                    System.out.print("    >> ");
                    submenu = scan.nextInt();
                    disCalc(submenu);
                    break;
                case 3:
                	subMenu(menuSelection);
                    System.out.print("    >> ");
                    submenu = scan.nextInt();
                    weighCalc(submenu);
                    break;
                case 4:
                	scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("The value you entered is not valid" + "\n");
            }
        }
    }
    
    
    public static void subMenu(int choice) {
    	   
           String temp = "    Please select the conversion direction:"
                   + "\n" + "    1. Fahrenheit to Celsius"
                   + "\n" + "    2. Celsius to Fahrenheit";

           String dis = "    Please select the conversion direction:"
                   + "\n" + "    1. KM to Miles"
                   + "\n" + "    2. Miles to KM"
                   + "\n" + "    3. Feet to Meter"
                   + "\n" + "    4. Meter to Feet"
                   + "\n" + "    5. Yard to Meter"
                   + "\n" + "    6. Meter to Yard";

           String weigh = "    Please select the conversion direction:"
                   + "\n" + "    1. Kg to lb"
                   + "\n" + "    2. lb to Kg";
           
           if(choice == 1) {
        	   System.out.println(temp);
           }else if(choice == 2) {
        	   System.out.println(dis);
           }else {
        	   System.out.println(weigh);
        	   
           }	
    }
    
    public static void tempCalc(int choice) {
    	double value;
    	double result;
    	switch (choice) {
        case 1:
            System.out.print("    please enter your Celsius value:  ");
            value = scan.nextDouble();
            result = fahrenheitToCelsius(value);
            System.out.println("    Your temperature in Fahrenheit is: " + result);
            break;
        case 2:
            System.out.print("    please enter your Fahrenheit value:  ");
            value = scan.nextDouble();
            result = celsiusToFahrenheit(value);
            System.out.println("    Your temperature in Celsius is: " + result + "\n");
    	}
    }
    
    
    public static void disCalc(int choice) {
    	
    	double value;
    	double result;
    	switch (choice) {
        case 1:
            System.out.print("    please enter your KM value:  ");
            value = scan.nextDouble();
            result = kmToMiles(value);
            System.out.println("    Your distance in Miles is: " + result);
            break;
        case 2:
            System.out.print("    please enter your Miles value:  ");
            value = scan.nextDouble();
            result = milesToKm(value);
            System.out.println("    Your distance in KM is: " + result + "\n");
            break;
        case 3:
            System.out.print("    please enter your Feet value:  ");
            value = scan.nextDouble();
            result = feetToMeter(value);
            System.out.println("    Your distance in Meter is: " + result + "\n");
            break;
        case 4:
            System.out.print("    please enter your Meter value:  ");
            value = scan.nextDouble();
            result = MeterToFeet(value);
            System.out.println("    Your distance in Feet is: " + result + "\n");
            break;

        case 5:
            System.out.print("    please enter your Yard value:  ");
            value = scan.nextDouble();
            result = yardToMeter(value);
            System.out.println("    Your distance in Meter is: " + result + "\n");
            break;
        case 6:
            System.out.print("    please enter your Meter value:  ");
            value = scan.nextDouble();
            result = MeterToyard(value);
            System.out.println("    Your distance in Yard is: " + result + "\n");
    	}
    	
    }
    
    public static void weighCalc(int choice) {
    	
    	Scanner scan = new Scanner(System.in);
    	double value;
    	double result;
    	
    	switch (choice) {
        case 1:
            System.out.print("    please enter your Kg value:  ");
            value = scan.nextDouble();
            result = kgToLb(value);
            System.out.println("    Your weight in lb is: " + result);

            break;
        case 2:
            System.out.print("    please enter your lb value:  ");
            value = scan.nextDouble();
            result = lbToKg(value);
            System.out.println("    Your weight in Kg is: " + result + "\n");
    	}
    }

    public static double fahrenheitToCelsius(double value) {
        double fraction = .5556;
        return (value - 32) * fraction ;

    }

    public static double celsiusToFahrenheit(double value){
        double fraction = .5556;
        return  (value / fraction) + 32;
    }

    public static double milesToKm(double value){
        double fraction = 0.62137;
        return value / fraction;
    }

    public static double kmToMiles(double value) {
        double fraction = 0.62137;
        return value * fraction;
    }

    public static double kgToLb(double value) {
        double fraction = 2.2046;
        return value * fraction;
    }

    public static double lbToKg(double value) {
        double fraction = 2.2046;
        return value / fraction;
    }

    public static double feetToMeter(double value) {
        double fraction = 3.2808;
        return value / fraction;
    }

    public static double MeterToFeet(double value) {
        double fraction = 3.2808;
        return value * fraction;
    }

    public static double yardToMeter(double value) {
        double fraction = 1.0936;
        return value / fraction;
    }

    public static double MeterToyard(double value) {
        double fraction = 1.0936;
        return value * fraction;
    }

}