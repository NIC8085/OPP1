package Napojee;

public class Napoj_slodki extends Napoje{
    private String poziom_slodkosci;
    String nazwa="NapojSlodki";
    private void sprobuj(){

    }

    @Override
    public String pij() {
        String picie="pite";
        return picie;
    }
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
