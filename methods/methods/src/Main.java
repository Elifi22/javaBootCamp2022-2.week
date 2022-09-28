public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
      int[] sayilar =new int[]{1,2,3,4,5,6};
        int aranacak=6;
        boolean varMI=false;

        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMI=true;
                break;
            }
        }
        if (varMI){
           mesajVer("Sayı mevcuttur."+aranacak);;
        } else{
           mesajVer("Sayı mevcut değildir."+aranacak);
        }
    }
    public static void mesajVer(String mesaj){

        System.out.println(mesaj);
    }
}