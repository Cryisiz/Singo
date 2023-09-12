package com.singo.Activities;

public class ActivitiesModel {

  private int activitiesId;
  private String activitiesName;
  private String activitiesType;
  private String activitiesLocation;
  private int activitiesPrice;
  private byte[] activitiesImage;
  private String activitiesUrl;
    
  public ActivitiesModel(){

  }

    public ActivitiesModel(int activitiesId, String activitiesName, String activitiesType, String activitiesLocation, int activitiesPrice, byte[] activitiesImage) {
        this.activitiesId = activitiesId;
        this.activitiesName = activitiesName;
        this.activitiesType = activitiesType;
        this.activitiesLocation = activitiesLocation;
        this.activitiesPrice = activitiesPrice;
        this.activitiesImage = activitiesImage;
    }

    public ActivitiesModel( String activitiesName, String activitiesType, String activitiesLocation, int activitiesPrice) {
        this.activitiesName = activitiesName;
        this.activitiesType = activitiesType;
        this.activitiesLocation = activitiesLocation;
        this.activitiesPrice = activitiesPrice;
    }

    public ActivitiesModel( int activitiesId,String activitiesName, String activitiesType, String activitiesLocation, int activitiesPrice,String activitiesUrl) {
        this.activitiesName = activitiesName;
        this.activitiesType = activitiesType;
        this.activitiesLocation = activitiesLocation;
        this.activitiesPrice = activitiesPrice;
        this.activitiesUrl = activitiesUrl;
    }


    public int getActivitiesId() {
        return this.activitiesId;
    }

    public void setActivitiesId(int activitiesId) {
        this.activitiesId = activitiesId;
    }

    public String getActivitiesName() {
        return this.activitiesName;
    }

    public void setActivitiesName(String activitiesName) {
        this.activitiesName = activitiesName;
    }

    public String getActivitiesType() {
        return this.activitiesType;
    }

    public void setActivitiesType(String activitiesType) {
        this.activitiesType = activitiesType;
    }

    public String getActivitiesLocation() {
        return this.activitiesLocation;
    }

    public void setActivitiesLocation(String activitiesLocation) {
        this.activitiesLocation = activitiesLocation;
    }

    public int getActivitiesPrice() {
        return this.activitiesPrice;
    }

    public void setActivitiesPrice(int activitiesPrice) {
        this.activitiesPrice = activitiesPrice;
    }

    public byte[] getActivitiesImage() {
        return this.activitiesImage;
    }

    public void setActivitiesImage(byte[] activitiesImage) {
        this.activitiesImage = activitiesImage;
    }

    public String getActivitiesUrl() {
        return this.activitiesUrl;
    }

    public void setActivitiesUrl(String activitiesUrl) {
        this.activitiesUrl = activitiesUrl;
    }

}