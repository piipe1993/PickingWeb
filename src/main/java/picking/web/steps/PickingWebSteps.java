package picking.web.steps;


import com.google.inject.internal.asm.$ClassTooLargeException;
import net.thucydides.core.annotations.Step;
import picking.web.pages.PickingWebPages;
import picking.web.utilities.FuncionesComunes;


import javax.swing.*;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static picking.web.utilities.FuncionesComunes.waitTime;

public class PickingWebSteps {


    PickingWebPages pickingWeb;
    FuncionesComunes funcionesComunes;

    @Step
    public void searchOrder(String order) {
        pickingWeb.open();
//        funcionesComunes.fluentWaitVisibility(getDriver(),pickingWeb.getTxtTransporte(),pickingWeb.getTxtTransporte().getText().toString());
//      funcionesComunes.waitWhileElementHasAttributeValue(pickingWeb.getWaitInPage(),"style", "block");

        order = JOptionPane.showInputDialog("Ingresa el numero del pedido");

        //if OK is pushed then (if not strDialogResponse is null)
        if (order == null) {
            JOptionPane.showMessageDialog(null, "Presionaste cancelar: El navegador se cerrara");
//           JOptionPane.showMessageDialog(null,"el programa continuara con el flujo para el pedido ingresado");
            throw new AssertionError("No se ingreso el numero del pedido");
        }


//        order= JOptionPane.showInputDialog("Ingresa el numero del pedido");


        waitTime(7);
        funcionesComunes.waitElement(pickingWeb.getFilterIcon());
        pickingWeb.getFilterIcon().click();
        pickingWeb.getInputOrder().sendKeys(order);
        // pickingWeb.getCheckUnplanned().click();
        pickingWeb.getBtnApplyFilter().click();

    }

    @Step
    public void goToPickingState() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        waitTime(5);
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
    public void selectTransportBy(String transportType) {
        waitTime(6);
        transportType = transportType.toLowerCase();
        switch (transportType) {

            case "carro":
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

            case "tradicional":
                System.out.println("transporte tradicional ** Pasos pendientes");
                // code block
                break;

            case "colaborativo":
                System.out.println("trasnporte colaborativo ** pasos pendientes");

                break;
            default:
                System.out.println("El tipo de transporte recibido no es valido");
        }

    }

    @Step
    public void confirmDelivery() {
        //funcionesComunes.waitForJSandJQueryToLoad();
        waitTime(5);
        pickingWeb.getSelectActions().click();
        pickingWeb.getIconConfirmDelivery().click();
        waitTime(2);

    }

    @Step
    public void confirmDeliveryCYR() {
        waitTime(4);
        pickingWeb.getSelectActions().click();
        pickingWeb.getIconPendingCollection().click();
        waitTime(2);
        pickingWeb.getBtnSuccess().click();
        pickingWeb.getBtnCancel().click();
        waitTime(4);
        pickingWeb.getSelectActions().click();
        pickingWeb.getIconOrderDeliveredCYR().click();
        waitTime(2);

    }

}
