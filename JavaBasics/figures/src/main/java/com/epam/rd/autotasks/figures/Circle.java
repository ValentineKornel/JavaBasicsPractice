package com.epam.rd.autotasks.figures;

class Circle extends Figure{
    private Point center;
    private final double Diametr;

    public Circle(Point center, double Diametr) {
        this.center = center;
        this.Diametr = Diametr;
    }
    @Override
    public double area(){
        return Math.PI * Diametr * Diametr;
    }
    @Override
    public String pointsToString(){
        return center.toString();
    }
    @Override
    public Point leftmostPoint() {
        Point mostLeft = new Point ((center.getX() - Diametr), center.getY());
        return mostLeft;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + Diametr + "]";
    }

}
