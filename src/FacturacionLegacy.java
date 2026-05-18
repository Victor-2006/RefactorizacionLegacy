/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */
public class FacturacionLegacy {
    private static final double DESCUENTO_VIP = 0.25;
    private static final double DESCUENTO_ESTANDAR = 0.15;
    private static final double DESCUENTO_CLIENTE_TIPO2 = 0.05;
    // Método a refactorizar
    public double calcularTotal(double importe, int tipoCliente, boolean clienteVip) {
        if (importe > 0) {
            if (tipoCliente == 1) {
                if (clienteVip == true)
                    return importe - (importe * DESCUENTO_VIP);
                else
                    return importe - (importe * DESCUENTO_ESTANDAR);
            } else {
                if (tipoCliente == 2) {
                    return importe - (importe * DESCUENTO_CLIENTE_TIPO2);
                } else {
                    return importe;
                }
            }
        } else {
            return 0;
        }
    }
}