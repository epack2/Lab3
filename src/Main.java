import javax.swing.*;
import java.util.ArrayList;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException{

    }



    private static void printJournalData(PayData data) {
        System.out.println();
        System.out.println();
        System.out.println("Data");
        System.out.println("Country: \t" + data.country());
        System.out.println("countryisocode: \t" + data.countryIsoCode());
        System.out.println("countryisonum: \t" + data.countryIsoNum());
        System.out.println("year: \t" + data.year());
        System.out.println("gavail: \t" + data.gavail());
        System.out.println("weekwait: \t" + data.weekwait());
        System.out.println("dur1m: \t" + data.dur1m());
        System.out.println("dur6m: \t" + data.dur6m());
        System.out.println("dur1y: \t" + data.dur1y());
        System.out.println("dur5y: \t" + data.dur5y());
        System.out.println("wagerepwk1_1m: \t" + data.wagerepwk1_1m());
        System.out.println("wagerepwk1_6m: \t" + data.wagerepwk1_6m());
        System.out.println("wagerepwk1_1y: \t" + data.wagerepwk1_1y());
        System.out.println("wagerepwk1_5y: \t" + data.wagerepwk1_5y());
        System.out.println("wagerepwk2_1m: \t" + data.wagerepwk2_1m());
        System.out.println("wagerepwk2_6m: \t" + data.wagerepwk2_6m());
        System.out.println("wagerepwk2_1y: \t" + data.wagerepwk2_1y());
        System.out.println("wagerepwk2_5y: \t" + data.wagerepwk2_5y());
        System.out.println("wagerepwk6_1m: \t" + data.wagerepwk6_1m());
        System.out.println("wagerepwk6_6m: \t" + data.wagerepwk6_6m());
        System.out.println("wagerepwk6_1y: \t" + data.wagerepwk6_1y());
        System.out.println("wagerepwk6_5y: \t" + data.wagerepwk6_5y());
        System.out.println("qualy: \t" + data.qualy());
        System.out.println("source: \t" + data.source());
        System.out.println("selfempl: \t" + data.selfempl());
        System.out.println("avail: \t" + data.availa());
        System.out.println("paidleave: \t" + data.paidleave());
        System.out.println("velig: \t" + data.velig());
        System.out.println("vdur: \t" + data.vdur());
        System.out.println("vamn: \t" + data.vamn());
        System.out.println("vgen: \t" + data.vgener());
    }
}