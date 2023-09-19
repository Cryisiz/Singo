package com.singo.Itinerary;

import java.sql.Date;

public class ItineraryModel {
    private int itineraryId;
    private String itineraryName;
    private Date itineraryStart;
    private Date itineraryEnd;
    private int itineraryAdult;
    private int itineraryChild;
    private String itineraryEmail;

    public ItineraryModel( String itineraryName, Date itineraryStart, Date itineraryEnd, int itineraryAdult, int itineraryChild, String itineraryEmail) {
        this.itineraryName = itineraryName;
        this.itineraryStart = itineraryStart;
        this.itineraryEnd = itineraryEnd;
        this.itineraryAdult = itineraryAdult;
        this.itineraryChild = itineraryChild;
        this.itineraryEmail = itineraryEmail;
    }

    public ItineraryModel(int itineraryId, String itineraryName, Date itineraryStart, Date itineraryEnd, int itineraryAdult, int itineraryChild, String itineraryEmail) {
        this.itineraryId = itineraryId;
        this.itineraryName = itineraryName;
        this.itineraryStart = itineraryStart;
        this.itineraryEnd = itineraryEnd;
        this.itineraryAdult = itineraryAdult;
        this.itineraryChild = itineraryChild;
        this.itineraryEmail = itineraryEmail;
    }

    public ItineraryModel(int itineraryId, String itineraryName, Date itineraryStart, Date itineraryEnd, int itineraryAdult, int itineraryChild) {
        this.itineraryId = itineraryId;
        this.itineraryName = itineraryName;
        this.itineraryStart = itineraryStart;
        this.itineraryEnd = itineraryEnd;
        this.itineraryAdult = itineraryAdult;
        this.itineraryChild = itineraryChild;
    }
    

    public int getItineraryId() {
        return this.itineraryId;
    }

    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }

    public String getItineraryName() {
        return this.itineraryName;
    }

    public void setItineraryName(String itineraryName) {
        this.itineraryName = itineraryName;
    }

    public Date getItineraryStart() {
        return this.itineraryStart;
    }

    public void setItineraryStart(Date itineraryStart) {
        this.itineraryStart = itineraryStart;
    }

    public Date getItineraryEnd() {
        return this.itineraryEnd;
    }

    public void setItineraryEnd(Date itineraryEnd) {
        this.itineraryEnd = itineraryEnd;
    }

    public int getItineraryAdult() {
        return this.itineraryAdult;
    }

    public void setItineraryAdult(int itineraryAdult) {
        this.itineraryAdult = itineraryAdult;
    }

    public int getItineraryChild() {
        return this.itineraryChild;
    }

    public void setItineraryChild(int itineraryChild) {
        this.itineraryChild = itineraryChild;
    }

    public String getItineraryEmail() {
        return this.itineraryEmail;
    }

    public void setItineraryEmail(String itineraryEmail) {
        this.itineraryEmail = itineraryEmail;
    }

}
