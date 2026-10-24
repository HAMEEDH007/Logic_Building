package LogicBuildingLevel5;
// Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the
// origin
public class Logic1k {
    public static void main(String[] args) {
        int x = 3;
        int y =0;
        if(x != 0 && y == 0 ){
            System.out.println("point lies on Y - axis");
        }
        else if(x ==0 && y != 0){
            System.out.println("point lies on x -axis");
        }else if (x ==0 && y==0){
            System.out.println("point lies at origin");
        }
        else {
            System.out.println("not point lies on any axises or at origin");
        }
    }
}
