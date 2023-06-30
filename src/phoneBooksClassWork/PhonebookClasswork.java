package phoneBooksClassWork;
// this code is called malicious code because this code is use to keep track of user password without them knowing.
public class PhonebookClasswork {
    private  boolean isLocked  = true;
    private String password;
    private String username;

    public PhonebookClasswork( String username,String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }
    private void unlockedPhonebook(){
        isLocked = false;
    }

    public void unlockWith(String password) {
        boolean passwordIsCorrect = this.password.equals(password);
        if (passwordIsCorrect) unlockedPhonebook();


    }

}
