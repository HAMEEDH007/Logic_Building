package LogicBuildingLevel3;

public class Logic002 {
    public static void main(String[] args) {
        int number = 142;
        int hundred = number / 100;
        int tens = (number /10) % 10;
        int ones = number %10;
        // System.out.println(tens);
        if(tens > hundred && tens > ones ){
            System.out.println("largest digit");
        }else if(tens < hundred && tens < ones){
            System.out.println("smallest digit");
        }
        else {
            System.out.println("neither");
        }
    }
}
