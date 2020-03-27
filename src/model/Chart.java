package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Chart {
    double x;
    double fun;

    private List<Observer> observers;

    public Chart(double x) {
       this.x = x;
       setFun(x);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        setFun(x);

    }

    public double getFun() {
        return fun;
    }

    public void setFun(double x) {
        this.fun = Math.pow(x, 2);

    }

}
