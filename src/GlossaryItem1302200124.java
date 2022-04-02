import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GlossaryItem1302200124 {
    public static void ReadJSON() {
        try {
            Object obj = new JSONParser().parse(new FileReader("C:\\Users\\Hilmi Fadhillah C\\JURNAL-MOD-6-KPL\\src\\jurnal6_3_1302200124.json"));
            JSONObject jso = (JSONObject) obj;
            JSONObject gl = (JSONObject) jso.get("glossary");
            JSONObject div = (JSONObject) gl.get("GlossDiv");
            JSONObject gll = (JSONObject) div.get("GlossList");
            JSONObject gle = (JSONObject) gll.get("GlossEntry");
            JSONObject gd = (JSONObject) gle.get("GlossDef");
            System.out.println("ID : "+gle.get("ID")+"\nSort as : "+gle.get("SortAs")+"\nGlossTerm : "+gle.get("GlossTerm")+"\nAcronym : "+gle.get("Acronym")+"\nAbbreviation : "+gle.get("Abbrev")+"\nGloss Def :\n\tPara : "+gd.get("para")+"\n\tGloss See Also : "+gd.get("GlossSeeAlso")+"\nGloss See : "+gle.get("GlossSee"));
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
        GlossaryItem1302200124.ReadJSON();
    }
}
