import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;

        // Objects
        Length length = new Length();
        Weight weight = new Weight();
        Temperature temperature = new Temperature();

        while (isTrue) {

            System.out.println("\n****** Converter Menu ******");
            System.out.println("1. Length");
            System.out.println("2. Temperature");
            System.out.println("3. Weight");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nLength Conversions:");
                    System.out.println("1. Meter to Kilometer");
                    System.out.println("2. Kilometer to Meter");
                    System.out.println("3. Meter to Centimeter");
                    System.out.println("4. Centimeter to Meter");

                    int lChoice = sc.nextInt();

                    if (lChoice >= 1 && lChoice <= 4) {
                        System.out.print("Enter value: ");
                        double value = sc.nextDouble();

                        switch (lChoice) {
                            case 1:
                                System.out.println("Result: " + length.meterToKilometer(value));
                                break;
                            case 2:
                                System.out.println("Result: " + length.kilometerToMeter(value));
                                break;
                            case 3:
                                System.out.println("Result: " + length.meterToCentimeter(value));
                                break;
                            case 4:
                                System.out.println("Result: " + length.centimeterToMeter(value));
                                break;
                        }
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 2:
                    System.out.println("\nTemperature Conversions:");
                    System.out.println("1. Celsius to Fahrenheit");
                    System.out.println("2. Fahrenheit to Celsius");
                    System.out.println("3. Celsius to Kelvin");
                    System.out.println("4. Kelvin to Celsius");

                    int tChoice = sc.nextInt();

                    if (tChoice >= 1 && tChoice <= 4) {
                        System.out.print("Enter value: ");
                        double value = sc.nextDouble();

                        switch (tChoice) {
                            case 1:
                                System.out.println("Result: " + temperature.celsiusToFahrenheit(value));
                                break;
                            case 2:
                                System.out.println("Result: " + temperature.fahrenheitToCelsius(value));
                                break;
                            case 3:
                                System.out.println("Result: " + temperature.celsiusToKelvin(value));
                                break;
                            case 4:
                                System.out.println("Result: " + temperature.kelvinToCelsius(value));
                                break;
                        }
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 3:
                    System.out.println("\nWeight Conversions:");
                    System.out.println("1. Kilogram to Gram");
                    System.out.println("2. Gram to Kilogram");
                    System.out.println("3. Kilogram to Pound");
                    System.out.println("4. Pound to Kilogram");

                    int wChoice = sc.nextInt();

                    if (wChoice >= 1 && wChoice <= 4) {
                        System.out.print("Enter value: ");
                        double value = sc.nextDouble();

                        switch (wChoice) {
                            case 1:
                                System.out.println("Result: " + weight.kgToGram(value));
                                break;
                            case 2:
                                System.out.println("Result: " + weight.gramToKg(value));
                                break;
                            case 3:
                                System.out.println("Result: " + weight.kgToPound(value));
                                break;
                            case 4:
                                System.out.println("Result: " + weight.poundToKg(value));
                                break;
                        }
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 4:
                    isTrue = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("Thank you!!!!");
        sc.close();
    }
}