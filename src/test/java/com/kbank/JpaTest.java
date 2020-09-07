package com.kbank;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kbank.eims.domain.Users;
import com.kbank.eims.repository.UserRepository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaTest{
	@Autowired
	UserRepository userrepository;
	
	@Before
	public void init() {
		Users users = userrepository.save(Users.builder().name("Byungmoo").build());
	}
	
	@Test
	public void 정상입력_테스트() {
		Users users = userrepository.findByName("Byungmoo");
		assertThat(users.getName(), is("Byungmoo"));
	}
}