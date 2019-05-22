import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Package: PACKAGE_NAME
 * @ClassName: Application
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/5/22 17:52
 */
@EnableAutoConfiguration
@ComponentScan("com.yixin")
public class Application {
           public static void main(String[] args) {
        SpringApplication.run(Application.class);
         }
        }