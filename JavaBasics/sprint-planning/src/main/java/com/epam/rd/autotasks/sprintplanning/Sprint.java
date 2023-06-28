package com.epam.rd.autotasks.sprintplanning;

import com.epam.rd.autotasks.sprintplanning.tickets.Bug;
import com.epam.rd.autotasks.sprintplanning.tickets.Ticket;
import com.epam.rd.autotasks.sprintplanning.tickets.UserStory;

import java.util.Arrays;

public class Sprint {
    private final int capacity;
    private final int ticketsLimit;
    private Ticket[] ticketsList;
    private int currentCapacity;
    private int postionAtTicketsList = 0;

    public Sprint(int capacity, int ticketsLimit) {
    this.capacity = capacity;
    this.ticketsLimit = ticketsLimit;
    ticketsList = new Ticket[ticketsLimit];
    currentCapacity = 0;
    }

    public boolean addUserStory(UserStory userStory) {
        Ticket[] copyToGive = new Ticket[postionAtTicketsList];
        System.arraycopy(ticketsList, 0, copyToGive, 0, postionAtTicketsList);

        if(userStory == null || userStory.isCompleted() || postionAtTicketsList == ticketsLimit
                || (userStory.getEstimate() + currentCapacity > capacity) ||
                !isContainsNeededDependencies(copyToGive, userStory.getDependencies()))
            return false;
        else{
            ticketsList[postionAtTicketsList++] = userStory;
            currentCapacity += userStory.getEstimate();
            return true;
        }
    }

    public boolean addBug(Bug bugReport) {
        if(bugReport == null || bugReport.isCompleted() || postionAtTicketsList == ticketsLimit
        || bugReport.getEstimate() + currentCapacity > capacity)
            return false;
        else{
            ticketsList[postionAtTicketsList++] = bugReport;
            currentCapacity += bugReport.getEstimate();
            return true;
        }
    }

    public Ticket[] getTickets() {
        Ticket[] copyToReturn = new Ticket[postionAtTicketsList];
        System.arraycopy(ticketsList, 0, copyToReturn, 0, postionAtTicketsList);
        return copyToReturn;
    }

    public int getTotalEstimate() {
    int totalEstimate = 0;
    for(int i = 0; i < postionAtTicketsList; i++)
        totalEstimate += ticketsList[i].getEstimate();
    return totalEstimate;
    }

    public static boolean isContainsNeededDependencies(Ticket[] array, Ticket[] subarray){
        if (subarray.length > array.length)
            return false;
        if (array == null || subarray == null || array.length == 0 || subarray.length == 0)
            return true;
        boolean foundMathAll = true;
        for (int i = 0; i < subarray.length; i++){
            if(subarray[i].isCompleted())
                continue;
            boolean foundMatch = false;
            for (Ticket ticket : array) {
                if (subarray[i] == ticket){
                    foundMatch = true;
                    break;
                }
            }
            if (!foundMatch)
                foundMathAll = false;
        }
        return foundMathAll;
    }
}
