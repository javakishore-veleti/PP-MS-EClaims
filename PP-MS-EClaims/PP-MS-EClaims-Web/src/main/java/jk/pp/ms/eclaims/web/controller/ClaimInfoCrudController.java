package jk.pp.ms.eclaims.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

	@Override
	public List<ClaimInfoCrudDTO> populateInitialDataDomais() {

		List<ClaimInfoCrudDTO> initialDataDomains = new ArrayList<ClaimInfoCrudDTO>();

		ClaimInfoCrudDTO crudDTO = null;
		ClaimInfo asset = null;

		Random randomGenerator = new Random();

		for (int ctr = 1; ctr <= 10; ++ctr) {
			crudDTO = new ClaimInfoCrudDTO();

			asset = new ClaimInfo();

			asset.setMemberPK((long) randomGenerator.nextInt(10));

			crudDTO.setDomain(asset);

			initialDataDomains.add(crudDTO);
		}

		return initialDataDomains;
	}
}
