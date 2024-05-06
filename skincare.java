public class skincare{
    String waktu;
    String step1;
    String step2;
    String step3;
    String step4;
    String step5;

    void tampilkanInfo(){
        System.out.println("Langkah Skincare " + waktu);
        System.out.println("Langkah 1 : " + step1);
        System.out.println("Langkah 2 : " + step2);
        System.out.println("Langkah 3 : " + step3);
        System.out.println("Langkah 4 : " + step4);
        System.out.println("Langkah 5 : " + step5);

    }

    void create(){
        System.out.println("SELECT * FROM skincare");
    }

    void delete(int id) {
        System.out.println("DELETE FROM skincare");
    }
}