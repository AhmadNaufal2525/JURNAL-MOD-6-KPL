import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TeamMembers1302204057 {
    public static void ReadJSON() {
        try {
            Object obj = new JSONParser().parse(new FileReader("D:\\Kuliah\\Semester 4\\Konstruksi Perangkat Lunak\\Jurnal\\JURNAL-MOD-6-KPL\\src\\jurnal6_2_1302204057.json"));
            JSONObject jso = (JSONObject) obj;
            JSONArray mbr = (JSONArray) jso.get("members");
            System.out.println("\nTeam member list:");
            int i = 1;
            Iterator itr = mbr.iterator();
            while (itr.hasNext()) {
                JSONObject atr = (JSONObject) itr.next();
                System.out.println(atr.get("nim")+" "+atr.get("firstName")+" "+atr.get("lastName")+" ("+atr.get("age")+" "+atr.get("gender")+")");
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
        TeamMembers1302204057.ReadJSON();
    }
}