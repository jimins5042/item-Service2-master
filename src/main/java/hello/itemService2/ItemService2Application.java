package hello.itemService2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan
@SpringBootApplication
public class ItemService2Application {

	public static void main(String[] args) {
		SpringApplication.run(ItemService2Application.class, args);
	}

}
