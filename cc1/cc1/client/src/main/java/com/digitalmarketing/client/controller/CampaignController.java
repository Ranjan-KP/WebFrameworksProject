package com.digitalmarketing.client.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalmarketing.client.model.*;
import com.digitalmarketing.client.repository.*;
import com.digitalmarketing.client.services.*;

@RestController
@RequestMapping("/details")
public class CampaignController {
    @Autowired
    public CampaignService campaignService;
    @Autowired
    public CampaignRepository campaignRepository;
    public CampaignService getCampaignService() {
        return campaignService;
    }

    public void setCampaignService(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping("/campaign")
    public Campaign getCampaign(@RequestBody Campaign campaign){
        return campaignService.saveCampaign(campaign);
    }

    @GetMapping("/campaigninfo")
    public List<Campaign> getCampaignDetails(){
        return campaignService.getDetails();
    }
    @DeleteMapping("/campaign/delete/{campaignId}")
    public String deleteCampaign(@PathVariable Integer campaignId){
        campaignService.deleteCampaign(campaignId);
        return "Deleted Successfully" ;
    }
    @PutMapping("/campaign/update/{campaignId}")
    public String updateCampaign(@PathVariable Integer campaignId,@RequestBody Campaign campaign){
        campaignService.updateCampaign(campaignId, campaign);
        return "updated successfully";
    }

}