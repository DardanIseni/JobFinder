package com.jobFinder.api;

import com.jobFinder.api.Pojo.Entity.Address;
import com.jobFinder.api.Pojo.Entity.Bid;
import com.jobFinder.api.Pojo.Entity.Work;
import com.jobFinder.api.Repository.UserRepository;
import com.jobFinder.api.Repository.WorkRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class JobFinderApiApplicationTests {

	@Autowired
	WorkRepository workRepository;

	@Autowired
	UserRepository userRepository;



	@Test
	public void testCreate(){
		Work j = new Work();
		Address address = new Address("Tetovo","NMK");
		j.setId(1);
		j.setTitle("Do Dishes");
		j.setDescription("Doing Dishes");
		j.setAddress(address);
		workRepository.save(j);
		assertNotNull(workRepository.findById(1));
	}

	@Test
	public void getUsers(){
		assertNotNull(userRepository.findAll());
	}

}
