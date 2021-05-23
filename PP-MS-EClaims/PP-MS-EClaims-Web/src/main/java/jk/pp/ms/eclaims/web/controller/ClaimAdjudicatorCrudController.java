package jk.pp.ms.eclaims.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.eclaims.domain.ClaimAdjudicator;
import jk.pp.ms.eclaims.domain.ClaimAdjudicatorCrudDTO;
import jk.pp.ms.eclaims.service.ClaimAdjudicatorCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/eclaims/claimadjudicator/crud", produces = "application/json")
public class ClaimAdjudicatorCrudController extends AppCrudController<ClaimAdjudicator, ClaimAdjudicatorCrudDTO> {

	@Autowired
	public ClaimAdjudicatorCrudController(ClaimAdjudicatorCrudService service) {
		super.setCrudService(service);
	}
}
