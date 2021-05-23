package jk.pp.ms.eclaims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.eclaims.dao.ClaimDocumentDAO;
import jk.pp.ms.eclaims.domain.ClaimDocument;
import jk.pp.ms.eclaims.domain.ClaimDocumentCrudDTO;

@Service
public class ClaimDocumentCrudServiceImpl extends AppCrudServiceImpl<ClaimDocument, ClaimDocumentCrudDTO>
		implements ClaimDocumentCrudService {

	public static final String BEAN_ID = ClaimDocumentCrudServiceImpl.class.getSimpleName();

	@Autowired
	public ClaimDocumentCrudServiceImpl(ClaimDocumentDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
