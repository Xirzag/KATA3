package histogram;

import java.util.HashMap;

public class HistogramProgram {
    public static void main(String[] args) {
        //int vector[] = {2,2,11,4,2,6,11,2,3,5,11,5};
        String vector[] = {"Ana", "Juan", "Pedro", "Lucia",
            "Ana", "Juan", "Pedro"};
        Histogram<String> histogram = new Histogram(vector);
        HashMap histogramStats = histogram.calculate();
        /*for (Map.Entry<String><Integer> result : histogramStats.entrySet()) {
            System.out.println(result.getKey() + " " +result.getValue());     
        }*/

    }
}
