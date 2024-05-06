package DE24_Encapsulation.Tasks.task04;

public class RentApartment {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    public int kiraHesapla(){
        int rent;
        switch (roomCount){
            case 0 : rent=1400 ; break;
            case 1 : rent=1700 ; break;
            case 2 : rent=2200 ; break;
            case 3 : rent=2700 ; break;
            default: rent=2700;
        }
        if (balconyOrNo) rent+=200;

        return rent;
    }

    @Override
    public String toString() {
        String balkon="yok";
        if (balconyOrNo) balkon="var";
        return "İsim         = " + name +
                "\nOda sayısı   = " + roomCount +
                "\nBalcony      = " + balkon +
                "\nKira Tutarı  = " + kiraHesapla();
    }
    //     4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
//    -----------------------------------------------------------------
//    Bir method oluşturun;
//    Eğer room sayısı 0 ise,
//    rent(kira) 1400
//    Eğer oda sayısı 1 ise,
//    rent  1700
//    Eğer oda sayısı 2 ise,
//    rent 2200
//    Eğer oda sayısı 3 ise,
//    rent 2700
//    rent'i return'leyin.
}
