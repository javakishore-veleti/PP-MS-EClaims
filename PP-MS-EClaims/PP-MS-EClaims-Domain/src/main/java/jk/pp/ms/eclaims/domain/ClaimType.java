package jk.pp.ms.eclaims.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.pp.engg.foundations.common.core.domain.claims.IClaimType;
import jk.pp.engg.foundations.common.domain.core.BaseDomainUniqueNameDesc;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "ClaimType")
@Table(name = "claim_type")
public class ClaimType extends BaseDomainUniqueNameDesc implements IClaimType {

	private static final long serialVersionUID = 1L;

}
