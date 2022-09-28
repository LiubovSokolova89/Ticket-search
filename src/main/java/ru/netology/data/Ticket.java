package ru.netology.data;

public class Ticket implements Comparable<Ticket> {

    protected int id;
    protected int price;
    protected int timeTravel;
    protected String airportFrom;
    protected String airportTo;


    public Ticket(int i, int i1, int i2, String s) {

    }

    public Ticket(int id, int price, int timeTravel, String airportFrom, String airportTo) {
        this.id = id;
        this.price = price;
        this.timeTravel = timeTravel;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(int timeTravel) {
        this.timeTravel = timeTravel;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }


    @Override
    public int compareTo(Ticket o) {
        if (price < o.getPrice()) {
            return -1;
        } else if (price > o.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}
