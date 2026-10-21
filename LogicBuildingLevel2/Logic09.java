package LogicBuildingLevel2;
// Take a day number (1–7) and print the corresponding day name.
public class Logic09 {
    public static void main(String[] args) {
        int day = 7;
       String dayName =  switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day";
        };
        System.out.println(dayName);
    }
}
