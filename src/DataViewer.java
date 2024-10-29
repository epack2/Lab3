import javax.swing.*;
import java.awt.*;
import javax.swing.JTable;

public class DataViewer extends JPanel {

    TablePanel tablePanel;
    //ChartPanel chartPanel;
    //StatsPanel statsPanel;
    //DetailsPanel detailsPanel;

    public DataViewer() {
        setPreferredSize(new Dimension(1000, 1200));

        tablePanel = new TablePanel(new PayDataModel());

        add(tablePanel);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("DataViewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new DataViewer());
        frame.pack();
        frame.setVisible(true);
    }
}
