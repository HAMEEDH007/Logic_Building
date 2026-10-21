package LogicBuildingLevel2;
// Take the hour of the day (0–23) and print “Good Morning”,“Good Afternoon”,“GoodEvening”, or “Good Night”

public class Logic05 {
    public static void main(String[] args) {
        System.out.println(DayTime.Greet());
    }
}

class DayTime{
    static String Greet(){
        int hour = 12;
        if (hour >=0 && hour <12) return "Good Morning";
        if(hour >=12 && hour <=17) return "Good Afternoon";
        if(hour >17 && hour <=20) return "Good Evening";
        return "Good Night";
    }
}