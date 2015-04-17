package GamaRentApp;

public class Operator {
    private String nama;
    private String idOperator;

    Operator(){
        
    }
    
    Operator(String nama, String idOperator) throws Exception{
        try{
            this.setIdOperator(idOperator);
        } catch(Exception e){
            throw e;
        }
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

    public String getIdOperator() {
        return idOperator;
    }

    public void setIdOperator(String idOperator)throws Exception {        
             if(idOperator.length() > 4 && idOperator.length() < 6){
                 this.idOperator = idOperator;
             } else{
                 throw new Exception("ID Operator harus 5 digit");
        }
        
    }
    
}
