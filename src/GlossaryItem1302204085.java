import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GlossaryItem1302204085 {
    public static void ReadJSON() {
        try {
            Object obj = new JSONParser().parse(new FileReader("F:\\Kuliah\\Kuliah\\Semester 4\\Konstruksi Perangkat Lunak\\praktikum_kpl\\MOD 6\\modul6_kelompok_4\\src\\jurnal6_3_1302204085.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject gl = (JSONObject) jsonObject.get("glossary");
            JSONObject div = (JSONObject) gl.get("GlossDiv");
            JSONObject gll = (JSONObject) div.get("GlossList");
            JSONObject gle = (JSONObject) gll.get("GlossEntry");
            JSONObject gd = (JSONObject) gle.get("GlossDef");
            System.out.println("ID : "+gle.get("ID")+"\nSort as : "+gle.get("SortAs")+"\nGlossTerm : "+gle.get("GlossTerm")+"\nAcronym : "+gle.get("Acronym")+"\nAbbreviation : "+gle.get("Abbrev")+"\nGloss Def :\n\tPara : "+gd.get("para")+"\n\tGloss See Also : "+gd.get("GlossSeeAlso")+"\nGloss See : "+gle.get("GlossSee"));
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
        GlossaryItem1302204085.ReadJSON();
    }
}
