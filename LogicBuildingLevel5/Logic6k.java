package LogicBuildingLevel5;
// Take three numbers and check if they are in geometric progression.
public class Logic6k {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 18;

        if(b/a == c/b ){
            System.out.println("They are in geomentric progression");
        }else{
            System.out.println("They are not in geomentric progression");
        }
    }
}
