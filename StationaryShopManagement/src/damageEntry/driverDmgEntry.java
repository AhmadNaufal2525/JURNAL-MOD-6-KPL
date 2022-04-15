package damageEntry;

import java.util.Scanner;

public class driverDmgEntry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dmgEntry cfg = new dmgEntry("dmgEntry.json");
        System.out.print("Jumlah Barang? dalam kondisi "+cfg.getKondisiBarang()+" : "); int jumlah = Integer.valueOf(input.nextLine());
        System.out.print("Berapa hari barang akan dipulihkan ? : "); int hari = Integer.valueOf(input.nextLine());

        boolean gate1 = false;
        boolean gate2 = false;

        if (cfg.getKondisiBarang() == "Normal") {
            if (jumlah > 0 && jumlah <= 10) {
                gate1 = true;
            }
        }else if (cfg.getKondisiBarang() == "Rusak") {
            if (jumlah > 0 && jumlah <= 10) {
                gate1 = true;
            }
        }
        if (hari < cfg.getJumlahBarang()){
            gate2 = true;
        }
        if (gate1 && gate2){
            System.out.println(cfg.getPesanBarangNormal());
        }else{
            System.out.println(cfg.getPesanBarangRusak());
        }
        System.out.print("Ganti Kondisi Barang : ");
        cfg.setKondisiBarang(input.nextLine());
        cfg.WriteJson("dmgEntry.json");
    }
}
