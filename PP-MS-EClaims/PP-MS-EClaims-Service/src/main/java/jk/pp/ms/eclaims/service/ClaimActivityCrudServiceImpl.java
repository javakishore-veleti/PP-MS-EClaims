package jk.pp.ms.eclaims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.eclaims.dao.ClaimActivityDAO;
import jk.pp.ms.eclaims.domain.ClaimActivity;
import jk.pp.ms.eclaims.domain.ClaimActivityCrudDTO;

@Service
public class ClaimActivityCrudServiceImpl extends AppCrudServiceImpl<ClaimActivity, ClaimActivityCrudDTO>
		implements ClaimActivityCrudService {

	public static final String BEAN_ID = ClaimActivityCrudServiceImpl.class.getSimpleName();

	@Autowired
	public ClaimActivityCrudServiceImpl(ClaimActivityDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
