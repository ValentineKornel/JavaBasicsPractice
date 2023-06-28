package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitRun extends CarouselRun{
    protected int limit;
    protected int step = 0;
    DecrementingCarouselWithLimitRun(int[] arr, int curentCapacity, int acrualLimit){
        super(arr, curentCapacity);
        this.limit = acrualLimit;
    }

    @Override
    public int next(){
        int elementToReturn = super.next();
        step++;
        return elementToReturn;
    }
    @Override
    public boolean isFinished() {
        if(amountOfPositioveElements > 0 && step < limit)
            return false;
        else return true;
    }
}
