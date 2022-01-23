package com.jobFinder.api.Repository;

import com.jobFinder.api.Pojo.Entity.Bid;
import org.springframework.data.repository.CrudRepository;

public interface BidRepository extends CrudRepository<Bid,Integer> {
    Bid findById(int id);
}
