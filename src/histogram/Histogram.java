package histogram;

import java.util.HashMap;
import java.util.Map;

public class Histogram <T> {
    
    private final Map<T, Integer> histogram;
    
    public Integer increment(T key) {
        return histogram.put(key, histogram.containsKey(key)? histogram.get(key) : 1);
    }
    
    public Map<T, Integer> calculate(T[] vector){
        for (T key : vector) {
            Integer value = histogram.get(key);
            if(value == null) histogram.put(key, 1);
            else histogram.put(key, ++value);
        }
        return histogram;
    }
    
    public int getValueOf(T key) {
        return histogram.get(key);
    }
}
