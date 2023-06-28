package com.epam.rd.autotasks.sprintplanning;

import com.epam.rd.autotasks.sprintplanning.tickets.Bug;
import com.epam.rd.autotasks.sprintplanning.tickets.Ticket;
import com.epam.rd.autotasks.sprintplanning.tickets.UserStory;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class MainClass {
    public static void main(String args[]) {
        Sprint sprint = new Sprint(10, 30);

        int nextId = 1;

        sprint.addUserStory(new UserStory(nextId++, "User Registration Entity", 8));
        sprint.addUserStory(new UserStory(nextId++, "User Registration Form", 16));
        sprint.addUserStory(new UserStory(nextId++, "User Registration. Apply Captcha", 16));

        Ticket[] tickets = sprint.getTickets();
        System.out.println(tickets.length);
        System.out.println(tickets[0].toString());

        System.out.println(sprint.getTotalEstimate());
    }
}
