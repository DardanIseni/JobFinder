package com.jobFinder.api.Repository;

import com.jobFinder.api.Pojo.Entity.Address;
import com.jobFinder.api.Pojo.Entity.User;
import com.jobFinder.api.Pojo.Entity.Work;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.springframework.test.util.AssertionErrors.assertNull;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class WorkRepositoryTest {

    @Autowired
    private WorkRepository workRepository;

    private Work work = mock(Work.class);
    private Address address = mock(Address.class);

    private User user = mock(User.class);


    @BeforeEach
    void setUp() {
        work = new Work("title","description",address,user);
        workRepository.save(work);
    }

    @Test
    void findAllByUser_id() {
        assertNotNull(workRepository.findAllByUser_id(user.getId()));
    }

    @Test
    void findById() {
       assertNotNull(workRepository.findById(1));
    }
}