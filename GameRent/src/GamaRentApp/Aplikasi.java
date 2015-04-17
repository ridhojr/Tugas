package GamaRentApp;
import java.util.Date;

public class Aplikasi {

    public static void main(String[] args) {
        Pengunjung pengunjung1 = new Pengunjung();
        
        try{
            pengunjung1.setNama("Si dia");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        Operator operator1 = new Operator();
        
        try{
            operator1.setNama("Ridho Juniar"); 
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        try{
            operator1.setIdOperator("A1378");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        Console consoleA = new Console(); 
        
        try{
            consoleA.setConsole("1");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        GameCD gameA = new GameCD();
        gameA.setJudul("Magna Carta");
        
        Paket paketA = new Paket();
        
        try{
            paketA.setJenisPaket("2");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        NotaTransaksi nota1 = new NotaTransaksi();
        nota1.setOperator(operator1);
        nota1.setPengunjung(pengunjung1);
        nota1.setConsole(consoleA);
        nota1.setGameCD(gameA);
        nota1.setPaket(paketA);
        nota1.setWaktuMulai(new Date());
        nota1.setBiaya(paketA.getHarga());
        
        printNota(nota1);
    }

    static void printNota(NotaTransaksi nota){
        System.out.println("\tData Transaksi");
        System.out.println("Pelanggan\t: "+nota.getPengunjung().getNama());
        System.out.println("Menggunakan\t: Console "+nota.getConsole().getConsole());
        System.out.println("Game\t\t: "+nota.getGameCD().getJudul());
        System.out.println("Paket\t\t: "+nota.getPaket().getJenisPaket());
        System.out.println("Harga\t\t: "+nota.getBiaya());
        System.out.println("Waktu mulai\t: "+nota.getWaktuMulai());
        System.out.println("Operator\t: "+nota.getOperator().getNama()+" ID: "+nota.getOperator().getIdOperator());
        System.out.println("\tTerima Kasih");
    }
    
}
