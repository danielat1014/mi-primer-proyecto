public abstract class Cuenta {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("El deposito es de " + monto + " realizado, Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto debe ser positivo para depositar ");
        }
    }

    public void depositar(double monto, String concepto) {
        if (monto > 0) {
        saldo += monto;
            System.out.println("El deposito de " + monto + " por concepto " + concepto + " Nuevo saldo es de: " + saldo);
        } else {
            System.out.println("El monto debe ser positivo");
        }
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto no es invalido");
            return false;
        }
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " exitoso. Saldo restante: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public void mostrarInfo() {
        System.out.println("Información de Cuenta ");
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }
}
