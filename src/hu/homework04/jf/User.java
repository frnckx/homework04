package hu.homework04.jf;

/**
 * Created by java1 on 2017.12.04..
 */
public class User {
    private int id;
    private String firstname;
    private String lastname;
    private String password;
    private int age;

    public User() {} /* üres konstruktor*/

    public User(int id, String firstname, String lastname, String password, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.age = age;
    }
    public User(User user){
        this.firstname = user.firstname;
        this.lastname = user.lastname;
        this.password = user.password;
        this.age = user.age;
    }

    public String getFirstname(){
        return firstname;
    }
    public String setFirstName (String firstname){
        return this.firstname = firstname;
    }
    public String getLastname (){
        return lastname;
    }
    public String setLastname (String lastname){
        return this.lastname = lastname;
    }
    public String getPassword (){
        return password;
    }
    public String setPassword (String password){
        return this.password = password;
    }
    public int getAge (){
        return age;
    }
    public int setAge (int age){
        return this.age = age;
    }
    public int getId(){ return id;}
    public void setId (int id){this.id = id;}



}
