import java.util.Scanner;
public class JavaBasicPutri {
    public static void main(String[] args){
         int nilai;

        Scanner skor = new Scanner(System.in);
         
        System.out.println("Masukkan skor anda:");
        nilai = skor.nextInt();

        if(nilai>=101){
            System.out.println("Invalid Number");
        } else if (nilai>=91){
            System.out.println("Nilai Anda; A");
        } else if (nilai>=76){
            System.out.println("Nilai Anda; B");
        } else if (nilai>=51){
            System.out.println("Nilai Anda; C");
        } else if (nilai>=26){
            System.out.println("Nilai Anda; D");
        } else if (nilai>=0){
            System.out.println("Nilai Anda; E");
        }
        System.out.println("SELESAI");

    }
}