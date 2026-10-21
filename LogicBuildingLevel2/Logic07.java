package LogicBuildingLevel2;
// Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

public class Logic07 {
    public static void main(String[] args) {
        System.out.println(checkOddEven.check());
    }
}

class checkOddEven{
    static String check(){
        int a = 20;
        int b =34;
        if(a % 2 == 0 && b%2 ==0) return "both are even";
        if(a%2 ==1 && b%2 == 1) return "both are odd";
        if((a%2 == 0 && b%2==1)||(a%2 ==1 && b%2 ==0)) return "one is even and one is odd";
        return "Both are zeros";
    }
}