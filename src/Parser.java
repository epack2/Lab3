import java.util.Objects;
import java.util.Scanner;

public class Parser {

    public static int parseInt(String text) {
        int result = 0;
        try {
            result = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            Scanner scanner = new Scanner(text);

            result = -1;
        }

        return result;
    }

    public static double parseDouble(String text) {
        double result = 0;
        try {
            result = Double.parseDouble(text);
        } catch (NumberFormatException e) {
            Scanner scanner = new Scanner(text);
            if (Objects.equals(scanner.next(), ".a"))
                result = 4;
            else
                result = -1;
        }
        return result;
    }

    public static PayData parsePayData(String[] data) {
        PayData datum = new PayData(//country
                Parser.parseInt(data[0]),
                //countryisocode
                PayData.IsoCode.parseIsoCode(data[1]),
                //countryisonum
                Parser.parseInt(data[2]),
                //year
                Parser.parseInt(data[3]),
                //gavail
                Parser.parseInt(data[4]),
                //weekwait
                Parser.parseInt(data[5]),
                //dur1m
                Parser.parseInt(data[6]),
                //dur6m
                Parser.parseInt(data[7]),
                //dur1y
                Parser.parseInt(data[8]),
                //dur5y
                Parser.parseInt(data[9]),
                //wagerepwk1_1m
                Parser.parseInt(data[10]),
                //wagerepwk1_6m
                Parser.parseInt(data[11]),
                //wagerepwk1_1y
                Parser.parseInt(data[12]),
                //wagerepwk1_5y
                Parser.parseInt(data[13]),
                //wagerepwk2_1m
                Parser.parseInt(data[14]),
                //wagerepwk2_6m
                Parser.parseInt(data[15]),
                //wagerepwk2_1y
                Parser.parseInt(data[16]),
                //wagerepwk2_5y
                Parser.parseInt(data[17]),
                //wagerepwk6_1m
                Parser.parseInt(data[18]),
                //wagerepwk6_6m
                Parser.parseInt(data[19]),
                //wagerepwk6_1y
                Parser.parseInt(data[20]),
                //wagerepwk6_5y
                Parser.parseInt(data[21]),
                //qualy
                Parser.parseInt(data[22]),
                //source
                Parser.parseInt(data[23]),
                //selfempl
                Parser.parseInt(data[24]),
                //avail
                Parser.parseInt(data[25]),
                //paidleave
                Parser.parseInt(data[26]),
                //velig
                Parser.parseDouble(data[27]),
                //vdur
                Parser.parseDouble(data[28]),
                //vamn
                Parser.parseDouble(data[29]),
                //vgen
                Parser.parseDouble(data[30])
        );
        return datum;

    }


}
