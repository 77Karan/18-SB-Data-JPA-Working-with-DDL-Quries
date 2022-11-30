package in.ashokit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.InsurancePlan;
import in.ashokit.repository.InsuranceRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
	  ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	  InsuranceRepository repo = context.getBean(InsuranceRepository.class);
	  InsurancePlan plan = new InsurancePlan(2311,"Kottigobba",1300);
	  repo.save(plan);
	}

}
