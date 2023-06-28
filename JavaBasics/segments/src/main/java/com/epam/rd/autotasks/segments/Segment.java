package com.epam.rd.autotasks.segments;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {
    Point start, end;
    public Segment(Point start, Point end) {
        if(start.getX() == end.getX() && start.getY() == end.getY())
            throw new IllegalArgumentException();
        this.start = start; this.end = end;
    }
    double length() {
        return sqrt(pow((end.getX() - start.getX()), 2) + pow((end.getY() - start.getY()), 2));
    }
    Point middle() {
        double midX, midY;
        midX = (start.getX() + end.getX()) / 2;
        midY = (start.getY() + end.getY()) / 2;
        return new Point(midX, midY);
    }
    Point intersection(Segment another) {
        double intersX, intersY;
        double x1 = start.getX(), x2 = end.getX();
        double x3 = another.start.getX(), x4 = another.end.getX();
        double y1 = start.getY(), y2 = end.getY();
        double y3 = another.start.getY(), y4 = another.end.getY();
        double denominator = ((x1 - x2) * (y3 - y4)) - ((y1 - y2) * (x3 - x4));
        if (denominator == 0) return null;
        intersX = (((x1 * y2 - y1 * x2) * (x3 - x4)) - ((x1 - x2) * (x3 * y4 - y3 * x4))) / denominator;
        intersY = (((x1 * y2 - y1 * x2) * (y3 - y4)) - ((y1 - y2) * (x3 * y4 - y3 * x4))) / denominator;
        if (intersX < Math.min(x1, x2) || intersX > Math.max(x1, x2) ||
                intersX < Math.min(x3, x4) || intersX > Math.max(x3, x4) ||
                intersY < Math.min(y1, y2) || intersY > Math.max(y1, y2) ||
                intersY < Math.min(y3, y4) || intersY > Math.max(y3, y4)) return null;
        return new Point(intersX, intersY);
    }
}
