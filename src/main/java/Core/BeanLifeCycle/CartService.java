package Core.BeanLifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class CartService /*implements InitializingBean*/ implements DisposableBean {
    Map<Integer, String> map;

    public CartService() {
        map = new HashMap<>();
        System.out.println("CartService Constructor called !");
    }

    //called by spring through AppConfig's bean's init method
//    public void start() {
//        System.out.println("Bean is ready ");
//        map.put(1, "Adi");
//        map.put(2, "roh");
//    }

    //to mark a method that must run exactly once, immediately after dependency injection is complete, but before the object is put into service.
    @PostConstruct
    public void start2() {
        System.out.println("Bean is ready ");
        map.put(1, "Adi");
        map.put(2, "roh");
    }

//    It marks a method that should be executed just before an object or bean is removed or destroyed by its container, making it ideal for cleanup tasks
    @PreDestroy
    public void stop() {
        System.out.println("Bean is getting destroyed via the PreDestroy");
        map.clear();
    }


    //this is  called during initializing step
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initiaalization call back");
//        map.put(1, "Aditya");
//        map.put(2 , "ROhit");
//    }

    public String getValue(int key) {
        return map.get(key);
    }

    @Override
    public void destroy() throws Exception {
        map.clear();
        System.out.println("Bean is getting destoyed !");
    }
}
