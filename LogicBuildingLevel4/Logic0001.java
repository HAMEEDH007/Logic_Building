package LogicBuildingLevel4;
// Take a character and check if it is a letter, a digit, or neither
public class Logic0001 {
    public static void main(String[] args) {
        char c ='8';
        if(Character.isLetter(c)){
            System.out.println("is a character ");
        }else if (Character.isDigit(c)){
            System.out.println("is a digit");
        }
        else{
            System.out.println("neither");
        }
    }
}
