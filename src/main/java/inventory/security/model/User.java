package inventory.security.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class User implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Long id;

	@NonNull
    protected String username;

    @NonNull
    protected String password;

    @NonNull
    protected String firstname;
    @NonNull
    protected String lastname;

    @NonNull
    protected String email;

    @NonNull
    protected Boolean enabled;

    @NonNull
    protected Date lastPasswordResetDate;

    @NonNull
    protected List<Authority> authorities;
}
