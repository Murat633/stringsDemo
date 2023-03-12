import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel...";
        out.println(topla(1,2,3,55,999,4,8));

        class DB {
            int createProduct(){
                return 5;
            }
        }

         /*
        System.out.println("Elman Sayısı :" + mesaj.length());

        System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println(mesaj.startsWith("Bu"));
        System.out.println(mesaj.endsWith(".."));

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("Hava"));
        System.out.println(mesaj.lastIndexOf("Hava"));*/

        /*String yeniMesaj = mesaj.replace(" ","-").toLowerCase();


        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));

        for(String kelime:mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());*/

        //        int[] sayilar = {1,2,54,8,9,8795,8795,455,665,666};
        //        for(int sayi:sayilar){
        //            if(sayi%2==0){
        //                /*out.println("sayi Çifttir ==> " + sayi );*/
        //                continue;
        //            }else {
        //                out.println("sayi tektir ==> " + sayi);
        //            }
        //        }
        //        char harf = 'A';
        //        switch (harf){
        //            case 'A':
        //            case 'I':
        //            case 'O':
        //            case 'U':
        //                out.println("Harf Kalın Seslidie");
        //                break;
        //            default:
        //                out.println("İnce Sesli Harf");
        //        }
        //


        // Mükemmel Sayı

//        int number = 6;
//        int total = 0;
//        for(int i = 1; i < number;i++){
//            if(number % i == 0){
//                total=total+i;
//            }
//        }
//
//        if(total==number){
//            out.println(number + " Mükemmel Sayıdır.");
//        }
    }
    public static int topla(int... sayilar){
        int toplam = 0;
            for (int sayi:sayilar){
                toplam+=sayi;
            }
        return toplam;
    }
}