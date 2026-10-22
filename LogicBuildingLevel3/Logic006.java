package LogicBuildingLevel3;
// Take coordinates (x, y) and determine which quadrant the point lies in.
public class Logic006 {
    public static void main(String[] args) {
        int x = 1;
        int y = -3;
        if(x >0 && y >0) System.out.println("1st quadrant");
        else if(x<0 && y>0) System.out.println("2nd quandrant");
        else if(x<0 && y <0) System.out.println("3rd quadrant");
        else System.out.println("4th quadrant");
    }
}
