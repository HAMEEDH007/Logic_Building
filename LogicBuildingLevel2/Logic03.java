package LogicBuildingLevel2;
// Take marks (0–100) and print the corresponding grade (A/B/C/D/F).
public class Logic03 {
    
    public static void main(String[] args) {
        int marks = 89;
        if(marks >=90) System.out.println("A");
        else if(marks >= 75) System.out.println("B");
        else if(marks >= 60) System.out.println("C");
        else if(marks >= 40) System.out.println("D");
        else System.out.println("F");
       
    }
}
