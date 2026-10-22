package LogicBuildingLevel3;
// Check if a number is a multiple of 7 or ends with 7.
public class Logic005 {
    public static void main(String[] args) {
        int number = 343;
        // int ones = number % 10;
        if(number % 7 == 0){
            System.out.println("Yes number is divisible by 7");
        }
        else{
            System.out.println("No it not divisible by 7");
        }
    }
}
