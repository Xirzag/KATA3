package histogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HistogramProgram {
    public static void main(String[] args) {
        //int vector[] = {2,2,11,4,2,6,11,2,3,5,11,5};
        String vector[] = {"Ana", "Juan", "Pedro", "Lucia",
            "Ana", "Juan", "Pedro"};
        Histogram<String> histogram = CalculaHisto.computeHistogram(vector);
        /*HashMap histogramStats = histogram.calculate();
        for (Iterator it = histogramStats.entrySet().iterator(); it.hasNext();) {
            Map.Entry result = (Map.Entry) it.next();     
            System.out.println(result.getKey() + " " +result.getValue());
        }*/
        
        for(Map.Entry result : histogram.keySet()) {
            System.out.println(result.getKey() + " " +result.getValue());
        }

    }
}
