package LogicBuildingLevel5;

// import java.util.Collection;

// Take time (hours and minutes) and print the smaller angle between the hour and minute hands.
public class Logic4k {
    public static void main(String[] args) {
        double hour = 1;
        double minute = 59;
         
        double minuteHandAngle = minute * 6;
        double hourHandAngle = (hour * 30) + (minute * 0.5);
        double Diffrence = Math.abs(hourHandAngle - minuteHandAngle);
        if(Diffrence <= 180) System.out.println(Diffrence);
        else System.out.println(Math.abs(360-Diffrence));
    }
}
