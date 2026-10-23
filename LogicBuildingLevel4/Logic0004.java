package LogicBuildingLevel4;
// Take 24-hour time (hours and minutes) and print whether it is AM or PM.
public class Logic0004 {
    public static void main(String[] args) {
        int hours = 13;
        if(hours > 23 && hours < 0 ){
            System.out.println("Invaild time");
        }else if(hours <12){
            System.out.println(hours+" AM");
        }else{
            System.out.println(hours+" PM");
        }
    }
}