package GamaRentApp;

public class Console {
    private String console;

    Console(){
        
    }
    
    Console (String console) throws Exception{
        try{
            this.setConsole(console);
        
        } catch (Exception e){
            throw e;
        }
    }
    
    public String getConsole() {
        return console;
    }

    public void setConsole(String console) throws Exception{
        int a = Integer.parseInt(console);
        if(a > 0 && a < 7){
            this.console = console;
        } else{
            throw new Exception ("Hanya ada Console 1 sampai 6");
        }
        
    }
    
}
