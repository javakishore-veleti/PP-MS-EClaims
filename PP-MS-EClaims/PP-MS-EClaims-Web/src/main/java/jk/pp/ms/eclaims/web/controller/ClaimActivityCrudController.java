package jk.pp.ms.eclaims.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.eclaims.domain.ClaimActivity;
import jk.pp.ms.eclaims.domain.ClaimActivityCrudDTO;
import jk.pp.ms.eclaims.service.ClaimActivityCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/eclaims/claimactivity/crud", produces = "application/json")
public class ClaimActivityCrudController extends AppCrudController<ClaimActivity, ClaimActivityCrudDTO> {

	@Autowired
	public ClaimActivityCrudController(ClaimActivityCrudService service) {
		super.setCrudService(service);
	}
}
