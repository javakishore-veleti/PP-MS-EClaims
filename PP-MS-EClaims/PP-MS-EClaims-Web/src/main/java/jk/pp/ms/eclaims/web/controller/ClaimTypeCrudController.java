package jk.pp.ms.eclaims.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.eclaims.domain.ClaimType;
import jk.pp.ms.eclaims.domain.ClaimTypeCrudDTO;
import jk.pp.ms.eclaims.service.ClaimTypeCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/eclaims/claimtype/crud", produces = "application/json")
public class ClaimTypeCrudController extends AppCrudController<ClaimType, ClaimTypeCrudDTO> {

	@Autowired
	public ClaimTypeCrudController(ClaimTypeCrudService service) {
		super.setCrudService(service);
	}
}
