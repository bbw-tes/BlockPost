package bbw.sabina.Model;

public class Post {
    //Attribute
    private int id;
    private String title;
    private String content;
    private User user;
}

//Konstruktor
public Post(String title, String content) {
    this.title = title;
    this.content = content;
    this.user = user;
}

//Getter
public int getId(){
    return id;
}

public String getTitle(){
    return title;
}

public String getContent(){
    return content;
}

//Setter
public void setTitle(String title){
    this.title = title;
}

public void setContent(String content){
    this.content = content;
}