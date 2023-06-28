package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure{
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public double area() {
        double area_ABC = 0.5 * Math.abs(a.getX()*(b.getY()-c.getY()) + b.getX()*(c.getY()-a.getY()) + c.getX()*(a.getY()-b.getY()));
        double area_ACD = 0.5 * Math.abs(a.getX()*(c.getY()-d.getY()) + c.getX()*(d.getY()-a.getY()) + d.getX()*(a.getY()-c.getY()));
        return area_ABC + area_ACD;
    }
    @Override
    public String pointsToString(){
        return a.toString() + b.toString() + c.toString() + d.toString();
    }
    @Override
    public Point leftmostPoint() {
        if (a.getX() < b.getX() && a.getX() < c.getX() && a.getX() < d.getX())
            return a;
        else if (b.getX() < c.getX() && b.getX() < d.getX())
            return b;
        else if(c.getX() < d.getX())
                return c;
        else return d;
    }
}
