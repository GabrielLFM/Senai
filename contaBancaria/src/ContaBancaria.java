public class ContaBancaria {

    private double deposito;
    private double saque;
    private double saldo;
    private int opc = 0;

    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }
    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getOpc() {
        return opc;
    }
    public void setOpc(int opc) {
        this.opc = opc;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "deposito=" + deposito +
                ", saque=" + saque +
                ", saldo=" + saldo +
                '}';
    }
}
