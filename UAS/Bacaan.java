public class Bacaan {
    int Id;
    String Judul;
    int JumlahHalaman;
    double Harga;

    void tampilkanInfo(){
        System.out.println("Id : " + Id);
        System.out.println("Judul : " + Judul);
        System.out.println("Jumlah Halaman: " + JumlahHalaman);
        System.out.println("Harga : " + Harga);

    }

    void update (){

    }

    void read(){
        System.out.println("SELECT * FROM Bacaan" );
    }

    void delete(int Id) {
        System.out.println("DELETE FROM Bacaan WHERE Id = " + Id)
    }

    void create( int Id, String Judul, int JumlahHalaman, double Harga){
        String insertSQL = "INSERT INTO Bacaan VALUES (";
        insertSQL += Id + ",";
        insertSQL += "'" + Judul + "',";
        insertSQL += JumlahHalaman + ",";
        insertSQL += Harga + ")";

        System.out.println(insertSQL);
    }

    void read(){
        System.out.println("SELECT * FROM Bacaan WHERE Id = " + Id );
    }
}