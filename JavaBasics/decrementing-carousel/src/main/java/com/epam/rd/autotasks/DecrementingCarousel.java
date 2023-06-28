package com.epam.rd.autotasks;

public class DecrementingCarousel {
    final int capacity;
    public int currentCapacity;
    int [] array;
    public boolean isWorkingStatus = false;
    private boolean ifRunIsCalled = false;
    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        currentCapacity = 0;
    }
    public boolean addElement(int element){
        if (currentCapacity < capacity &&
                !isWorkingStatus && element > 0){
            array[currentCapacity++] = element;
            return true;
        }
        else return false;
    }
    public CarouselRun run(){
        if (!ifRunIsCalled){
            ifRunIsCalled = true;
            CarouselRun run = new CarouselRun(array, currentCapacity);
            this.isWorkingStatus = true;
            return run;
        }
        else return null;
    }
}
