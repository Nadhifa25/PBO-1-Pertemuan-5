package model;

public class Komik extends Buku {
    private int volume;

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setTahunTerbit(int tahunTerbit) {
        System.out.println("Ini dari Overriding");
    }

}