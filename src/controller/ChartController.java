package controller;

import model.Chart;
import view.ChartView;

import java.util.Observable;
import java.util.Observer;

public class ChartController  {

    private Chart model;
    private ChartView view;

    public ChartController(Chart model, ChartView view) {
        this.model = model;
        this.view = view;
    }

    public void setX(double x){
        model.setX(x);
    }

    public void updateView(){
        view.ChartView(model.getX(), model.getFun());
    }


}
