package Napojee;

public class Woda extends Napoje {

    private Boolean gazowana;
    private String nazwa="Woda";
    private void gazuj(){

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
