import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class DataMahasiswa1302204085 {
    public static void ReadJSON() {
        try {
            Object obj = new JSONParser().parse(new FileReader("F:\\Kuliah\\Kuliah\\Semester 4\\Konstruksi Perangkat Lunak\\praktikum_kpl\\MOD 6\\modul6_kelompok_4\\src\\jurnal6_1_1302204085.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Nama Depan : "+jsonObject.get("firstName"));
            System.out.println("Nama Belakang : "+jsonObject.get("lastName"));
            System.out.println("Jenis Kelamin : "+jsonObject.get("gender"));
            System.out.println("Umur : "+jsonObject.get("age"));

            JSONObject address = (JSONObject) jsonObject.get("address");
            System.out.println("\nAlamat jalan : "+address.get("streetAddress"));
            System.out.println("Kota : "+address.get("city"));
            System.out.println("Provinsi : "+address.get("state"));

            JSONArray course = (JSONArray) jsonObject.get("courses");
            System.out.println("\nMengikuti mata kuliah :");
            int i = 1;
            Iterator itr = course.iterator();
            while (itr.hasNext()) {
                JSONObject atr = (JSONObject) itr.next();
                System.out.println("MK "+i+" "+atr.get("code")+" - "+atr.get("name"));
                i +=1;
            }
        } catch (FileNotFoundException FE) {
            System.out.println("File tidak ditemukan, periksa ulang path dari file json kembali!");
            FE.printStackTrace();
        } catch (IOException IE) {
            System.out.println("Error "+IE);
            IE.printStackTrace();
        } catch (ParseException PE) {
            System.out.println("Gagal parsing");
            PE.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DataMahasiswa1302204085.ReadJSON();
    }
}
