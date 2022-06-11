package com.FlightReservationSystem;

public class Flight {
    // Attributes for class flight
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    // Constructors for class flight
    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    // Methods for class flight
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() {
        return "Flight No: " + flightNumber + ", Airline: " + airline +", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }
    // Checking for seat availibility

    public boolean checkAvailability() {
        return bookedSeats < capacity;
    }
    //available books are updated after checking
    // 
    public void incrementBookingCounter() {
        bookedSeats++;
    }
}

