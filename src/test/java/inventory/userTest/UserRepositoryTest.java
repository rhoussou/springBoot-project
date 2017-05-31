package inventory.userTest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import inventory.repository.UserRepository;
import inventory.security.domain.Authority;
import inventory.security.domain.AuthorityName;
import inventory.security.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
    public void testFindby() throws Exception {
		User root = new User("cyrol","root","roland",
				"Houssou", "cyrolpro@yahoo.fr",true, new Date(),
				Arrays.asList(
	                    new Authority(AuthorityName.ROLE_ADMIN)       
	            )
		);
		
		User user = new User("user","user","John",
				"Doe", "cyrolpro@yahoo.fr", true, new Date(),
				Arrays.asList(
	                    new Authority(AuthorityName.ROLE_USER)       
	            )
		);
		
		List<User> users = Arrays.asList(root,user);
		
		this.userRepository.save(users);
		
		assertThat(userRepository.findByUsername("user").getUsername()).isEqualTo(user.getUsername());
		    		
	}

}
