package LogicBuildingLevel2;

// Take a month number (1–12) and print the number of days in that month (ignore leap
// years).
public class Logic010{
    public static void main(String[] args) {
        int month =10;
        int daysMonths = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalArgumentException("Month must be between 1 and 12");
        };
        System.out.println(daysMonths);

    }
}