package Tasks;

import java.util.Scanner;

public class Online_Reservation_System {
    static String username = "Rushi-garud";
    static String password = "Rushi@123";
    static String trainName;
    static String classType;
    static String dateOfJourney;
    static String fromPlace;
    static String toDestination;
    static int pnrNumber;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = input.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
                System.out.println("===================");
                System.out.println("\nAccess granted!\n");
                System.out.println("===================");
                System.out.println("===================");
                System.out.println("1. Reservation System");
                System.out.println("===================");
                System.out.println("===================");
                System.out.println("2. Cancellation Form");
                System.out.println("===================");
                System.out.print("\nEnter your choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("\nReservation System");
                        System.out.print("Enter train name: ");
                        trainName = input.nextLine();
                        System.out.print("Enter class type: ");
                        classType = input.nextLine();
                        System.out.print("Enter date of journey: ");
                        dateOfJourney = input.nextLine();
                        System.out.print("Enter from place: ");
                        fromPlace = input.nextLine();
                        System.out.print("Enter to destination: ");
                        toDestination = input.nextLine();
                        System.out.println("============================");
                        System.out.println("\nData inserted successfully");
                        System.out.println("============================");
                        break;
                    case 2:
                        System.out.print("Enter PNR number: ");
                        pnrNumber = input.nextInt();
                        System.out.println("\nEntered PNR number: " + pnrNumber);
                        System.out.println("Train name: " + trainName);
                        System.out.println("Class type: " + classType);
                        System.out.println("Date of journey: " + dateOfJourney);
                        System.out.println("From place: " + fromPlace);
                        System.out.println("To destination: " + toDestination);
                        System.out.print("\nDo you want to confirm cancellation (yes/no)? ");
                        String confirmation = input.nextLine();
                        if (confirmation.equals("yes")) {
                            System.out.println("========================");
                            System.out.println("\nCancellation confirmed");
                            System.out.println("========================");
                        } else {
                            System.out.println("========================");
                            System.out.println("\nCancellation cancelled");
                            System.out.println("========================");
                        }
                        break;
                    default:
                        System.out.println("================");
                        System.out.println("\nInvalid choice");
                        System.out.println("================");
                }
            } else {
                System.out.println("===============");
                System.out.println("\nAccess denied");
                System.out.println("===============");
            }
        }
    }

