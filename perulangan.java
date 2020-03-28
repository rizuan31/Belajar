import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu, tambahan;
        int pesanan, nambah;
        System.out.println("Welcome to the store");
        do {
            System.out.println("Menu\n" + "1.Minas\n" + "2.Nasgor\n" + "3.Ayam Geprek\n" + "Buy Something ?");
            menu = sc.next();
        } while (menu.equalsIgnoreCase("no") || (menu.equalsIgnoreCase("tidak")));
        System.out.println("Silahkan tulis menu anda (input berupa angka)");
        pesanan = sc.nextInt();
        //input dengan angaka.
        switch (pesanan) {
            case 1:
                System.out.println("Minas = Rp.10.000,-");
                break;
            case 2:
                System.out.println("Nasgor = Rp.9.000,-");
                break;
            case 3:
                System.out.println("Ayam Geprek = Rp.12.000,-");
                break;
        }
                System.out.println("Ada tambahan ?");
                tambahan = sc.next();
                if (tambahan.equalsIgnoreCase("no") || (tambahan.equalsIgnoreCase("tidak"))) {
                    System.out.println("Silahkan tunggu pesanan anda");
                } else {
                    System.out.println("input pesanan tambahan anda (input berupa angka)");
                }
                nambah = sc.nextInt();
                if (nambah == 1) {
                    System.out.println("+ Minas = Rp.10.000,-\n");
                    if (pesanan == 1) {
                        System.out.println("Total = Rp.20000");
                        System.out.println("Silakan menunggu pesanan anda");
                    } else if (pesanan == 2) {
                        System.out.println("Total = Rp.19000");
                        System.out.println("Silakan menunggu pesanan anda");
                    } else if (pesanan == 3) {
                        System.out.println("Total = Rp.22000");
                        System.out.println("Silakan menunggu pesanan anda");
                    } else {
                        System.out.println("maaf input anda salah mohon input angka (1-3)");
                    }
                } else if (nambah == 2) {
                    System.out.println("Nasgor = Rp.9.000,-\n");
                    if (pesanan == 1) {
                        System.out.println("Total = Rp.19000");
                        System.out.println("Silakan menunggu pesanan anda");
                    } else if (pesanan == 2) {
                        System.out.println("Total = Rp.18000");
                        System.out.println("Silakan menunggu pesanan anda");
                    } else if (pesanan == 3) {
                        System.out.println("Total = Rp.21000");
                        System.out.println("Silakan menunggu pesanan anda");
                    } else {
                        System.out.println("maaf input anda salah mohon input angka (1-3)");
                    }
                } else if (nambah == 3) {
                    System.out.println("Ayam Geprek = Rp.12.000,-\n");
                    if (pesanan == 1) {
                        System.out.println("Total = Rp.22000");
                        System.out.println("Silakan menunggu pesanan anda");
                    } else if (pesanan == 2) {
                        System.out.println("Total = Rp.21000");
                        System.out.println("Silakan menunggu pesanan anda");
                    } else if (pesanan == 3) {
                        System.out.println("Total = Rp.24000");
                        System.out.println("Silakan menunggu pesanan anda");
                    } else {
                        System.out.println("maaf input anda salah mohon input angka (1-3)");
                    }
         }
    }
}
