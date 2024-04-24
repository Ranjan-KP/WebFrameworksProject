package com.digitalmarketing.client.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalmarketing.client.model.Campaign;

public interface CampaignRepository extends JpaRepository<Campaign , Integer>{
    
}
