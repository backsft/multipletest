/*


package com.LogginSystem.UseFilter;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
public class SecurityFilterchainTest {	
	
	// @Autowired
	//    private Environment environment;
	
	 @Bean
		  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
			http
					
					.csrf(AbstractHttpConfigurer::disable);
			// CORS Configuration
	        http.cors().configurationSource(request -> {
	            CorsConfiguration corsConfig = new CorsConfiguration();
	            corsConfig.setAllowedHeaders("/"); // Replace with your frontend origin
	            corsConfig.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
	            corsConfig.setAllowedHeaders(List.of("*"));
	            corsConfig.setAllowCredentials(true);
	            return corsConfig;
	        });

			return http.build();
		}

}


*/
