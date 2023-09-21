package com.singo.Day;

import java.sql.Date;

public class DayModel {
    private int dayId;
    private int dayName;
    private Date dayDate;
    private int dayItineraryId;
    private int dayHotelId;


    public DayModel(int dayId, int dayName, Date dayDate, int dayItineraryId) {
        this.dayId = dayId;
        this.dayName = dayName;
        this.dayDate = dayDate;
        this.dayItineraryId = dayItineraryId;
    }

    public DayModel(int dayId, int dayName, Date dayDate, int dayItineraryId, int dayHotelId) {
        this.dayId = dayId;
        this.dayName = dayName;
        this.dayDate = dayDate;
        this.dayItineraryId = dayItineraryId;
        this.dayHotelId = dayHotelId;
    }


    public int getDayId() {
        return this.dayId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public int getDayName() {
        return this.dayName;
    }

    public void setDayName(int dayName) {
        this.dayName = dayName;
    }

    public Date getDayDate() {
        return this.dayDate;
    }

    public void setDayDate(Date dayDate) {
        this.dayDate = dayDate;
    }

    public int getDayItineraryId() {
        return this.dayItineraryId;
    }

    public void setDayItineraryId(int dayItineraryId) {
        this.dayItineraryId = dayItineraryId;
    }

    public int getDayHotelId() {
        return this.dayHotelId;
    }

    public void setDayHotelId(int dayHotelId) {
        this.dayHotelId = dayHotelId;
    }


}
