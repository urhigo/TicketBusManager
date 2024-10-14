package com.jfb.lecture5.model;

public enum TicketType {

    DAY ("DAY"),
    WEEK ("WEEK"),
    MONTH ("MONTH"),
    YEAR ("YEAR");

    private final String ticketType;

    TicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTicketType() {
        return ticketType;
    }
}
