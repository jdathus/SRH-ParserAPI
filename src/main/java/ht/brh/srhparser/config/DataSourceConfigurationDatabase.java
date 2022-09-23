package ht.brh.srhparser.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DataSourceConfigurationDatabase {
	
	//******** EASYCLOCKING CONFIGURATION
	@Bean(name ="easyclockingdatasource")
	@ConfigurationProperties(prefix="app.datasource.easyclocking")
    public DataSource easyclockingDS() {
        return (DataSource) DataSourceBuilder.create().build();
    }
	
	@Bean(name ="jdbcTemplateEasyclocking")
	  public JdbcTemplate jdbcTemplateEasyclocking(@Qualifier("easyclockingdatasource") DataSource ds) {
        return new JdbcTemplate (ds);
    }

	
	//******** TMS CONFIGURATION
    @Bean (name="tmsdatasource")
    @ConfigurationProperties(prefix="app.datasource.tms")
    public DataSource tmsDS() {
    	return (DataSource) DataSourceBuilder.create().build();
    }
    @Bean(name ="jdbcTemplateTms")
	  public JdbcTemplate jdbcTemplateTms(@Qualifier("tmsdatasource") DataSource ds) {
      return new JdbcTemplate (ds);
  }
    
   
   
}
