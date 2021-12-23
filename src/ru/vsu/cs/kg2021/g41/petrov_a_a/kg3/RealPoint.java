package ru.vsu.cs.kg2021.g41.petrov_a_a.kg3;

import java.awt.*;

public class RealPoint {
    private double x;
    private double y;
    private boolean isUndefined = false;

    public RealPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public RealPoint() {
        this(Double.NaN, Double.NaN);
        this.isUndefined = true;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isUndefined() {
        return isUndefined;
    }

    public RealPoint findDelta(RealPoint p) {
        return new RealPoint(getX() - p.getX(), getY() - p.getY());
    }
}
