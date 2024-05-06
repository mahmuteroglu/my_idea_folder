package DE32_Enum.enum5;

public enum ILLER {
    ADANA("01"),
    ADIYAMAN("02"),
    ANKARA("06"),
    ISTANBUL("34"),
    IZMIR("35"),
    SANLURFA("63"),
    TRABZON("61");

    private final String plkCode;

    ILLER(String plkCode) { // constructor
        this.plkCode = plkCode;
    }

    public String getPlkCode() { // getter
        return plkCode;
    }

    public static ILLER getIL(String pKodu){
        ILLER il =null;
        for (ILLER val:ILLER.values()){
            if (val.getPlkCode().equals(pKodu)) il=val;
        }
        return il;
    }
}
