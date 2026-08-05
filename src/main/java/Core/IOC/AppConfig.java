package Core.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // acts as a source of bean defination
@ComponentScan("Core.IOC") //search the whole package and see which classes has @component , manage the beans of them
public class AppConfig {

    @Bean //creates a object
    public User createUser() {
        return new User("Randy", 45);
    }
}
