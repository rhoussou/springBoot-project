package inventory.security.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    protected Long id;

   
    protected String username;

    
    protected String password;

   
    protected String firstname;

    protected String lastname;

   
    protected String email;

    
    protected Boolean enabled;

   
    protected Date lastPasswordResetDate;

    
    protected List<Authority> authorities;
}
