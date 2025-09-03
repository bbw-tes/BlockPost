package bbw.sabina.Model;

public class User {
    //Attribute
    private int id;
    private String username;
    private String password;
    private boolean role;    // true = Admin, false = normal User
}

public User(int id, String username, String password, String role ){
    this.id = id;
    this.username = username;
    this.password = password;
    this.role = role;
}

// Getter
public int getId() {
    return id;
}

public String getusername {
    return username;
}

public String getpassword {
    return password;
}

public boolean getRole {
    return role;
}

// Setter
public void setUsername(String username){
    this.username = username;
}

public void password(String password) {
    this.password = password;
}




