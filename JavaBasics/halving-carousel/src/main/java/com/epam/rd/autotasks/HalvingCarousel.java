package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run(){
        if (ifRunIsCalled == false){
            ifRunIsCalled = true;
            HalvingCarouselRun run = new HalvingCarouselRun(array, currentCapacity);
            this.isWorkingStatus = true;
            return run;
        }
        else return null;
    }
}
