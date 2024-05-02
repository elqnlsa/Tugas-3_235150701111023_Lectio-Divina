package Polimorfisme;

public class PHarian extends Pegawai {
    private double upah;
    private int jam;

    public PHarian(String name, String noKTP, double upahPerJam, int totalJam){
        super(name, noKTP);
        setUpah(upahPerJam);
        setJam(totalJam);
    }

    public void setUpah(double upahPerJam){
        upah = upahPerJam;
    }

    public double getUpah(){
        return upah;
    }

    public void setJam(int totalJam){
        jam = totalJam;
    }

    public int getJam(){
        return jam;
    }

    public double gaji(){
        if(getJam() <= 40){
            return getUpah() * getJam();
        } else {
            return 40 * getUpah() + (getJam()-40) * getUpah() * 1.5;
        } 
    }

    public String toString(){
        return String.format(
            "\nPegawai harian     : " + super.toString() + 
            "\nUpah/jam           : " + "Rp " + getUpah() + 
            "\nTotal jam kerja    : " + getJam() + 
            "\nPendapatan         : " + "Rp " + (int) gaji()  
        );
    }
}
