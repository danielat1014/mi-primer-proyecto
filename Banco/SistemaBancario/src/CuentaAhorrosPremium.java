public final class CuentaAhorrosPremium extends CuentaAhorros {
    private double comisionPorRetiro;

    public CuentaAhorrosPremium(String titular, String numeroCuenta, double saldoInicial, double tasaInteres, double comision) {
        super(titular, numeroCuenta, saldoInicial, tasaInteres);
        this.comisionPorRetiro = comision;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto es invalido brother");
            return false;
        }
        double totalADescontar = monto + comisionPorRetiro;
        if (totalADescontar > getSaldo()) {
            System.out.println(
                "Saldo insuficiente para cubrir retiro + comision de " + comisionPorRetiro + " Brother. ");
            return false;
        }
        boolean resultado = super.retirar(totalADescontar);
        if (resultado) {
            System.out.println("Retiro de " + monto + " + comision " + comisionPorRetiro + " Saldo: " + getSaldo());
        }
        return resultado;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("El tipo de cuenta es: Cuenta Premium brother. ");
        System.out.println("La comision por retiro es de: " + comisionPorRetiro + " brother. ");
        System.out.println("No tienes limites de retiros mensuales brother");
    }
}
