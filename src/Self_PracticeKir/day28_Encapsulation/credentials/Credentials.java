package Self_PracticeKir.day28_Encapsulation.credentials;

public class Credentials {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        boolean is8letterLong= false;
        boolean hasDigit = false;
        boolean hasLetter = false;
        boolean hasSpecial = false;
        if(password.length()>=8){
            is8letterLong = true;
        }
        for (char c : password.toCharArray()) {
            if(Character.isDigit(c)){
                hasDigit = true;
            }
            if(Character.isLetter(c)){
                hasLetter = true;
            }
            if(!Character.isLetterOrDigit(c)){
                hasSpecial = true;
            }

        }

            if(hasDigit&&hasLetter&&hasSpecial&&is8letterLong){
                this.password = password;
            }else{
                System.out.println("Password does not meet requirements");
                System.exit(0);
            }

    }

    public Credentials(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public static boolean isStrongPassWord(String password){
        boolean is8letterLong= false;
        boolean hasDigit = false;
        boolean hasLetter = false;
        boolean hasSpecial = false;

        if(password.length()>=8){
            is8letterLong = true;
        }
        for (char c : password.toCharArray()) {
            if(Character.isDigit(c)){
                hasDigit = true;
            }
            if(Character.isLetter(c)){
                hasLetter = true;
            }
            if(!Character.isLetterOrDigit(c)){
                hasSpecial = true;
            }

        }
        if(hasDigit&&hasLetter&&hasSpecial&&is8letterLong){
            return true;
        }
        return false;


    }





}
