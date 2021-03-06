package histogram;

public class HistogramBuilder {
    public static <T> Histogram <T> computeHistogram (T[] vector) {
        Histogram<T> histogram = new Histogram<>();
        for(T element : vector) 
            histogram.increment(element);
        
        return histogram;
    }
}
