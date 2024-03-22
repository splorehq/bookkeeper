package com.example.bookkeeper.controllers;

import com.example.bookkeeper.entities.SystemSiteData;
import com.example.bookkeeper.services.SystemSiteDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookKeeperController {

    @Autowired
    SystemSiteDataService systemSiteDataService;

    Logger logger = LoggerFactory.getLogger(BookKeeperController.class);

    @GetMapping("/all")
    public List<SystemSiteData> getAll() {
        return systemSiteDataService.getAllRecords();
    }

    @PostMapping("/init")
    public Optional<SystemSiteData> initDataBatch(@RequestBody SystemSiteData systemSiteData) {
        logger.info("initDataBatch invoked, record = {}", systemSiteData);
        return systemSiteDataService.initDataBatch(systemSiteData);
    }
}
