import java.util.Scanner;
/**
 * ortalamahesaplama
 */
public class ortalamaHesaplama {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int sayi, i = 1, toplam = 0, sayac = 0;
    int ortalama;
    
    System.out.print("Bir Sayı Giriniz: ");
      sayi = input.nextInt();

    while (i <= sayi){
      
        if((i % 3 == 0) && (i % 4 == 0)){
        
          System.out.println(sayi + "'e Kadar Olan ve 3 ile 4'e Bölünebilen Sayı: " + i);
          toplam += i;
          System.out.println("Bir Önceki Sayı İle Toplamı: "+ toplam);
          sayac ++;
          System.out.println("Kaçıncı Dönüşü: "+ sayac + "\n******");
        }
      
      i++;

    }
    ortalama = (toplam / sayac);
    System.out.println("Bu Sonuçlanan Sayıların Toplamının Ortalaması: " + ortalama);


    input.close();
  }
}