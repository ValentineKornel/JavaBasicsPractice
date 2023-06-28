package com.epam.rd.autotasks.figures;

class Triangle extends Figure{
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area(){
        return 0.5 * Math.abs(a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY()));
    }
    @Override
    public String pointsToString(){
        return a.toString() + b.toString() + c.toString();
    }

    @Override
    public Point leftmostPoint() {
        if (a.getX() < b.getX() && a.getX() < c.getX())
            return a;
        else if (b.getX() < c.getX())
            return b;
        else
            return c;
    }
}
