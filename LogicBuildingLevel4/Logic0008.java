package LogicBuildingLevel4;
// Take a weekday number (1–7) and determine if it is a weekday or weekend.
public class Logic0008 {
    public static void main(String[] args) {
        int day = 1;
        if(day == 6 || day == 7){
            System.out.println("WEEKEND");
        }else{
            System.out.println("WEEKDAY");
        }
    }
}
