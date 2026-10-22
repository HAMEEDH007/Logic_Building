package LogicBuildingLevel3;

public class Logic007 {
    public static void main(String[] args) {
        int amount = 2067;
        if(amount % 2000 ==0 && amount % 500 == 0 && amount % 100 == 0) System.out.println("Yes the amount can be evenly divided by 2000 , 500,&100");
        else System.out.println("No");
    }
}
