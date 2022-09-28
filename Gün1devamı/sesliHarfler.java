package Gün1devamı;

public class sesliHarfler {
    public static void main(String[] args) {

     char harf= 'E';

     switch (harf){
         case'A':
         case'I':
         case'O':
         case'U':
             System.out.println("Kalın sesli harf");
             break;
         case 'E':
         case 'İ':
         case 'Ö':
         case 'Ü':

             System.out.println("İnce sesli harf");
             break;
             //bu döngü sağlandığında sonra ki döngüyü tekrar etmesin diye break

             default:
             System.out.println("Geçersiz harf girdiniz");


             }

     }

    }
