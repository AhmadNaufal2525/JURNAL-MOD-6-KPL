import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class DataMahasiswa_1302204115 {
    public static void ReadJSON() {
        try {
            Object obj = new JSONParser().parse(new FileReader("/Users/jeremiacarlo/Code/Java/KPL/JURNAL/KPL_MOD6_1302204115_DHF/JURNAL-MOD-6-KPL/src/jurnal6_1_1302204115.json"));
            JSONObject jso = (JSONObject) obj;
            System.out.println("Nama "+jso.get("firstName")+" "+jso.get("lastName")+"\nUmur : "+jso.get("age")+"\nJenis kelamin : "+jso.get("gender")+"\n");
            JSONObject adr = (JSONObject) jso.get("address");
            System.out.println("Alamat jalan : "+adr.get("streetAddress")+"\nKota : "+adr.get("city")+"\nProvinsi : "+adr.get("state"));
            JSONArray crs = (JSONArray) jso.get("courses");
            System.out.println("\nMengikuti mata kuliah :");
            int i = 1;
            Iterator itr = crs.iterator();
            while (itr.hasNext()) {
                JSONObject atr = (JSONObject) itr.next();
                System.out.println("MK "+i+" "+atr.get("code")+" - "+atr.get("name"));
                i +=1;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ada");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error "+e);
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Gagal parsing");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DataMahasiswa_1302204115.ReadJSON();
    }
}
