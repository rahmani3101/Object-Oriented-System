import java.util.Scanner;

class MonthMessage {
    // Method to print the appropriate message based on the month
    public void printMessage(int month) {
        if (month == 1) {
            System.out.println("Happy New Year! January is the start of new beginnings.");
        } else if (month == 2) {
            System.out.println("February: The month of love and friendship.");
        } else if (month == 3) {
            System.out.println("March: Spring is coming!");
        } else if (month == 4) {
            System.out.println("April: Time for showers and flowers.");
        } else if (month == 5) {
            System.out.println("May: The flowers are in full bloom!");
        } else if (month == 6) {
            System.out.println("June: Summer is here!");
        } else if (month == 7) {
            System.out.println("July: Let's enjoy the summer sunshine.");
        } else if (month == 8) {
            System.out.println("August: The height of summer!");
        } else if (month == 9) {
            System.out.println("September: Fall is on the horizon.");
        } else if (month == 10) {
            System.out.println("October: The month of Halloween!");
        } else if (month == 11) {
            System.out.println("November: Time for thanks and giving.");
        } else if (month == 12) {
            System.out.println("December: The month of holiday joy!");
        } else {
            System.out.println("Invalid month! Please enter a number between 1 and 12.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the MonthMessage class
        MonthMessage monthMessage = new MonthMessage();

        // Ask user to input the month
        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        // Call the method to print the message based on the input
        monthMessage.printMessage(month);

        scanner.close();
    }
}
