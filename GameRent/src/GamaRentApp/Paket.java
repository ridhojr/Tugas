package GamaRentApp;

public class Paket {
    private String jenisPaket;
    private int harga;
    Paket(){
        
    }
    
    Paket(String jenisPaket) throws Exception{
        try{
            this.setJenisPaket(jenisPaket);
        } catch(Exception e){
            throw e;
        }
    }
    
    public String getJenisPaket() {
        return jenisPaket;
    }

    public void setJenisPaket(String jenisPaket) throws Exception{
        int a = Integer.parseInt(jenisPaket);
        if(a > 0 && a < 5){
            this.jenisPaket = jenisPaket;
        } else{
            throw new Exception("Hanya ada paket 1 sampai 4");
        }
     
    }

    public int getHarga() {
        int price;
        int p = Integer.parseInt(this.jenisPaket);
        if(p > 0 && p < 2){
            price = 5000;
        } else if(p > 1 && p < 3){
            price = 8000;
        } else{
            price = 10000;
        }
        return price;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}
