class Koran extends Bacaan {
    String Penerbit;

    void read(){
        System.out.println("SELECT * FROM Bacaan WHERE Penerbit = " + Penerbit );
    }
}