package jk.pp.ms.eclaims.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.eclaims.domain.ClaimInfo;
import jk.pp.ms.eclaims.domain.ClaimInfoCrudDTO;
import jk.pp.ms.eclaims.service.ClaimInfoCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/eclaims/claiminfo/crud", produces = "application/json")
public class ClaimInfoCrudController extends AppCrudController<ClaimInfo, ClaimInfoCrudDTO> {

	@Autowired
	public ClaimInfoCrudController(ClaimInfoCrudService service) {
		super.setCrudService(service);
	}
}
