package cristinauzunov.u5d2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import cristinauzunov.u5d2.entities.Menu;

@SpringBootApplication
public class U5D2Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(U5D2Application.class, args);

        Menu menu = context.getBean(Menu.class);

        System.out.println(menu);
    }

}