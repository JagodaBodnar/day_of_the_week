import java.util.Scanner;

public class DayOfTheWeek {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int index = getNumber();
        scanner.close();
        printTheDayOfTheWeek(index, daysOfTheWeek);
    }

    public static int getNumber() {
        int number;
        do {
            System.out.println("Enter the number from range <1,7>: ");
            number = scanner.nextInt();
            if (number < 1 || number > 7) {
                System.out.println("You have entered wrong number. Try again.");
            }
        } while (number < 1 || number > 7);
        return number;
    }

    public static void printTheDayOfTheWeek(int index, String[] daysOfTheWeek) {
        System.out.printf("Corresponding day of the week: %s", daysOfTheWeek[index - 1]);
    }
}
