package com.jfb.lecture5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jfb.lecture5.model.BusTicket;
import com.jfb.lecture5.service.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
  public static void main(String[] args) throws JsonProcessingException {
    List<String> inputs = getInput();
    List<BusTicket> listTickets = new ArrayList<>();

    for (String input : inputs) {
      if (!input.trim().isEmpty()) {
        try {
          BusTicket busTicket = new ObjectMapper().readValue(input, BusTicket.class);
          listTickets.add(busTicket);
        } catch (JsonProcessingException e) {
          e.printStackTrace();
        }
      }
    }

    listTickets.forEach(busTicket -> {
        try {
            new TicketTypeException().controlParam(busTicket.getTicketType());
        } catch (CustomException e) {
          e.printStackTrace();
        }
    });

    listTickets.forEach(busTicket -> {
      try {
        new DateException().controlParam(busTicket.getStartDate());
      } catch (CustomException e) {
        e.printStackTrace();
      }
    });

    listTickets.forEach(busTicket -> {
      try {
        new PriceException().controlParam(busTicket.getPrice());
      } catch (CustomException e) {
        e.printStackTrace();
      }
    });

    new TicketTypeException().numerousException();
    System.out.println("---------------------------------------------");
    new DateException().numerousException();
    System.out.println("---------------------------------------------");
    new PriceException().numerousException();
    System.out.println("---------------------------------------------");


  }

    private static List<String> getInput() {
      String filePath = "src/main/resources/ticketData.txt"; // Укажи путь к твоему файлу
      List<String> inputs = new ArrayList<>();
      String line;

      try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        while ((line = br.readLine()) != null) {
          inputs.add(line);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      return inputs;
    }
  }
