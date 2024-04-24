package com.digitalmarketing.client.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalmarketing.client.model.*;
import com.digitalmarketing.client.repository.*;
@Service
public class CampaignService {
        @Autowired
        private CampaignRepository campaignRepository;

        public Campaign saveCampaign(Campaign campaign) {
            return campaignRepository.save(campaign);
        }
        
        public List<Campaign> getDetails() {
            return campaignRepository.findAll();
        }
        
        public void deleteCampaign(Integer campaignId) {
            campaignRepository.deleteById(campaignId);
        }
        
        public Campaign updateCampaign(Integer campaignId,Campaign campaign) {
            return campaignRepository.save(campaign);
            
        }
}
