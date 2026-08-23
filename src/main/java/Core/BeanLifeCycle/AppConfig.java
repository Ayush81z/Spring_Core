package Core.BeanLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    //not used in the current work flow (JFN)
//    @Bean(initMethod = "start")
//    public CartService getCartBean() {
//        return new CartService();
//    }
}
