package Core.BeanLifeCycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

//@Component
public class UserService implements BeanNameAware {
    //this works after the Object creation and Instantiation and dependency resolve , then call the Aware Interface on its own

    public UserService() {
        System.out.println("User Service constructor called");
    }

    //spring calls on its own and sets the name : callback methods
    //we cant change the name of the method by calling it outside
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is :" + name);
    }
}
