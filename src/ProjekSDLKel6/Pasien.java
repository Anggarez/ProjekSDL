package ProjekSDLKel6;


public class Pasien implements Comparable{
    private String nama;
    private String penyakit;
    private int umur;
    private int noantri;
    

    public Pasien(){
    
    }
    
    public Pasien(String nama, String penyakit, int umur, int noantri){
        this.nama=nama;
        this.penyakit=penyakit;
        this.umur=umur;
        this.noantri=noantri;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setPenyakit(String penyakit){
        this.penyakit=penyakit;
    }
    
    public String getPenyakit(){
        return penyakit;
    }
    
    public void setUmur(int umur){
        this.umur=umur;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setNoAntri(int noantri){
        this.noantri=noantri;
    }
    
    public int getNoAntri(){
        return noantri;
    }
    
    public String toString(){
        return "\nNomor Antrian : "+noantri+"\nNama : "+nama+"\nPenyakit : "+penyakit+"\nUmur : "+umur+"\n";
    }

    @Override
    public int compareTo(Object o) {
                if (noantri == ((Pasien) o).getNoAntri()) {
            return 0;
        } else if (noantri > ((Pasien) o).getNoAntri()) {
            return 1;
        } else {
            return -1;
        }
    }
}
