package com.epam.rd.autotasks;

public class MainClass {
    public static void main(String args[]){
        DecrementingCarousel carousel = new DecrementingCarousel(7);

        carousel.addElement(7);
        carousel.addElement(3);
        carousel.addElement(4);

        CarouselRun run  = carousel.run();

        System.out.println(run.isFinished());

        System.out.println(run.next());
        System.out.println(run.next());
        System.out.println(run.next());

        System.out.println(run.next());
        System.out.println(run.next());
        System.out.println(run.next());

        System.out.println(run.next());
        System.out.println(run.next());
        System.out.println(run.next());

        System.out.println(run.next());
        System.out.println(run.next());

        System.out.println(run.next());
        System.out.println(run.next());
        System.out.println(run.next());

        System.out.println(run.isFinished());
    }
}
