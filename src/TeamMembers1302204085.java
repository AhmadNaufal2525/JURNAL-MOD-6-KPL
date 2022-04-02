import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TeamMembers1302204085 {
    public static void ReadJSON() {
        try {
            Object obj = new JSONParser().parse(new FileReader("F:\\Kuliah\\Kuliah\\Semester 4\\Konstruksi Perangkat Lunak\\praktikum_kpl\\MOD 6\\modul6_kelompok_4\\src\\jurnal6_2_1302204085.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray mbr = (JSONArray) jsonObject.get("members");
            System.out.println("\nTeam member list:");
            int i = 1;
            Iterator itr = mbr.iterator();
            while (itr.hasNext()) {
                JSONObject atr = (JSONObject) itr.next();
                System.out.println(atr.get("nim")+" "+atr.get("firstName")+" "+atr.get("lastName")+" ("+atr.get("age")+" "+atr.get("gender")+")");
                i +=1;
            }
        } catch (FileNotFoundException FE) {
            System.out.println("File tidak ada");
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
        TeamMembers1302204085.ReadJSON();
    }
}
