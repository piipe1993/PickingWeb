package picking.web.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://l296dtv03/BackEnd.Picking/Despachos/DespachosIndex#/Mercado")
public class PickingWebPages extends PageObject {

    // variables privadas que contienen los Web Elements capturados


    @FindBy(xpath = "//*[@id=\"be-navbar\"]/div[1]/ul/li[2]")
    private WebElement filterIcon;

    @FindBy(xpath = "//input[contains(@ng-model,'parametros.numeroPedidos')]")
    private WebElement inputOrder;

    @FindBy(className = "btn-warning")
    private WebElement btnApplyFilter;

    @FindBy(className = "be-btn")
    private WebElement selectActions;

    @FindBy(className = "ico-picking-picking")
    private WebElement iconActionPicking;

    @FindBy(className = "btn-success")
    private WebElement btnSuccess;

    @FindBy(className = "btn-default")
    private WebElement btnCancel;

    @FindBy(className = "ico-registrar-pos")
    private WebElement iconRegisterPos;

    @FindBy(xpath = "(//button[contains(@class,'btn btn-default')])[1]")
    private WebElement btnCancelDetailList;

    @FindBy(className = "ico-solicitar-transporte")
    private WebElement iconRequestTransport;

    @FindBy(className = "carro")
    private WebElement btnTransportInCar;

    @FindBy(className = "tradicional")
    private WebElement btnTraditionalTransport;

    @FindBy(id = "btnTransporteColaborativo")
    private WebElement btnCollaborativeTransport;

    @FindBy(className = "ico-iniciar-transporte")
    private WebElement iconStartTransport;

    @FindBy(className = "ico-confirmar-entrega")
    private WebElement iconConfirmDelivery;

    @FindBy(className = "modalAjax")
    private WebElement waitInPage;

    @FindBy(id = "cbxSinPlanificar")
    private WebElement checkUnplanned;

    @FindBy(css = "body > div:nth-child(1) > div > div > div.modal-header.ng-scope > button > span")
    private WebElement closeDetailList;

    @FindBy(className = "modal-footer ng-scope")
    private WebElement inferiorModalDetailList;

    @FindBy(className = "ico-pendiente-recogida")
    private WebElement iconPendingCollection;


    @FindBy(className = "ico-picking-entregado")
    private WebElement iconOrderDeliveredCYR;

    @FindBy(className = "modal-header")
    private WebElement modalHeaderDetailList;

    //Metodos publicos que devuelven los WebElements capturados.


    public WebElement getFilterIcon() {
        return filterIcon;
    }

    public WebElement getInputOrder() {
        return inputOrder;
    }

    public WebElement getBtnApplyFilter() {
        return btnApplyFilter;
    }

    public WebElement getIconActionPicking() {
        return iconActionPicking;
    }

    public WebElement getBtnSuccess() {
        return btnSuccess;
    }

    public WebElement getBtnCancel() {
        return btnCancel;
    }

    public WebElement getIconRegisterPos() {
        return iconRegisterPos;
    }

    public WebElement getBtnCancelDetailList() {
        return btnCancelDetailList;
    }

    public WebElement getIconRequestTransport() {
        return iconRequestTransport;
    }

    public WebElement getBtnTransportInCar() {
        return btnTransportInCar;
    }

    public WebElement getBtnTraditionalTransport() {
        return btnTraditionalTransport;
    }

    public WebElement getBtnCollaborativeTransport() {
        return btnCollaborativeTransport;
    }

    public WebElement getIconStartTransport() {
        return iconStartTransport;
    }

    public WebElement getIconConfirmDelivery() {
        return iconConfirmDelivery;
    }

    public WebElement getSelectActions() {
        return selectActions;
    }

    public WebElement getCloseDetailList() {
        return closeDetailList;
    }

    public WebElement getInferiorModalDetailList() {
        return inferiorModalDetailList;
    }

    public WebElement getWaitInPage() {
        return waitInPage;
    }

    public WebElement getCheckUnplanned() {
        return checkUnplanned;
    }

    public WebElement getModalHeaderDetailList() {
        return modalHeaderDetailList;
    }

    public WebElement getIconPendingCollection() {
        return iconPendingCollection;
    }

    public WebElement getIconOrderDeliveredCYR() {
        return iconOrderDeliveredCYR;
    }
}
