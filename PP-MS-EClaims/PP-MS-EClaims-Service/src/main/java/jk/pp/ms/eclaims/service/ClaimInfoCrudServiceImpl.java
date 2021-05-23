package jk.pp.ms.eclaims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.eclaims.dao.ClaimInfoDAO;
import jk.pp.ms.eclaims.domain.ClaimInfo;
import jk.pp.ms.eclaims.domain.ClaimInfoCrudDTO;

@Service
public class ClaimInfoCrudServiceImpl extends AppCrudServiceImpl<ClaimInfo, ClaimInfoCrudDTO>
		implements ClaimInfoCrudService {

	public static final String BEAN_ID = ClaimInfoCrudServiceImpl.class.getSimpleName();

	@Autowired
	public ClaimInfoCrudServiceImpl(ClaimInfoDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
