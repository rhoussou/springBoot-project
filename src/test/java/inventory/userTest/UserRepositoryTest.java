package inventory.userTest;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import inventory.repository.UserRepository;
import inventory.security.model.Authority;
import inventory.security.model.AuthorityName;
import inventory.security.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
    public void testFindby() throws Exception {
		User root = new User("cyrol","root","roland",
				"Houssou", "cyrolpro@yahoo.fr", null, null,
				Arrays.asList(
	                    new Authority(AuthorityName.ROLE_ADMIN)       
	            )
		);
		
		User user = new User("user","user","John",
				"Doe", "cyrolpro@yahoo.fr", null, null,
				Arrays.asList(
	                    new Authority(AuthorityName.ROLE_USER)       
	            )
		);
		
		List<User> users = Arrays.asList(root,user);
		
		this.userRepository.save(users);
		
		assertThat(userRepository.findByUsername("user"), is(user.getUsername()));
		
		assertThat(userRepository.findByUsername("user").getId()).isEqualTo(user.getId());
        
		
    		
	}

}
