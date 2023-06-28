package com.epam.rd.autotasks;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }
    @Override
    public CarouselRun run(){
        if (ifRunIsCalled == false){
            ifRunIsCalled = true;
            GraduallyDecreasingCarouselRun run = new
                    GraduallyDecreasingCarouselRun(array, currentCapacity);
            this.isWorkingStatus = true;
            return run;
        } else return null;
    }
}
