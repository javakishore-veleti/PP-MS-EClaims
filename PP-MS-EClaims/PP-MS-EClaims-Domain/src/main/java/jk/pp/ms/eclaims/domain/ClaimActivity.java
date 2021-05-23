package jk.pp.ms.eclaims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import jk.pp.engg.foundations.common.core.domain.claims.IClaimInfo;
import jk.pp.engg.foundations.common.domain.core.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "ClaimActivity")
@Table(name = "claim_activity")
public class ClaimActivity extends BaseDomain implements IClaimInfo {

	private static final long serialVersionUID = 1L;

	@Column(name = "claim_pk")
	private Long claimPK;

	@Column(name = "member_pk")
	private Long memberPK;

	@Column(name = "activity_type", length = 30)
	private String activityType;

	@Column(name = "description", length = 300)
	private String description;

	@Column(name = "owner_pk")
	private Long ownerPK;

	@Column(name = "comments", length = 300)
	private String comments;

}
