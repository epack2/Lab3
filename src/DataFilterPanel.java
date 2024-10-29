import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DataFilterPanel extends JPanel {

    ArrayList<JCheckBox> filters;


    public DataFilterPanel(DataFilter[] filterSet) {
        filters = new ArrayList<>();
        Arrays.stream(filterSet)
                .map(DataFilter::getFilterName)
                .map(s -> new JCheckBox(s))
                .peek(this::add)
                .forEach(jCheckBox -> filters.add(jCheckBox));

    }

}
