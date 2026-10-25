package LogicBuildingLevel5;
// Take three numbers and check if they are in arithmetic progression.
public class Logic5k {
    public static void main(String[] args) {
        int a = 34;
        int b = 45;
        int c = 53;
        int n = 3;
        int d = b-a;
        int arithematic = a + (n-1)*d;
        if(b-a == c-b){
            System.out.println("They are in arithematic progression");
            System.out.println(arithematic);
        }else{
            System.out.println("They are not in Arithematic progress");
        }

        
        
    }
}
