package damageEntry;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class dmgEntry {
    private String CONFIG1 = "Rusak";
    private int CONFIG2 = 20;
    private String CONFIG3 = "Barang pada toko dalam kondisi rusak";
    private String CONFIG4 = "Barang pada toko dalam kondisi normal";

    public dmgEntry(String path) {
        try {
            JSONParser jp = new JSONParser();
            Object obj = jp.parse(new FileReader(path));
            JSONObject jso = (JSONObject) obj;
            CONFIG1 = (String)jso.get("Kondisi_Barang");
            CONFIG2 = (int)jso.get("Jumlah_Barang");
            CONFIG3 = (String)jso.get("Barang_rusak");
            CONFIG4 = (String)jso.get("Barang_normal");
        } catch (Exception e) {
            WriteJson(path);
        }
    }
    public void WriteJson(String path){
        JSONObject jso = new JSONObject();
        jso.put("Kondisi suatu barang", this.CONFIG1);
        jso.put("Jumlah barang", this.CONFIG2);
        jso.put("Barang rusak", this.CONFIG3);
        jso.put("Barang normal", this.CONFIG4);
        try {
            FileWriter file = new FileWriter(path);
            file.write(jso.toString());
            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void setKondisiBarang(String sat){
        this.CONFIG1 = sat;
    }
    public void setJumlahBarang(int hari){
        this.CONFIG2 = hari;
    }
    public void setPesanBarangRusak(String msg){
        this.CONFIG3 = msg;
    }
    public void setPesanBarangNormal(String msg){
        this.CONFIG4 = msg;
    }
    public String getKondisiBarang(){
        return this.CONFIG1;
    }
    public int getJumlahBarang(){
        return this.CONFIG2;
    }
    public String getPesanBarangRusak(){
        return this.CONFIG3;
    }
    public String getPesanBarangNormal(){
        return this.CONFIG4;
    }
}
