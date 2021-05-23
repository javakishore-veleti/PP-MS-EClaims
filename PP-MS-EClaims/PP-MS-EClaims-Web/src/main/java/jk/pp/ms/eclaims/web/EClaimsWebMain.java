package jk.pp.ms.eclaims.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jk.pp.ms.commons.configs.MSCommonGlobalConfig;
import jk.pp.ms.commons.configs.MSType;

@SpringBootApplication
@ComponentScan(basePackages = { "jk.pp.ms.eclaims.domain", "jk.pp.ms.eclaims.dao", "jk.pp.ms.eclaims.service",
		"jk.pp.ms.eclaims.web" })
@EntityScan(basePackages = { "jk.pp.ms.eclaims.domain" })
@EnableJpaRepositories(basePackages = { "jk.pp.ms.eclaims.dao" })
@Import(value = { MSCommonGlobalConfig.class })
public class EClaimsWebMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(EClaimsWebMain.class);
		app.setAdditionalProfiles(MSCommonGlobalConfig.buildAMSStartupProfiles(MSType.ECLAIMS));

		app.run(args);
	}

}