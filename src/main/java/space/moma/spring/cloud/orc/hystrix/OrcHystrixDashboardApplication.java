package space.moma.spring.cloud.orc.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class OrcHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrcHystrixDashboardApplication.class, args);
	}
}
