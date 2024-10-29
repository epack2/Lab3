import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class Table extends JFrame{
    public Table() {
        //headers for the table
        String[] columns = new String[]{
                "Id", "Name", "Hourly Rate", "Part Time"
        };

        //actual data for the table in a 2d array
        Object[][] data = new Object[][]{
                {1, "John", 40.0, false},
                {2, "Mary", 30.0, false},
                {3, "Jane", 20.0, true},
        };
        final Class[] columnClass = new Class[]{
                Integer.class, String.class, Double.class, Boolean.class
        };
        //create table model with data
        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            public Class<?> getColumnClass(int columnIndex)
            {
                return columnClass[columnIndex];
            }
        };

        //create table with data


        JTable table2 = new JTable(model);

        //add the table to the frame
        this.add(new JScrollPane(table2));

        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }


}
