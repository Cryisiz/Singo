package com.singo.Restaurant;

public class RestaurantModel {

  private int restaurantId;
  private String restaurantName;
  private String restaurantType;
  private String restaurantLocation;
  private String restaurantPrice;
  private byte[] restaurantImage;
  private String restaurantUrl;
  private String restaurantAddress;
  private String restaurantDescription;
  private String restaurantPhone;
  private String restaurantHours;
    
  public RestaurantModel(){

  }
    public RestaurantModel(int restaurantId, String restaurantName, String restaurantType, String restaurantLocation, String restaurantPrice, 
    byte[] restaurantImage,String restaurantAddress,String restaurantDescription,String restaurantPhone,String restaurantHours) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantType = restaurantType;
        this.restaurantLocation = restaurantLocation;
        this.restaurantPrice = restaurantPrice;
        this.restaurantImage = restaurantImage;
        this.restaurantAddress = restaurantAddress;
        this.restaurantDescription = restaurantDescription;
        this.restaurantPhone = restaurantPhone;
        this.restaurantHours = restaurantHours;
    }

    public RestaurantModel( String restaurantName, String restaurantType, String restaurantLocation, String restaurantPrice
    ,String restaurantAddress,String restaurantDescription,String restaurantPhone,String restaurantHours) {
        this.restaurantName = restaurantName;
        this.restaurantType = restaurantType;
        this.restaurantLocation = restaurantLocation;
        this.restaurantPrice = restaurantPrice;
        this.restaurantAddress = restaurantAddress;
        this.restaurantDescription = restaurantDescription;
        this.restaurantPhone = restaurantPhone;
        this.restaurantHours = restaurantHours;
    }
        public RestaurantModel(int restaurantId, String restaurantName, String restaurantType, String restaurantLocation, String restaurantPrice
    ,String restaurantAddress,String restaurantDescription,String restaurantPhone,String restaurantHours) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantType = restaurantType;
        this.restaurantLocation = restaurantLocation;
        this.restaurantPrice = restaurantPrice;
        this.restaurantAddress = restaurantAddress;
        this.restaurantDescription = restaurantDescription;
        this.restaurantPhone = restaurantPhone;
        this.restaurantHours = restaurantHours;
    }

    public RestaurantModel( int restaurantId,String restaurantName, String restaurantType, String restaurantLocation, String restaurantPrice
    ,String restaurantUrl,String restaurantAddress,String restaurantDescription,String restaurantPhone,String restaurantHours) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantType = restaurantType;
        this.restaurantLocation = restaurantLocation;
        this.restaurantPrice = restaurantPrice;
        this.restaurantUrl = restaurantUrl;
        this.restaurantAddress = restaurantAddress;
        this.restaurantDescription = restaurantDescription;
        this.restaurantPhone = restaurantPhone;
        this.restaurantHours = restaurantHours;
    }

    public int getRestaurantId() {
        return this.restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantType() {
        return this.restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }

    public String getRestaurantLocation() {
        return this.restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public String getRestaurantPrice() {
        return this.restaurantPrice;
    }

    public void setRestaurantPrice(String restaurantPrice) {
        this.restaurantPrice = restaurantPrice;
    }

    public byte[] getRestaurantImage() {
        return this.restaurantImage;
    }

    public void setRestaurantImage(byte[] restaurantImage) {
        this.restaurantImage = restaurantImage;
    }

    public String getRestaurantUrl() {
        return this.restaurantUrl;
    }

    public void setRestaurantUrl(String restaurantUrl) {
        this.restaurantUrl = restaurantUrl;
    }

    public String getRestaurantAddress() {
        return this.restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantDescription() {
        return this.restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription;
    }

    public String getRestaurantPhone() {
        return this.restaurantPhone;
    }

    public void setRestaurantPhone(String restaurantPhone) {
        this.restaurantPhone = restaurantPhone;
    }

    public String getRestaurantHours() {
        return this.restaurantHours;
    }

    public void setRestaurantHours(String restaurantHours) {
        this.restaurantHours = restaurantHours;
    }


}