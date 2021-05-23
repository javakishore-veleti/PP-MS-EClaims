package jk.pp.ms.eclaims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.eclaims.dao.ClaimAdjudicatorDAO;
import jk.pp.ms.eclaims.domain.ClaimAdjudicator;
import jk.pp.ms.eclaims.domain.ClaimAdjudicatorCrudDTO;

@Service
public class ClaimAdjudicatorCrudServiceImpl extends AppCrudServiceImpl<ClaimAdjudicator, ClaimAdjudicatorCrudDTO>
		implements ClaimAdjudicatorCrudService {

	public static final String BEAN_ID = ClaimAdjudicatorCrudServiceImpl.class.getSimpleName();

	@Autowired
	public ClaimAdjudicatorCrudServiceImpl(ClaimAdjudicatorDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
