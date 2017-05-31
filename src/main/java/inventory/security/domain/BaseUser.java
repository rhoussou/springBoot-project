package inventory.security.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public abstract class  BaseUser  {

	@Id
    private String id;

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
