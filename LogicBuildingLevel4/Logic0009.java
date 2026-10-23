package LogicBuildingLevel4;

// Take electricity units consumed and calculate the bill as per slabs (using if-else).
public class Logic0009 {
    public static void main(String[] args) {
        int units = 68;

        int bill = 0;
        if (units < 0) {
            System.out.println("Invalid units");

        } else if (units <= 100) {
            bill = units * 2;
            System.out.println(bill);
        } else if (units <= 200) {
            bill = units * 2 + (units - 100) * 3;

            System.out.println(bill);
        } else if (units <= 300) {
            bill = units * 2 + units * 5 + (units - 200) * 7;
            System.out.println(bill);
        }
        // System.out.println(bill);
    }
}
