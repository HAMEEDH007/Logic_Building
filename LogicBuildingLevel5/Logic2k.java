package LogicBuildingLevel5;
// Take three numbers and check if they can form a Pythagorean triplet
public class Logic2k {
    public static void main(String[] args) {
        int a =3;
        int b = 4;
        int c = 5;
        if((a*a) + (b*b) == (c*c)){
            System.out.println("its a pythagorean triplet");
        }else {
            System.out.println("its not a pythagorean triplet");
        }
    }
}
