package DE24_Encapsulation.Tasks.task04;

class Runner {
    /*
     Runner class  içinde;
    userName rent is amountOfRent
    (... kiracı nın datalarını -> oda saysı, balkon isteği ,kira miktarı) print eden code cre
     */
    public static void main(String[] args) {
        RentApartment kk = new RentApartment();
        kk.setName("Hasan");
        kk.setRoomCount(3);
        kk.setBalconyOrNo(true);
        System.out.println(kk);
    }
}
