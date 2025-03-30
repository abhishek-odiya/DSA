package DSA.Oops;

// package -> package ki help se ham ek class ki information ko ham dusre package ki class mai use kar sakte hai

//Access Modifier
//public -> Access from any where
//private -> Only here own class can access
//protected -> ise sirf subClasses access kar sakte hai
// Default -> jaha kuch nahi hota waha default hota hai[You can access only in the same file]

// Abstraction -> Hiding the internal details and showing the functionality

class Account{
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Abhishek Odiya";
        account1.email = "abhishekOdiya@outlook.com";
        account1.setPassword("abhi");
        System.out.println(account1.getPassword());
    }
}
