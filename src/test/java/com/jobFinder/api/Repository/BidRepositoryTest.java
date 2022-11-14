package com.jobFinder.api.Repository;

import com.jobFinder.api.JobFinderApiApplication;
import com.jobFinder.api.Pojo.Entity.Bid;
import com.jobFinder.api.Pojo.Entity.Work;
import com.jobFinder.api.Pojo.Entity.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;


import static org.mockito.Mockito.mock;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class BidRepositoryTest {


    @Autowired
    private BidRepository bidRepository;

    @BeforeEach
    void setUp() {
        Worker worker =  mock(Worker.class);
        Work work =  mock(Work.class);
        Bid bid1 = new Bid(100,work,worker);
        bidRepository.save(bid1);
    }


    @Test
    void saveBid() {
        Bid bid = new Bid(1,mock(Work.class),mock(Worker.class));
        bidRepository.save(bid);
    }

    @Test
    void findById() {
        assertNotNull(bidRepository.findById(1));
    }
}