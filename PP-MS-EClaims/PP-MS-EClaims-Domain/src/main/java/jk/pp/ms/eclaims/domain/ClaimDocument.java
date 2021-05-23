package jk.pp.ms.eclaims.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import jk.pp.engg.foundations.common.domain.core.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "ClaimDocument")
@Table(name = "claim_document")
public class ClaimDocument extends BaseDomain {

	private static final long serialVersionUID = 1L;

	@Column(name = "claim_pk")
	private Long claimPK;

	@Column(name = "member_pk")
	private Long memberPK;

	@Column(name = "document_location", length = 300)
	private String documentLocation;

	@Column(name = "document_type", length = 30)
	private String documentType;

	@Column(name = "received_on")
	private Date receivedOn;

}
