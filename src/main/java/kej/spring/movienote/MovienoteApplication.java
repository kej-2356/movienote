package kej.spring.movienote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class}) //DB 설정안되있을시 부트 실행할때
public class MovienoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovienoteApplication.class, args);
	}

}
