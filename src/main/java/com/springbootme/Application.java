package com.springbootme;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.springbootme.repository.OrganizationRepository;
import com.springbootme.repository.UserRepositoryJustin;
import com.springbootme.social.config.AppProperties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class Application {

	@Autowired
	private OrganizationRepository orgRepo;
	@Autowired
	private UserRepositoryJustin repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

//		Organization org = 
//				Organization.builder()
//					.active(true)
//					.orgName("Justin Inc.")
//					.description("test org")
//					//.id(UUID.fromString("2314ea3b-0913-4842-aefe-d2a09b134f93"))
//					.build();
//		
//		orgRepo.save(org);
//		
//		User u = User.builder().email("j@j.com").firstName("justin").lastName("hancock").id(UUID.randomUUID()).build();
//		u.setOrganization(org);
//		u.addRole(Role.USER, u);
//		repo.save(u);

		return args -> {

			log.info("Starting up");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);

			if (System.getProperty("showBeans") != null) {
				for (String beanName : beanNames) {
					System.out.println(beanName);
				}
			}

		};

	}

}
