package jk.pp.ms.eclaims.domain;

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
@Entity(name = "ClaimInfo")
@Table(name = "claim_info")
public class ClaimInfo extends BaseDomain {

	private static final long serialVersionUID = 1L;

	@Column(name = "member_pk")
	private Long memberPK;

}
