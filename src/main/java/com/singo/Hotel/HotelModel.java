package com.singo.Hotel;

public class HotelModel {

  private int hotelId;
  private String hotelName;
  private int hotelStar;
  private String hotelLocation;
  private int hotelPrice;
  private byte[] hotelImage;
  private String hotelUrl;
  private String hotelAddress;
  private String hotelDescription;
  private String hotelPhone;
  private String hotelHours;
    
  public HotelModel(){

  }

    public HotelModel(int hotelId, String hotelName, int hotelStar, String hotelLocation, int hotelPrice, byte[] hotelImage,String hotelAddress,
                        String hotelDescription,String hotelPhone,String hotelHours) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelStar = hotelStar;
        this.hotelLocation = hotelLocation;
        this.hotelPrice = hotelPrice;
        this.hotelImage = hotelImage;
        this.hotelAddress = hotelAddress;
        this.hotelDescription = hotelDescription;
        this.hotelPhone = hotelPhone;
        this.hotelHours = hotelHours;
    }

    
    public HotelModel(int hotelId, String hotelName, int hotelStar, String hotelLocation, int hotelPrice,String hotelAddress,
                        String hotelDescription,String hotelPhone,String hotelHours) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelStar = hotelStar;
        this.hotelLocation = hotelLocation;
        this.hotelPrice = hotelPrice;
        this.hotelAddress = hotelAddress;
        this.hotelDescription = hotelDescription;
        this.hotelPhone = hotelPhone;
        this.hotelHours = hotelHours;
    }

        public HotelModel(String hotelName, int hotelStar, String hotelLocation, int hotelPrice,String hotelAddress,
                        String hotelDescription,String hotelPhone,String hotelHours) {
        this.hotelName = hotelName;
        this.hotelStar = hotelStar;
        this.hotelLocation = hotelLocation;
        this.hotelPrice = hotelPrice;
        this.hotelAddress = hotelAddress;
        this.hotelDescription = hotelDescription;
        this.hotelPhone = hotelPhone;
        this.hotelHours = hotelHours;
    }

    public HotelModel(int hotelId, String hotelName, int hotelStar, String hotelLocation, int hotelPrice, String hotelUrl,String hotelAddress,
                        String hotelDescription,String hotelPhone,String hotelHours) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelStar = hotelStar;
        this.hotelLocation = hotelLocation;
        this.hotelPrice = hotelPrice;
        this.hotelUrl = hotelUrl;
        this.hotelAddress = hotelAddress;
        this.hotelDescription = hotelDescription;
        this.hotelPhone = hotelPhone;
        this.hotelHours = hotelHours;
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

    public void setHotelUrl(String hotelUrl) {
        this.hotelUrl = hotelUrl;
    }

    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelDescription() {
        return this.hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }

    public String getHotelPhone() {
        return this.hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    public String getHotelHours() {
        return this.hotelHours;
    }

    public void setHotelHours(String hotelHours) {
        this.hotelHours = hotelHours;
    }



}