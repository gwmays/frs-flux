package gov.mom.frs.model.domain;

import java.io.Serializable ;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter ;
import lombok.NoArgsConstructor;
import lombok.Setter ;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RegistrationStatus implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9045702087549641278L;

	@Id
	private Long id ;
	
	private Long version ;
	
	private String status ;
	
}