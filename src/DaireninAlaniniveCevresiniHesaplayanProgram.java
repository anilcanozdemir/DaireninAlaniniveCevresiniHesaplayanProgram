import java.util.Scanner;


/**
 * @author ANIL CAN ÖZDEMİR
 * Dairenin Alanını ve Çevresini Hesaplayan Program
 * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
 *
 * Alan Formülü : π * r * r;
 *
 * Çevre Formülü : 2 * π * r;
 */

public class DaireninAlaniniveCevresiniHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Yarıçapı giriniz");
        double r=input.nextDouble();
        double alan = Math.PI * r * r;
        double cevre = Math.PI*2*r;
        System.out.println("Alan"+alan);
        System.out.println("Cevre:"+cevre);
    }
}
