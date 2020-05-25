public class userType {
    private String email, password, username;
    private int contact;

    public String getEmail() {
        return email;
    }

    public void newEmail (String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void newPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void newUsername (String username) {
        this.username = username;
    }







    public int getContact() {
        return contact;
    }

    public void newContact (int contact){
        this.contact = contact;
    }

    public userType(String email, String password, String username){
        this.email = email;
        this.password = password;
        this.username = username;

    }

    public userType(int contact){
        this.contact = contact;
    }
}