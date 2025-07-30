package com.over.quest5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TicketBooking {

    void bookingDetails(String busName, String source, String destination, String... passengerNames){
        System.out.println("Your ticket booking has been confirmed with \n " + busName +
                " from " + source + " to " + destination + "For passengers " + String.join(", ", passengerNames));

    }
}
