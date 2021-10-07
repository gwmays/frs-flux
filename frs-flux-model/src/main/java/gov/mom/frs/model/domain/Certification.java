package gov.mom.frs.model.domain;

import java.io.Serializable;
import java.time.ZonedDateTime;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor // for testing. hibernate complains if no default ctor
@AllArgsConstructor
@EqualsAndHashCode
public class Certification extends LinkableDTO implements Serializable {

	
	/*	 
	 *	  
	 */
	private static final long serialVersionUID = -7802558227543149605L;

	@Id
	private Long id;

	private String certifyingOfficial;

	private String title;

	private String owlPostAddress;

	private String streetAddress1;

	private String streetAddress2;

	private String city;

	private String stateProvince;

	private String postalCode1;

	private String postalCode2;

	private String country;

	private String comment;

	private ZonedDateTime dateCreated;

	private ZonedDateTime lastUpdated;

}
