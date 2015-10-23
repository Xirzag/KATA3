package histogram;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame {
  private final Histogram<String> histogram;

    public HistogramDisplay(Histogram<String> histogram) {
        super("Histogram");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }

    private ChartPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(600, 400));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart jFreeChart = ChartFactory.createBarChart(
                null, "Dominios", "Número de emails", dataset,
                PlotOrientation.VERTICAL, true, true, false);
        return jFreeChart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String key : histogram.keySet()) {
            System.out.println(histogram.getValueOf(key));
            dataset.addValue(histogram.getValueOf(key), "", key);
        }
        return dataset;
    }

    public void execute() {
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
