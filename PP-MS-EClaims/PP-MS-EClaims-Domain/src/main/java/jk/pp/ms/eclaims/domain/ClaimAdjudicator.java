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
@Entity(name = "ClaimAdjudicator")
@Table(name = "claim_adjudicator")
public class ClaimAdjudicator extends BaseDomain {

	private static final long serialVersionUID = 1L;

	@Column(name = "claim_pk")
	private Long claimPK;

	@Column(name = "member_pk")
	private Long memberPK;

	@Column(name = "adjudicator_pk")
	private Long adjudicatorPK;

	@Column(name = "assigned_on")
	private Date assignedOn;

}
