package gov.mom.frs.model.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor 
@EqualsAndHashCode
public class Registration implements Serializable {

	private static final long serialVersionUID = -6019183608452325559L;

	@Id
	private Long id;
	
	private String frn;

	private String flooOwner;

	private String location;
	
	private String streetAddress1 ;
	
	private String streetAddress2 ;

	private String city ;
	
	private String stateProvince ;
	
	private String postalCode1 ;
	
	private String postalCode2 ;
	
	private String country ;

	private LocalDateTime dateCreated;

	private LocalDateTime lastUpdated;
	
}