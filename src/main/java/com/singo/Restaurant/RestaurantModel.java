package com.singo.Restaurant;

public class RestaurantModel {

  private int restaurantId;
  private String restaurantName;
  private String restaurantType;
  private String restaurantLocation;
  private String restaurantPrice;
  private byte[] restaurantImage;
  private String restaurantUrl;
    
  public RestaurantModel(){

  }


    public RestaurantModel(int restaurantId, String restaurantName, String restaurantType, String restaurantLocation, String restaurantPrice, byte[] restaurantImage) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantType = restaurantType;
        this.restaurantLocation = restaurantLocation;
        this.restaurantPrice = restaurantPrice;
        this.restaurantImage = restaurantImage;
    }

    public RestaurantModel( String restaurantName, String restaurantType, String restaurantLocation, String restaurantPrice) {
        this.restaurantName = restaurantName;
        this.restaurantType = restaurantType;
        this.restaurantLocation = restaurantLocation;
        this.restaurantPrice = restaurantPrice;
    }

    public RestaurantModel( int restaurantId,String restaurantName, String restaurantType, String restaurantLocation, String restaurantPrice,String restaurantUrl) {
         this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantType = restaurantType;
        this.restaurantLocation = restaurantLocation;
        this.restaurantPrice = restaurantPrice;
        this.restaurantUrl = restaurantUrl;
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


}