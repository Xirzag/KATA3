package histogram;

import java.util.HashMap;
import java.util.Map;

public class Histogram <T> {
    
    private HashMap<T, Integer> histogram = new HashMap<>();
    
    public Histogram(T[] data) {
        for (int i = 0; i < data.length; i++) {
            Integer histogramValue = histogram.get(data[i]);
            if(histogramValue == null) histogram.put(data[i], 1);
            else histogram.put(data[i], ++histogramValue);
        }
    }

    public int getHistogramOf(T object){
        Integer histogramValue = histogram.get(object);
        if(histogramValue == null) return 0;
        return histogramValue;
    }
    
    public class HistogramResult{
        private T data;
        private int value;

        public HistogramResult(T data, int value) {
            this.data = data;
            this.value = value;
        }

        public T getData() {
            return data;
        }

        public int getValue() {
            return value;
        }
       
    }
    /*
    public HistogramResult[] getAllHistogram(){
        HistogramResult result[] = new HistogramResult[histogram.size()];
        int i = 0;
        for (Map.Entry<T, Integer> key : histogram.entrySet()) {
            result[i] = key.getKey();
            result[i] = key.getValue();
            i++;
        }
      
        return result;
    }*/
}
