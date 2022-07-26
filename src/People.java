package src;

public class People {
    private int age;
    private String name;
    private String lastname;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    protected String GREET ="hello";

    protected String greet(){
        return GREET + "my name is "+ name;
    }


}
