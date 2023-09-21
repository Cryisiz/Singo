package com.singo.Plan;

public class PlanModel {
    private int planId;
    private int planName;
    private String planType;
    private int planEventId;
    private int planDayId;


    public PlanModel(int planId, int planName, String planType, int planEventId, int planDayId) {
        this.planId = planId;
        this.planName = planName;
        this.planType = planType;
        this.planEventId = planEventId;
        this.planDayId = planDayId;
    }


    public int getPlanId() {
        return this.planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public int getPlanName() {
        return this.planName;
    }

    public void setPlanName(int planName) {
        this.planName = planName;
    }

    public String getPlanType() {
        return this.planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public int getPlanEventId() {
        return this.planEventId;
    }

    public void setPlanEventId(int planEventId) {
        this.planEventId = planEventId;
    }

    public int getPlanDayId() {
        return this.planDayId;
    }

    public void setPlanDayId(int planDayId) {
        this.planDayId = planDayId;
    }


}
