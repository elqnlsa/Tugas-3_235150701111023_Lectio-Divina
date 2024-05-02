package Polimorfisme;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PTetap pTetap = new PTetap("Yuji", "350728490327424892342", 2000000.0);
        PHarian pHarian = new PHarian("IU", "350728490327424892343", 8500.0, 40);
        Sales sales = new Sales("Helen", "350728490327424892344", 50, 50000.0);
        
        System.out.println("-------------------------------------------");
        System.out.println(pTetap.toString());
        System.out.println("-------------------------------------------");
        System.out.println(pHarian.toString());
        System.out.println("-------------------------------------------");
        System.out.println(sales.toString());
        System.out.println("--------------------------------------------");


        Pegawai[] pegawai = new Pegawai[3];
        pegawai[0] = pTetap;
        pegawai[1] = pHarian;
        pegawai[2] = sales;
    }
}