package com.singo.Activities;

public class ActivitiesModel {

  private int activitiesId;
  private String activitiesName;
  private String activitiesType;
  private String activitiesLocation;
  private int activitiesPrice;
  private byte[] activitiesImage;
  private String activitiesUrl;
  private String activitiesAddress;
  private String activitiesDescription;
  private String activitiesPhone;
  private String activitiesHours;
    
  public ActivitiesModel(){

  }

    public ActivitiesModel(int activitiesId, String activitiesName, String activitiesType, String activitiesLocation, int activitiesPrice, 
    byte[] activitiesImage,String activitiesAddress,String activitiesDescription,String activitiesPhone,String activitiesHours) {
        this.activitiesId = activitiesId;
        this.activitiesName = activitiesName;
        this.activitiesType = activitiesType;
        this.activitiesLocation = activitiesLocation;
        this.activitiesPrice = activitiesPrice;
        this.activitiesImage = activitiesImage;
        this.activitiesAddress = activitiesAddress;
        this.activitiesDescription = activitiesDescription;
        this.activitiesPhone = activitiesPhone;
        this.activitiesHours = activitiesHours;
    }

    public ActivitiesModel( String activitiesName, String activitiesType, String activitiesLocation, int activitiesPrice
    ,String activitiesAddress,String activitiesDescription,String activitiesPhone,String activitiesHours) {
        this.activitiesName = activitiesName;
        this.activitiesType = activitiesType;
        this.activitiesLocation = activitiesLocation;
        this.activitiesPrice = activitiesPrice;
        this.activitiesAddress = activitiesAddress;
        this.activitiesDescription = activitiesDescription;
        this.activitiesPhone = activitiesPhone;
        this.activitiesHours = activitiesHours;
    }

    public ActivitiesModel( int activitiesId,String activitiesName, String activitiesType, String activitiesLocation, int activitiesPrice
    ,String activitiesUrl,String activitiesAddress,String activitiesDescription,String activitiesPhone,String activitiesHours) {
        this.activitiesName = activitiesName;
        this.activitiesType = activitiesType;
        this.activitiesLocation = activitiesLocation;
        this.activitiesPrice = activitiesPrice;
        this.activitiesUrl = activitiesUrl;
        this.activitiesAddress = activitiesAddress;
        this.activitiesDescription = activitiesDescription;
        this.activitiesPhone = activitiesPhone;
        this.activitiesHours = activitiesHours;
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

    public String getActivitiesAddress() {
        return this.activitiesAddress;
    }

    public void setActivitiesAddress(String activitiesAddress) {
        this.activitiesAddress = activitiesAddress;
    }

    public String getActivitiesDescription() {
        return this.activitiesDescription;
    }

    public void setActivitiesDescription(String activitiesDescription) {
        this.activitiesDescription = activitiesDescription;
    }

    public String getActivitiesPhone() {
        return this.activitiesPhone;
    }

    public void setActivitiesPhone(String activitiesPhone) {
        this.activitiesPhone = activitiesPhone;
    }

    public String getActivitiesHours() {
        return this.activitiesHours;
    }

    public void setActivitiesHours(String activitiesHours) {
        this.activitiesHours = activitiesHours;
    }

}