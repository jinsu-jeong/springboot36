package ksmart36.mybatis;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMybatisApplication {

	
	private static final Logger log = LoggerFactory.getLogger(SpringbootMybatisApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
		log.info("info 레벨");
		log.debug("debug 레벨");
		log.error("error 레벨");
		
	}

}
