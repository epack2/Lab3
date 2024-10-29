public record PayData(int country, IsoCode countryIsoCode, int countryIsoNum, int year, int gavail, int weekwait, int dur1m, int dur6m, int dur1y, int dur5y, int wagerepwk1_1m, int wagerepwk1_6m, int wagerepwk1_1y, int wagerepwk1_5y, int wagerepwk2_1m, int wagerepwk2_6m, int wagerepwk2_1y, int wagerepwk2_5y, int wagerepwk6_1m, int wagerepwk6_6m, int wagerepwk6_1y, int wagerepwk6_5y, int qualy, int source, int selfempl, int availa, int paidleave, double velig, double vdur, double vamn, double vgener){

    public enum IsoCode {
        AL, AT, BE, BG, HR, CY, CZ, DK, EE, FI, FR, DE, HU, IS, IE, IT, LV, LT, LU, MT, ME, NL, MK, NO, PL, PT, RO, RS, SK, SI, ES, SE, CH, TR, GB;
        public static IsoCode parseIsoCode(String countryIsoCode) {
            switch(countryIsoCode.strip()) {
                case "AL": return AL;
                case "AT": return AT;
                case "BE": return BE;
                case "BG": return BG;
                case "HR": return HR;
                case "CY": return CY;
                case "CZ": return CZ;
                case "DK": return DK;
                case "EE": return EE;
                case "FI": return FI;
                case "FR": return FR;
                case "DE": return DE;
                case "HU": return HU;
                case "IS": return IS;
                case "IE": return IE;
                case "IT": return IT;
                case "LT": return LT;
                case "LU": return LU;
                case "MT": return MT;
                case "NL": return NL;
                case "MK": return MK;
                case "NO": return NO;
                case "PL": return PL;
                case "PT": return PT;
                case "RO": return RO;
                case "RS": return RS;
                case "SK": return SK;
                case "SI": return SI;
                case "ES": return ES;
                case "CH": return CH;
                case "TR": return TR;
                case "GB": return GB;
                default: return null;
            }
        }

    }

    public Object[] toObjectArray(){
        return new Object[]{country, countryIsoCode, countryIsoNum, year, gavail, weekwait, dur1m, dur6m, dur1y, dur5y, wagerepwk1_1m, wagerepwk1_6m, wagerepwk1_1y, wagerepwk1_5y, wagerepwk2_1m, wagerepwk2_6m, wagerepwk2_1y, wagerepwk2_5y, wagerepwk6_1m, wagerepwk6_6m, wagerepwk6_1y, wagerepwk6_5y, qualy, source, selfempl, availa, paidleave, velig, vdur, vamn, vgener};
    }

}
