package GamaRentApp;
import java.util.Date;

public class NotaTransaksi {
    private Pengunjung pengunjung;
    private Operator operator;
    private Console console;
    private GameCD gameCD;
    private Paket paket;
    private Date waktuMulai;
    private int biaya;

    public Pengunjung getPengunjung() {
        return pengunjung;
    }

    public void setPengunjung(Pengunjung pengunjung) {
        this.pengunjung = pengunjung;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    public GameCD getGameCD() {
        return gameCD;
    }

    public void setGameCD(GameCD gameCD) {
        this.gameCD = gameCD;
    }

    public Paket getPaket() {
        return paket;
    }

    public void setPaket(Paket paket) {
        this.paket = paket;
    }

    public Date getWaktuMulai() {
        return waktuMulai;
    }

    public void setWaktuMulai(Date waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    
    
}
