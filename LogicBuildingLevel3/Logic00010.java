package LogicBuildingLevel3;
// Check whether a number is a perfect square (without using the square root function).
public class Logic00010 {
    public static void main(String[] args) {
        boolean isPerfectSquare = false;
        int number = 64;
        for(int i = 1;i*i <=number;i++){
            if(i*i ==number){
               isPerfectSquare = true; 
               break;
            }
            
        }
        if(isPerfectSquare) System.out.println("Perfect Square");
        else System.out.println("Not a Perfect Square");
        
    }
}
