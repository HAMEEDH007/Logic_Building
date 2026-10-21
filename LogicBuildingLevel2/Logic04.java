package LogicBuildingLevel2;
// Check if one of two given numbers is a multiple of the other.
public class Logic04 {
    public static void main(String[] args) {
    System.out.println( Checkmultiple.checkmultiple());
    }
}

class Checkmultiple{
    static String checkmultiple(){
        int a =5;
        int b = 7;
        if(a ==0 || b ==0) return "Yes";
        if(a ==0 && b != 0 || a != 0 && b==0) return "Yes";
        if(a % b == 0 || b % a == 0) return "Yes";
        return "No";
    }
}