package guru.springframework.config;

import javax.activation.DataSource;

import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
@Profile("cloud")
public class DatabaseConfig {
	
	 @Bean
	  public Cloud cloud() {
	    return new CloudFactory().getCloud();
	  }

	  @Bean	
	  public DataSource dataSource() {
	    return cloud().getSingletonServiceConnector(DataSource.class, null);
	  }
}
