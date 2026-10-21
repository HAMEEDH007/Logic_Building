package LogicBuildingLevel2;
// Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.
public class Logic08 {
    public static void main(String[] args) {
        char c = 'a';

        if(c >= 'a' && c <= 'm') System.out.println("Between a and m");
        else if(c>='n' && c <= 'z') System.out.println("Between n and z");
        else System.out.println("Not a lowercase alphabet");
    }
}
