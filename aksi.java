public class aksi {
    public static void main(String[] args) {

        //class object = new constructor()
        skincare pagi = new skincare();
        skincare malam = new skincare();

        pagi.waktu = "Pagi";
        pagi.step1 = "Cuci Muka";
        pagi.step2 = "Toner";
        pagi.step3 = "Serum";
        pagi.step4 = "Moisturizer";
        pagi.step5 = "Sunscreen";

        malam.waktu = "Malam";
        malam.step1 = "Face Cleanser / Double Cleansing";
        malam.step2 = "Cuci Muka";
        malam.step3 = "Toner";
        malam.step4 = "Serum";
        malam.step5 = "Moisturizer";

        pagi.tampilkanInfo();
        malam.tampilkanInfo();


    }
}