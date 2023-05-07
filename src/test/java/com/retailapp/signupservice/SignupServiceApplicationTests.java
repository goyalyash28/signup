package com.retailapp.signupservice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.retailapp.signupservice.POJO.User;
import com.retailapp.signupservice.dao.UserDao;

@SpringBootTest
class SignupServiceApplicationTests 
{
	@Autowired
	private UserDao userdao;
     
	// JUnit test for saveEmployee
	@Test
	void findByEmailId() 
	{
		User user=new User();
		user.setCartId(1);
		user.setId(1);
		user.setContactNumber("8785656652");
		user.setEmail("yashgico@gmail.com");
		user.setName("Yash");
		user.setPassword("Admin@2022");
		User un=userdao.save(user);
		Assertions.assertThat(user.getEmail()).isEqualTo("yashgico@gmail.com");
		/*User.builder()
				  .id(2)
				  .name("raghav")
		         .contactNumber("9897461020")
		         .email("adf@gmail.com")
		         .password("Admin@2022")
		         .build();
		
		  userdao.save(user);
		  
		  Assertions.assertThat(user.getEmail()).isEqualTo("adf@gmail.com");
		*/
  }
	

}
