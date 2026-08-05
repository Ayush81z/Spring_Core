package Core.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 //here it is confusing that name and age cant be defined directly
public class User {
    private String name;
    private int age;

    //here we cant just use the primitive to make spring create objects
    //we need to use @bean to create the object in AppConfig and parse it to this then spring manages from there
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
