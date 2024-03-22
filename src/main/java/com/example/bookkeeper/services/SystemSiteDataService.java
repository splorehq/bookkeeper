package com.example.bookkeeper.services;

import com.example.bookkeeper.entities.SystemSiteData;
import com.example.bookkeeper.repositories.SystemSiteDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SystemSiteDataService {
    @Autowired
    SystemSiteDataRepository systemSiteDataRepository;

    Logger logger = LoggerFactory.getLogger(SystemSiteDataRepository.class);

    public Optional<SystemSiteData> initDataBatch(SystemSiteData systemSiteData) {
        systemSiteDataRepository.save(systemSiteData);
        return Optional.empty();
    }
    public List<SystemSiteData> getAllRecords() {
        return systemSiteDataRepository.findAll();
    }
}
