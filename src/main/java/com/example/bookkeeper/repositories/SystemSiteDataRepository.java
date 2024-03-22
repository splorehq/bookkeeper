package com.example.bookkeeper.repositories;

import com.example.bookkeeper.entities.SystemSiteData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SystemSiteDataRepository extends JpaRepository<SystemSiteData, String> {
}
