import net.serenitybdd.core.pages.PageObject;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import picking.web.pages.PickingWebPages;
import picking.web.runners.RunnerPickingWebMercadoCYR;
import picking.web.runners.RunnerPickingWebMercadoDomicilio;
import picking.web.utilities.MyExeption;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        JUnitCore jUnitCore = new JUnitCore();
        jUnitCore.addListener(new TextListener(System.out));

        int TipoModalidadEntrega = JOptionPane.showOptionDialog(
                null,
                "Selecciona la modalidad de entrega de tu pedido",
                "Selector de Modalidad despacho",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null ,  // null para icono por defecto.
                new Object[] { "A Domicilio", "Compra y Recoge" },   // null para YES, NO y CANCEL
                "A Domicilio");

        if (TipoModalidadEntrega == 0) {

            jUnitCore.run(RunnerPickingWebMercadoDomicilio.class);

        }else if (TipoModalidadEntrega == 1) {
            jUnitCore.run(RunnerPickingWebMercadoCYR.class);

        }else{
            JOptionPane.showMessageDialog(null, "Proceso cancelado: No se selecciono la modalidad despacho del pedido\"");
            throw new MyExeption("No se selecciono la modalidad despacho del pedido");
        }
    }
}
