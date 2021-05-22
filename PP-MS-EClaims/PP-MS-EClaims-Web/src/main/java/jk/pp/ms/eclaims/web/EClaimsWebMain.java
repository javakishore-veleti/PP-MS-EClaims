package jk.pp.ms.eclaims.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import jk.pp.ms.commons.configs.MSCommonGlobalConfig;
import jk.pp.ms.commons.configs.MSType;

@SpringBootApplication
@Import(MSCommonGlobalConfig.class)
public class EClaimsWebMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(EClaimsWebMain.class);
		app.setAdditionalProfiles(MSCommonGlobalConfig.buildAMSStartupProfiles(MSType.ECLAIMS));

		app.run(args);
	}

}