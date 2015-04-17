package GamaRentApp;

public class Pengunjung {
    private String nama;

    Pengunjung(){
        
    }
    
    Pengunjung (String nama) throws Exception{
        try{
            this.setNama(nama);
        
        } catch (Exception e){
            throw e;
        }
    }
    
    public String getNama() {
        return nama;
    }

     public void setNama(String nama) throws Exception{
        for(char k : nama.toCharArray()){
         if(Character.isDigit(k)){  
             throw new Exception("Nama mengandung angka!");
             }
        }
        this.nama = nama;
    }
}
