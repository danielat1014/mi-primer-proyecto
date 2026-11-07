
public class CuentaAhorros extends Cuenta {
    private double tasaInteres;
    private int retirosMesActual;

    public CuentaAhorros(String titular, String numeroCuenta, double saldoInicial, double tasaInteres) {
        super(titular, numeroCuenta, saldoInicial);
        this.tasaInteres = tasaInteres;
        this.retirosMesActual = 0;
    }

    @Override
    public boolean retirar(double monto) {
        if (retirosMesActual >= 3) {
            System.out.println("El Limite de 3 retiros mensuales ya los alcanzaste");
            return false;
        }
        if (monto <= 0 || monto > getSaldo()) {
            System.out.println("El monto es invalido o el saldo es insuficiente");
            return false;
        }
        boolean resultado = super.retirar(monto);
        if (resultado) {
            retirosMesActual++;
            System.out.println("Retiro " + retirosMesActual + " de " + monto + ". Saldo: " + getSaldo());
        }
        return resultado;
    }

    public void aplicarInteres() {
        double interes = getSaldo() * tasaInteres;
        depositar(interes);
        retirosMesActual = 0;
        System.out.println("El interes aplicado es: " + interes +  " brother. ");
        System.out.println("El nuevo saldo es de: " + getSaldo() +  " brother. ") ;
        System.out.println("El contador de retiros se ha reiniciado brother.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("El tipo de cuenta es: Cuenta de Ahorros");
        System.out.println("La tasa de interes es de: " + (tasaInteres * 100) + "%" );
        System.out.println("Brother retiraste este mes: " + retirosMesActual +  " /3 ");
    }
}
