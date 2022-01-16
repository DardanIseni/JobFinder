package com.jobFinder.api.Controller;

import com.jobFinder.api.Pojo.Entity.Bid;
import com.jobFinder.api.Pojo.Input.BidInput;
import com.jobFinder.api.Service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BidController {

    @Autowired
    private BidService bidService;

    @PostMapping("/bid/{work_id}/{worker_id}")
    public Bid placeBid(@RequestBody BidInput bidInput, @PathVariable int work_id,@PathVariable int worker_id){
        return bidService.createBid(bidInput,worker_id,work_id);
    }

}
