package comkrohn.smartds.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApplication.class, args);
    }

    
    
    /*
    public ConfigServiceApplication() {
        throw new Error("Unresolved compilation problems: \n\tThe type java.lang.Object cannot be resolved. It is indirectly referenced from required .class files\n\tThe type java.lang.Class cannot be resolved. It is indirectly referenced from required .class files\n\tThe declared package \"com.dailycodebuffer.configserver\" does not match the expected package \"src.main.java.com.dailycodebuffer.configserver\"\n\tThe import org cannot be resolved\n\tThe import org cannot be resolved\n\tThe import org cannot be resolved\n\tSpringBootApplication cannot be resolved to a type\n\tEnableConfigServer cannot be resolved to a type\n\tImplicit super constructor Object() is undefined for default constructor. Must define an explicit constructor\n\tString cannot be resolved to a type\n\tSpringApplication cannot be resolved\n");
    }
    */
}
