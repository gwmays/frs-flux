package gov.mom.frs.model.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class LkupFlooServicesOffered implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 81175627179885703L;

	@Id
	private Long id ;
	
	private Long version ;
	
	private String description ;
 
}