import java.util.Scanner;
public class DayOfWeekTest {
    // Define the enumeration
    public enum DayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        // Method to check if it's a workday
        public boolean isWorkday() {
            switch (this) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    return true;
                default:
                    return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week (e.g., Monday): ");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            DayOfWeek day = DayOfWeek.valueOf(input);
	    if(day.isWorkday())
		System.out.println("Is a "+day+ " workday? Yes. Its Working day");
	    else
		System.out.println("Is a "+day+ " workday? No. Its Holiday");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered. Please enter a valid day (e.g., Monday, Tuesday, etc.).");
        }

        scanner.close();
    }
}
