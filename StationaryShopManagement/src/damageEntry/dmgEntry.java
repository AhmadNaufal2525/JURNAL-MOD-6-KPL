package damageEntry;

public class dmgEntry {
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("-----------MENU BARANG----------");
        System.out.println("================================");
        // Scanner inputData = new Scanner(System.in);
        // System.out.print("Masukkan nama barang: ");
        // String str = inputData.nextLine();
        // listItem(Item);
        String item[] = {
                "Buku Tulis", "Buku Tulis", "Penghapus", "Pulpen", "Penggaris",
                "Pensil Buku", "Pensil Buku", "Spidol", "Stabilo",
        };
        for (int i = 0; i <= item.length; i++) {
            System.out.println(item[i]);
        }
    }
}
