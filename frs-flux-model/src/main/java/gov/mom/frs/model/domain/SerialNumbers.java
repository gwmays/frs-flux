package gov.mom.frs.model.domain;

import java.io.Serializable ;

import org.springframework.data.annotation.Id;

public class SerialNumbers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6152744484927798416L;

	@Id
	private Long id ;
	
	private String purpose ;

	private Long value ;

}