package LogicBuildingLevel3;

public class Logic003 {
    public static void main(String[] args) {
        int number = 1411;
        int thousands = number / 1000;
        int ones = number % 10;
        if(thousands == ones) System.out.println("equal");
        else System.out.println("Not equal");
    }
}
