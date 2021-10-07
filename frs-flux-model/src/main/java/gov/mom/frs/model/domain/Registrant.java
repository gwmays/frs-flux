package gov.mom.frs.model.domain;

import java.io.Serializable ;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

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
@Table
public class Registrant implements Serializable {
	
	private static final long serialVersionUID = 2258246960311546523L;

	public Registrant(Registrant r) {
		
	}
	
	@Id
	private Long id ;
		
	private String providerName ;

	private String loginId ;

	private String operatingName ;
           
//    private String firstName ;
//    
//    private String lastName ;
	
	private String name ;
    
    private String owlPostAddress ;
    
    private String title ;
    
    private java.time.OffsetDateTime dateCreated ;
    
    private java.time.OffsetDateTime lastUpdated ;
    	
}