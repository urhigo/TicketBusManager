package com.jfb.lecture5.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BusTicket {
  private String ticketClass;

  private String ticketType;

  private String startDate;

  private String price;

  public BusTicket(String ticketClass, String ticketType, String startDate, String price) {
    this.ticketClass = ticketClass;
    this.ticketType = ticketType;
    this.startDate = startDate;
    this.price = price;
  }

  public BusTicket() {
  }
}
