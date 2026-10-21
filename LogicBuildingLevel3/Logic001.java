package LogicBuildingLevel3;

public class Logic001 {
    public static void main(String[] args) {
        int number = 111;
        int hundred = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        if(hundred != tens && tens != ones && hundred != ones) System.out.println("ALL numbers are distinct");
        else System.out.println("Digits are not distinct");
    }
    
}
