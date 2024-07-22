package com.nv;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BlockController {

    @GetMapping("/block/{seconds}")
    public void block(@PathVariable Integer seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
        log.info("Blocked for {} seconds on {}", seconds, Thread.currentThread());
    }
}
