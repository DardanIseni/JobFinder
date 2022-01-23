package com.jobFinder.api;

import com.jobFinder.api.Pojo.Entity.Address;
import com.jobFinder.api.Pojo.Entity.User;
import com.jobFinder.api.Pojo.Entity.Work;
import com.jobFinder.api.Repository.BidRepository;
import com.jobFinder.api.Repository.UserRepository;
import com.jobFinder.api.Repository.WorkRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JobFinderApiApplicationTests {

	@Autowired
	WorkRepository workRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	BidRepository bidRepository;

	private static Address address = new Address("Tetovo","NMK");

	@Test
	public void testWork(){
		Work work = new Work();
		work.setId(1);
		work.setTitle("Do Dishes");
		work.setDescription("Doing Dishes");
		work.setAddress(address);
		workRepository.save(work);
		assertNotNull(workRepository.findById(1));
	}

	@Test
	public void testGetUsers() {
		assertNotNull(userRepository.findAll());
	}

	@Test
	public void testUser() {
		User user = new User();
		user.setId(1);
		user.setUsername("test");
		user.setAddress(address);
		User userInDB = userRepository.findUserById(1);
		assertNotEquals(user,userInDB);
	}

	@Test
	public void testBid() {
		assertNull(bidRepository.findById(1));
	}

}