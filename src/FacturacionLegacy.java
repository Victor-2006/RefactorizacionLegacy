/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */
public class FacturacionLegacy {
    private static final double DESCUENTO_VIP = 0.25;
    private static final double DESCUENTO_ESTANDAR = 0.15;
    private static final double DESCUENTO_CLIENTE_TIPO2 = 0.05;
    // Método a refactorizar
    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
        if (importeBase <= 0) {
            return 0;
        }
        if (tipoCliente == 1) {

            if (esSocioVip) {
                return importeBase - (importeBase * DESCUENTO_VIP);
                        }

                return importeBase - (importeBase * DESCUENTO_ESTANDAR);
            }
     
            if (tipoCliente == 2) {
                    return importeBase - (importeBase * DESCUENTO_CLIENTE_TIPO2);
                    }
                    return importeBase;
 
}