package com.singo.Hotel;

public class HotelModel {

  private int hotelId;
  private String hotelName;
  private int hotelStar;
  private String hotelLocation;
  private int hotelPrice;
  private byte[] hotelImage;
  private String hotelUrl;
    
  public HotelModel(){

  }

    public HotelModel(int hotelId, String hotelName, int hotelStar, String hotelLocation, int hotelPrice, byte[] hotelImage) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelStar = hotelStar;
        this.hotelLocation = hotelLocation;
        this.hotelPrice = hotelPrice;
        this.hotelImage = hotelImage;
    }

        public HotelModel(String hotelName, int hotelStar, String hotelLocation, int hotelPrice) {
        this.hotelName = hotelName;
        this.hotelStar = hotelStar;
        this.hotelLocation = hotelLocation;
        this.hotelPrice = hotelPrice;
    }

    public HotelModel(int hotelId, String hotelName, int hotelStar, String hotelLocation, int hotelPrice, String hotelUrl) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelStar = hotelStar;
        this.hotelLocation = hotelLocation;
        this.hotelPrice = hotelPrice;
        this.hotelUrl = hotelUrl;
    }


    public int getHotelId() {
        return this.hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelStar() {
        return this.hotelStar;
    }

    public void setHotelStar(int hotelStar) {
        this.hotelStar = hotelStar;
    }

    public String getHotelLocation() {
        return this.hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public int getHotelPrice() {
        return this.hotelPrice;
    }

    public void setHotelPrice(int hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public byte[] getHotelImage() {
        return this.hotelImage;
    }

    public void setHotelImage(byte[] hotelImage) {
        this.hotelImage = hotelImage;
    }

    public String getHotelUrl() {
        return this.hotelUrl;
    }

    public void setHotelUri(String hotelUrl) {
        this.hotelUrl = hotelUrl;
    }


}