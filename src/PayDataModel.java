import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class PayDataModel implements FilterableTableModel {

    int rowCount;
    int columnCount;
    final String[] columnNames = {"Country", "Country_IsoCode", "Country_IsoNum",
                                  "year", "gavail", "wait",
                                  "dur1m", "dur6m", "dur1y",
                                  "dur5y", "wrr_w1_1m", "wrr_w1_6m",
                                  "wrr_w1_1y", "wrr_w1_5y", "wrr_w2_1m",
                                  "wrr_w2_6m", "wrr_w2_1y", "wrr_w2_5y",
                                  "wrr_w6_1m", "wrr_w6_6m", "wrr_w6_1y",
                                  "wrr_w6_5y", "qualy", "source",
                                  "selfempl", "avail", "paidleave",
                                  "v_eligibility", "v_dur", "v_amount",
                                  "v_generosity"};

    final int[] viewColumns = {0, 1, 2,
                               3, 4, 5,
                               6, 7, 8,
                               9, 10, 11,
                               12, 13, 14,
                               15, 16, 17,
                               18, 19, 20,
                               21, 22, 23,
                               24, 25, 26,
                               27, 28, 29,
                               30};

    final DataFilter[][] filterSets = {
            DiscreteDataFilter.getFilterSet(PayData.IsoCode.values())
    };

    ArrayList<TableModelListener> listners;
    final String fileName = "sickpay.csv";
    Object[][] data;
    boolean[] visibleRows;

    public PayDataModel() {
        columnCount = columnNames.length;
        listners = new ArrayList<>();
        try{
            data = FileReader.readPayData(fileName);
        } catch (IOException e) {
            System.out.println("Can not read the Sick Pay Data file.");

        }
        rowCount = data.length;
        visibleRows = new boolean[rowCount];
        Arrays.fill(visibleRows, true);
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return getValueAt(0, columnIndex).getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][viewColumns[columnIndex]];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    @Override
    public DataFilter[][] getFilterSets() {
        return filterSets;
    }
}
