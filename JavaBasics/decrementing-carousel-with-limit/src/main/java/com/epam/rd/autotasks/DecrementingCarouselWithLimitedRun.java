package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    protected int actualLimit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actualLimit = actionLimit;
    }
    @Override
    public CarouselRun run(){
        if (ifRunIsCalled == false){
            ifRunIsCalled = true;
            DecrementingCarouselWithLimitRun run =
                    new DecrementingCarouselWithLimitRun(array, currentCapacity, actualLimit);
            this.isWorkingStatus = true;
            return run;
        }
        else return null;
    }
}
