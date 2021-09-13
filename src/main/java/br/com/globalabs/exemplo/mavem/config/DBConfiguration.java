package br.com.globalabs.exemplo.mavem.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Configuration
//@ConfigurationProperties("spring.datasource")
//@Getter
//@Setter
public class DBConfiguration {

    /*private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDatabaseConnection(){
        System.out.println("DB Connection for Dev-H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to H2-test";
    }

    @Profile("prod")
    @Bean
    public String productionDatabaseConnection(){
        System.out.println("DB Connection for production - MySql");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to MySql";
    }*/
}
