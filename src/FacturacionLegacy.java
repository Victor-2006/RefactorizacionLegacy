/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */
public class FacturacionLegacy {

    // Método a refactorizar
    public double calcularTotal(double importe, int tipoCliente, boolean clienteVip) {
        if (importe > 0) {
            if (tipoCliente == 1) {
                if (clienteVip == true)
                    return importe - (importe * 0.25);
                else
                    return importe - (importe * 0.15);
            } else {
                if (tipoCliente == 2) {
                    return importe - (importe * 0.05);
                } else {
                    return importe;
                }
            }
        } else {
            return 0;
        }
    }
}