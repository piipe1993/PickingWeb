package picking.web.steps;


import com.google.inject.internal.asm.$ClassTooLargeException;
import net.thucydides.core.annotations.Step;
import picking.web.pages.PickingWebPages;
import picking.web.utilities.FuncionesComunes;
import picking.web.utilities.MyExeption;


import javax.swing.*;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static picking.web.utilities.FuncionesComunes.waitTime;

public class PickingWebSteps {


    PickingWebPages pickingWeb;
    FuncionesComunes funcionesComunes;

    @Step
    public void searchOrder(String order) {

        try {
//      funcionesComunes.fluentWaitVisibility(getDriver(), pickingWeb.getTxtTransporte(), pickingWeb.getTxtTransporte().getText().toString());
//      funcionesComunes.waitWhileElementHasAttributeValue(pickingWeb.getWaitInPage(),"style", "block");
            pickingWeb.open();
            order = JOptionPane.showInputDialog("Ingresa el numero del pedido");

            //if OK is pushed then (if not strDialogResponse is null)
            if (order == null) {
                JOptionPane.showMessageDialog(null, "Presionaste cancelar: El navegador se cerrara");
//           JOptionPane.showMessageDialog(null,"el programa continuara con el flujo para el pedido ingresado");
                throw new AssertionError("No se ingreso el numero del pedido");
            }

            waitTime(7);
            funcionesComunes.waitElement(pickingWeb.getFilterIcon());
            pickingWeb.getFilterIcon().click();
            pickingWeb.getInputOrder().sendKeys(order);
            // pickingWeb.getCheckUnplanned().click();
            pickingWeb.getBtnApplyFilter().click();

            waitTime(3);
            if (!pickingWeb.getSelectActions().isDisplayed()) {
                throw new MyExeption("Order not found");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pedido ingresado: " + order + ", no fue encontrado");
            throw new MyExeption("Order not found");
        }


    }

    @Step
    public void goToPickingState() {
//        try {
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Pedido ingresado: " + order + ", no fue encontrado");
//            throw new MyExeption("Order not found");
//        }
        //waitTime(5);
        pickingWeb.getSelectActions().click();
        waitTime(2);
        pickingWeb.getIconActionPicking().click();
        waitTime(2);
        pickingWeb.getBtnSuccess().click();
        waitTime(12);
        pickingWeb.getBtnCancel().click();
        waitTime(2);
    }

    @Step
    public void goToRegisterPosState() {
        pickingWeb.getCheckUnplanned().click();
        waitTime(2);
        pickingWeb.getSelectActions().click();
        pickingWeb.getIconRegisterPos().click();
        waitTime(5);
        funcionesComunes.waitElement(pickingWeb.getBtnSuccess());
        pickingWeb.getBtnSuccess().click();
        waitTime(10);
//        getDriver().switchTo().frame("frame");

//        Actions actions = new Actions(getDriver());
//        actions.moveToElement(pickingWeb.getInferiorModalDetailList());
//        actions.perform();
        pickingWeb.getBtnCancelDetailList().click();
//        pickingWeb.getModalHeaderDetailList().sendKeys(Keys.ENTER);
//        funcionesComunes.waitElementClicleable(pickingWeb.getBtnCancelDetailList());
//        pickingWeb.getBtnCancelDetailList();
        getDriver().switchTo().defaultContent(); // you are now outside both frames

//        String parentWinHandle = getDriver().getWindowHandle();
//        Set<String> winHandles = getDriver().getWindowHandles();
//        for (String handle : winHandles) {
//            if (!handle.equals(parentWinHandle)) {
//                getDriver().switchTo().window(handle);
//                funcionesComunes.waitElementClicleable(pickingWeb.getBtnCancelDetailList());
//                pickingWeb.getBtnCancelDetailList();
//                break;
//            }
//        }
//        getDriver().switchTo().window(parentWinHandle);

    }

    @Step
    public void selectTransportBy() {
        waitTime(6);

        int transportType = JOptionPane.showOptionDialog(
                null,
                "Selecciona el tipo de transporte",
                "Selector tipo transporte",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,  // null para icono por defecto.
                new Object[]{"En carro", "Tradicional", "Colaborativo"},   // null para YES, NO y CANCEL
                "En carro");

        switch (transportType) {

            case 0:
                pickingWeb.getSelectActions().click();
                pickingWeb.getIconRequestTransport().click();
                waitTime(4);
                pickingWeb.getBtnTransportInCar().click();
                // funcionesComunes.waitForJSandJQueryToLoad();
                waitTime(4);
                pickingWeb.getSelectActions().click();
                waitTime(3);
                pickingWeb.getIconStartTransport().click();
                funcionesComunes.waitElementClicleable(pickingWeb.getBtnSuccess());
                pickingWeb.getBtnSuccess().click();
                waitTime(4);
                pickingWeb.getBtnCancel().click();

                //  funcionesComunes.waitForJSandJQueryToLoad();
                break;

            case 1:
                System.out.println("transporte tradicional ** Pasos pendientes");
                // code block
                break;

            case 2:
                System.out.println("transporte colaborativo ** pasos pendientes");

                break;
            default:
                System.out.println("El tipo de transporte recibido no es valido");
        }

    }

    @Step
    public void confirmDelivery() {
        try {
            //funcionesComunes.waitForJSandJQueryToLoad();
            waitTime(5);
            pickingWeb.getSelectActions().click();
            pickingWeb.getIconConfirmDelivery().click();
            waitTime(2);
            pickingWeb.getBtnSuccess().click();
            waitTime(3);
            pickingWeb.getBtnCancel().click();
            waitTime(2);

            JOptionPane.showMessageDialog(null, "El flujo del pedido se completo correctamente\nPRUEBA EXITOSA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error En el proceso de cambio de estado a entregado, Element not found");
//            throw new MyExeption("Element not found");
        }


    }

    @Step
    public void confirmDeliveryCYR() {

        try {

            waitTime(4);
            pickingWeb.getSelectActions().click();
            pickingWeb.getIconPendingCollection().click();
            waitTime(2);
            pickingWeb.getBtnSuccess().click();
            pickingWeb.getBtnCancel().click();
            waitTime(4);
            pickingWeb.getSelectActions().click();
            pickingWeb.getIconOrderDeliveredCYR().click();
            waitTime(3);
            pickingWeb.getBtnSuccess().click();
            waitTime(3);
            pickingWeb.getBtnCancel().click();
            waitTime(3);

//            if (pickingWeb.getSelectActions().isDisplayed()) {
//                JOptionPane.showMessageDialog(null,"No se puedo avanzar el pedido al estado 'Confirmar entrega'");
//                throw new MyExeption("No se puedo avanzar el pedido al estado 'Confirmar entrega'");
//            }

            JOptionPane.showMessageDialog(null, "El flujo del pedido se completo correctamente.\nPRUEBA EXITOSA");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error En el proceso de cambio de estado a 'confirmar entrega', Element not found");
            throw new MyExeption("Element not found");
        }

    }

}
