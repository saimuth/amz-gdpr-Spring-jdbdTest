package amz.gdpr.HerokuJdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;



import amz.gdpr.HerokuJdbcTemplate.dao.HerokuJdbcTemplateTestDaoImpl;

@SpringBootApplication
public class HerokuJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuJdbcTemplateApplication.class, args);
	}

}

@Component
class DemoCommandLineRunner implements CommandLineRunner{

	@Autowired
	private HerokuJdbcTemplateTestDaoImpl herokuJdbcTemplateTestDaoImpl;

	@Override
	public void run(String... args) throws Exception {

		
		herokuJdbcTemplateTestDaoImpl.updateData();
		System.out.println("End of call");
	}
}