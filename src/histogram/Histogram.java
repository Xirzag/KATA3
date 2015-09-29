package histogram;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    
    private HashMap<Integer, Integer> histogram = new HashMap<>();
    
    public Histogram(int[] data) {
        for (int i = 0; i < data.length; i++) {
            Integer histogramValue = histogram.get(data[i]);
            if(histogramValue == null) histogram.put(data[i], 1);
            else histogram.put(data[i], ++histogramValue);
        }
    }

    public int getHistogramOf(int number){
        Integer histogramValue = histogram.get(number);
        if(histogramValue == null) return 0;
        return histogramValue;
    }
    
    public int[][] getAllHistogram(){
        int result[][] = new int[histogram.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> key : histogram.entrySet()) {
            result[i][0] = key.getKey();
            result[i][1] = key.getValue();
            i++;
        }
      
        return result;
    }
}
