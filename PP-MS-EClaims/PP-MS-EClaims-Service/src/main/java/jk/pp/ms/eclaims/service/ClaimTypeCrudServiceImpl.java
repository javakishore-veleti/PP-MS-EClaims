package jk.pp.ms.eclaims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.eclaims.dao.ClaimTypeDAO;
import jk.pp.ms.eclaims.domain.ClaimType;
import jk.pp.ms.eclaims.domain.ClaimTypeCrudDTO;

@Service
public class ClaimTypeCrudServiceImpl extends AppCrudServiceImpl<ClaimType, ClaimTypeCrudDTO>
		implements ClaimTypeCrudService {

	public static final String BEAN_ID = ClaimTypeCrudServiceImpl.class.getSimpleName();

	@Autowired
	public ClaimTypeCrudServiceImpl(ClaimTypeDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
