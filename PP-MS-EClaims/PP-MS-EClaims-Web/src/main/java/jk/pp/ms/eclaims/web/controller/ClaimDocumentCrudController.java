package jk.pp.ms.eclaims.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.eclaims.domain.ClaimDocument;
import jk.pp.ms.eclaims.domain.ClaimDocumentCrudDTO;
import jk.pp.ms.eclaims.service.ClaimDocumentCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/eclaims/claimdocument/crud", produces = "application/json")
public class ClaimDocumentCrudController extends AppCrudController<ClaimDocument, ClaimDocumentCrudDTO> {

	@Autowired
	public ClaimDocumentCrudController(ClaimDocumentCrudService service) {
		super.setCrudService(service);
	}
}
