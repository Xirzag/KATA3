package histogram;

public class HistogramProgram {
    public static void main(String[] args) {
        int vector[] = {2,2,11,4,2,6,11,2,3,5,11,5};
        Histogram histogram = new Histogram(vector);
        System.out.println(histogram.getHistogramOf(1));
        System.out.println(histogram.getHistogramOf(2));
        
    }
}
