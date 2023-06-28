package com.epam.rd.autotasks;

public class HalvingCarouselRun extends CarouselRun{
    public HalvingCarouselRun(int[] arr, int currentaCpacity) {
        super(arr, currentaCpacity);
    }
    @Override public int next(){
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
            int elementToReturn = arr[currentPosition];
            arr[currentPosition++] /= 2;
            return elementToReturn;
        }
        else return -1;
    }
}
