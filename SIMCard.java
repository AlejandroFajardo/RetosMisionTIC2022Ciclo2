package Reto1Var2SIM;

public class SIMCard {
    
    private String empresaTelefonia;
    private double saldo;
    private String numeroTelefono;
    private boolean celularApagado;
    private boolean modoAvionActivado;
    private boolean datosActivados;
    private int saldoDatos;

    public SIMCard(String numeroTelefono) {
        this.empresaTelefonia = "HI";
        this.saldo = 0;
        this.celularApagado = true;
        this.modoAvionActivado = false;
        this.datosActivados = false;
        this.saldoDatos = 0;
        this.numeroTelefono = numeroTelefono;
    }
    
    public void comprarDatos(int c){
        int costo = 0;
        if (c <= 10) {
            costo = c * 3000;
        }else if (c > 10 && c <= 30) {
            costo = (10 * 3000) + ((c - 10) * 2500);
        }else if(c > 30){
            costo = (20 * 3000) + ((c - 20) * 1500);
        }
        if (costo < saldo) {
            saldo -= costo;
            saldoDatos += c;
        }
    }
    
    public void consumirDatos(int c){
        if (!celularApagado && !modoAvionActivado && datosActivados) {
            if (c < saldoDatos) {
                saldoDatos -= c;
            }
        }
    }
    
    public void llamar(int s){
        if (!celularApagado && !modoAvionActivado) {
            double costo = 0;
            if (s <= 60) {
                costo = s * 1;
            }else{
                costo = (60 * 1) + ((s - 60) * 0.5);
            }
            if (costo < saldo) {
                saldo -= costo;
            }
        }
    }
    
    public void recargarSaldo(double s){
        saldo += s;
    }
    
    public void gestionarEncendidoCelular(){
        if (celularApagado) {
            celularApagado = false;
        }else{
            celularApagado = true;
            datosActivados = false;
            modoAvionActivado = false;
        }
    }
    
    public void gestionarModoAvion(){
        if (!celularApagado && !modoAvionActivado) {
            modoAvionActivado = true;
            datosActivados = false;
        }else if (!celularApagado && modoAvionActivado) {
            modoAvionActivado = false;
        }
    }
    
    public void gestionarDatos(){
        if (!celularApagado && !modoAvionActivado && !datosActivados) {
            datosActivados = true;
        }else if(datosActivados){
            datosActivados = false;
        }
    }

    public String getEmpresaTelefonia() {
        return empresaTelefonia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public boolean isCelularApagado() {
        return celularApagado;
    }

    public boolean isModoAvionActivado() {
        return modoAvionActivado;
    }

    public boolean isDatosActivados() {
        return datosActivados;
    }

    public int getSaldoDatos() {
        return saldoDatos;
    }

    public void setEmpresaTelefonia(String empresaTelefonia) {
        this.empresaTelefonia = empresaTelefonia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setCelularApagado(boolean celularApagado) {
        this.celularApagado = celularApagado;
    }

    public void setModoAvionActivado(boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }

    public void setDatosActivados(boolean datosActivados) {
        this.datosActivados = datosActivados;
    }

    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }

    @Override
    public String toString() {
        return "Empresa " + empresaTelefonia + " saldo " + saldo + " telefono " + numeroTelefono + " apagado " + 
                celularApagado + " avion " + modoAvionActivado + " datos " + datosActivados + " saldo datos " + saldoDatos;
    }
    
    
    public static void main(String[] args) {
        SIMCard s = new SIMCard("3015328969");
        System.out.println(s.toString());
        s.recargarSaldo(50000);
        System.out.println(s.toString());
        s.comprarDatos(12);
        System.out.println(s.toString());
        s.consumirDatos(3);
        System.out.println(s.toString());
        s.gestionarEncendidoCelular();
        s.llamar(120);
        System.out.println(s.toString());
        s.gestionarModoAvion();
        s.gestionarDatos();
        System.out.println(s.toString());
        s.gestionarModoAvion();
        s.gestionarDatos();
        System.out.println(s.toString());
        s.consumirDatos(3);
        System.out.println(s.toString());
        s.gestionarEncendidoCelular();
        System.out.println(s.toString());
    }
}
