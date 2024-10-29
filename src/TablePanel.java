import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Predicate;


public class TablePanel extends JPanel implements ActionListener{

    JScrollPane scrollPane;
    JTable table;
    JPanel filterPanel;
    DataFilterPanel[] filters;

    public TablePanel(FilterableTableModel data) {
        setBackground(Color.MAGENTA);
        setPreferredSize(new Dimension(1400, 800));

        filterPanel = new JPanel();
        for (DataFilter[] filterSet : data.getFilterSets()) {
            filterPanel.add(new DataFilterPanel(filterSet));
        }

        filterPanel.setBackground(Color.gray);
        filterPanel.setPreferredSize(new Dimension(1380, 80));

        table = new JTable();
        table.setModel(data);

        scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(1000, 490));
        table.setFillsViewportHeight(true);

        add(filterPanel);
        add(scrollPane);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
