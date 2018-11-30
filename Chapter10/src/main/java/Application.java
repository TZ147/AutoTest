import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by yuchen on 2018/11/27
 */
@SpringBootApplication
@ComponentScan("com.course")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
