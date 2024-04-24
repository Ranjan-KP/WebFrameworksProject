package com.digitalmarketing.client.model;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Campaign {
    @Id
    private int campaignId;
    private int companyId;
    private String campaignname;
    private int budget;
    private String platform;
    private int reach;
    private LocalDate startDate;
    private LocalDate endDate;
    public int getCampaignId() {
        return campaignId;
    }
    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }
    public int getCompanyId() {
        return companyId;
    }
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
    public String getCampaignname() {
        return campaignname;
    }
    public void setCampaignname(String campaignname) {
        this.campaignname = campaignname;
    }
    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public int getReach() {
        return reach;
    }
    public void setReach(int reach) {
        this.reach = reach;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    @OneToMany(mappedBy = "campaign",cascade = CascadeType.REMOVE)
    private List<Signup> signup;
}
