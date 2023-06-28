package com.epam.rd.autotasks;

public class GraduallyDecreasingCarouselRun extends CarouselRun{
    public GraduallyDecreasingCarouselRun(int[] arr, int currentCapacity){
        super(arr, currentCapacity);
    }
    private int decreasingDegree = 1;

    @Override
    public int next() {
        int elementToRetunr;
        if(!isFinished()){
            if (currentPosition == arraySize + 1){
                currentPosition = 0;
                decreasingDegree++;
            }
            if(arr[currentPosition] < 1){
                while (arr[currentPosition] < 1 && !isFinished()){
                    if(currentPosition == arraySize){
                        currentPosition = -1;
                        decreasingDegree++;
                    }
                    currentPosition++;
                }
            }
            if ((arr[currentPosition] - decreasingDegree) < 1)
                amountOfPositioveElements--;
            elementToRetunr = arr[currentPosition];
            arr[currentPosition++] -= decreasingDegree;
            return elementToRetunr;
        }
        else return -1;
    }
}
