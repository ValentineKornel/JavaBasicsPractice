package com.epam.rd.autotasks.intersection;

public class Line {
    int k;
    int b;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line line2) {
        if (this.k == line2.k)
            return null;
        int x = (line2.b - this.b) / (this.k - line2.k);
        int y = this.k * x + this.b;

        return new Point(x, y);
    }
    /*
    y1 = a1x + b1;
    y2 = a2x + b2;
    y1 = y2;
    a1x + b1 = a2x + b2;
    a1x - a2x = b2 - b1;
    x(a1 - a2) = b2 - b1;
    x = (b2 - b1) / (a1 - b2);
    y = a1 * x + b1;
     */

}
