package histogram;

public class Main {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        
        HistogramDisplay hd = new HistogramDisplay(histogram);
        hd.execute();

    }
}
