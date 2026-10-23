package LogicBuildingLevel4;
// Take a password string and check basic rules (length ≥ 8 and contains at least one
public class Logic000010 {
    public static void main(String[] args) {
        String password = "Hameed0022@";

        boolean hasDigit = false, hasUpper = false, hasLower = false, hasSpecial = false;
        for(int i =0;i<password.length();i++){
            char c = password.charAt(i);
            if(Character.isDigit(c)) hasDigit =true;
            else if(Character.isUpperCase(c)) hasUpper = true;
            else if(Character.isLowerCase(c)) hasLower = true;
            else hasSpecial = true;
        }
        if(password.length() >= 8 && hasDigit && hasLower && hasSpecial && hasUpper)System.out.println("Valid password");
        else System.out.println("Invalid password");
    }
}
