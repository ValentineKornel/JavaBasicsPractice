package com.epam.rd.autotasks;

public class CarouselRun {
    protected int arr[];
    protected int amountOfPositioveElements = 0;
    protected int currentPosition = 0;
    protected final int arraySize;

    CarouselRun(int arr[], int currentaCpacity){
        this.arr = arr;
        arraySize = currentaCpacity - 1;
        for (int x : arr){
            if (x > 0)
                amountOfPositioveElements++;
        }
    }

    public int next() {
        if(!isFinished()){
            if (currentPosition == arraySize + 1)
                currentPosition = 0;
            if(arr[currentPosition] == 0){
                while (arr[currentPosition] == 0 && !isFinished()){
                    if(currentPosition == arraySize)
                        currentPosition = -1;
                    currentPosition++;
                }
            }
            if (arr[currentPosition] == 1)
                amountOfPositioveElements--;
            return arr[currentPosition++]--;
        }
        else return -1;
    }

    public boolean isFinished() {
        if(amountOfPositioveElements > 0)
            return false;
        else return true;
    }
}
