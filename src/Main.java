import controller.ChartController;
import model.Chart;
import view.ChartView;

public class Main {
    public static void main(String[] args) {

        double x = 5.0;

        Chart chart = new Chart(x);
        ChartView chartView = new ChartView();
        ChartController chartController = new ChartController(chart, chartView);

        chartController.updateView();


        chartController.setX(7.0);
        chartController.updateView();

    }
}
