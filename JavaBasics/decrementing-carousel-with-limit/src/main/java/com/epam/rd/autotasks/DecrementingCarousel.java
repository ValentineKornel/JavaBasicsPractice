package com.epam.rd.autotasks;

public class DecrementingCarousel {
    protected int capacity;
    protected int currentCapacity;
    int [] array;
    protected boolean isWorkingStatus = false;
    protected boolean ifRunIsCalled = false;
    public DecrementingCarousel(final int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        currentCapacity = 0;
    }

    public boolean addElement(int element){
        if (currentCapacity < capacity && isWorkingStatus == false && element > 0){
            array[currentCapacity++] = element;
            return true;
        }
        else return false;
    }

    public CarouselRun run(){
        if (ifRunIsCalled == false){
            ifRunIsCalled = true;
            CarouselRun run = new CarouselRun(array, currentCapacity);
            this.isWorkingStatus = true;
            return run;
        }
        else return null;
    }
}
