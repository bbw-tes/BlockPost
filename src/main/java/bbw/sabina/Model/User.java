package bbw.sabina.Model;

public class User {
    //Attribute
    private int id;
    private String username;
    private String password;
    private boolean isAdmin;    // true = Admin, false = normal User
}
//Konstruktor
public User(String username, String password, boolean role ){
    this.username = username;
    this.password = password;
    this.isAdmin = isAdmin;
}

// Getter
public int getId() {
    return id;
}

public String getUsername() {
    return username;
}

public String getPassword() {
    return password;
}

public boolean getisAdmin() {
    return isAdmin;
}

// Setter
public void setUsername(String username){
    this.username = username;
}

public void password(String password) {
    this.password = password;
}




