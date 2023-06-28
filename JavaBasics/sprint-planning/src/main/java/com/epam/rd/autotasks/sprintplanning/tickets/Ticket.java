package com.epam.rd.autotasks.sprintplanning.tickets;

public class Ticket {
    protected int id;
    protected String name;
    protected int estimate;
    protected boolean ifCompleted;

    public Ticket(int id, String name, int estimate) {
        this.id = id;
        this.name = name;
        this.estimate = estimate;
        this.ifCompleted = false;
    }

    public int getId() {return id;}

    public String getName() {return name;}

    public boolean isCompleted() {return ifCompleted;}

    public void complete() {
        ifCompleted = true;
    }

    public int getEstimate() {return estimate;}
}
