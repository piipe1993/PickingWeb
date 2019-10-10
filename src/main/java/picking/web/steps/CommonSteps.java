package picking.web.steps;


import net.thucydides.core.annotations.Step;
import picking.web.pages.CommonPages;

public class CommonSteps {
	
	CommonPages commonPages;
	
	@Step
	public void AbrirPagina() {
		commonPages.open();
		
	}
	
	@Step
	public void SeleccionarCuenta( ) throws InterruptedException  {
		commonPages.SeleccionarCuenta();
	}
	
	@Step
	public void IniciarSesionGoogle(String strUsuario, String strPassword) throws InterruptedException  {
		commonPages.IniciarSesionGoogle(strUsuario, strPassword);
	}
	
	@Step
	public void selectCategoryAndSubcategory(String strCategory, String strSubcategory) {
		commonPages.selectCategoryAndSubcategory(strCategory, strSubcategory);
	}
	
	@Step
	public void selectProductPLP(String strProduct) {
		commonPages.selectProductPLP(strProduct);
	}
	
	@Step
	public void selectProductPDP(String strProduct) {
		commonPages.selectProductPDP(strProduct);
	}
	 

	@Step
	public void selectDeliveryAtHome() {
		commonPages.selectDeliveryAtHome();
	}

	@Step
	public void EnterUnregisteredEmail()  {
		commonPages.EnterUnregisteredEmail();
	}

	@Step
	public void enterEmail(String strEmail) {
		commonPages.enterEmail(strEmail);
	}
	
	@Step
	public void clickOnSend() {
		commonPages.clickOnSend();
	}

	@Step
	public void selectCity(String strCity) {
		commonPages.selectCity(strCity);
	}
	
	@Step
	public void enterAddress(String strAddress) {
		commonPages.enterAddress(strAddress);
	}
	 
	@Step 
	public void clickOnConfirmAddress() {
		commonPages.clickOnConfirmAddress();	
	}
	
	@Step
	public void clicOtherAddressButton() {
		commonPages.clicOtherAddressButton();
	}
	
	@Step
	public void checkPointProductAdded() {
		commonPages.checkPointProductAdded();
	}
	@Step
	public void checkPointShowAddress(){
		commonPages.checkPointShowAddress();
	}
	
	@Step
	public void checkPointShowAddressWithLogin(){
		commonPages.checkPointShowAddressWithLogin();
	}
	
	@Step
	public void checkPointShowPickupInPoint(){
		commonPages.checkPointShowPickupInPoint();
	}
	
	@Step
	public void refreshPage() {
		commonPages.refreshPage();
	}
	
	@Step
	public void clickOnMyCart() {
		commonPages.clickOnMyCart();	
	}
	
	@Step
	public void clickOnTheCheckoutButton() {
		commonPages.clickOnTheCheckoutButton();
	}
	
	@Step
	public void clickOnTheButtonToFinalizePurchase() {
		commonPages.clickOnTheButtonToFinalizePurchase();
	}
	
	@Step
	public void clickOnTheToGoToShippingButton() {
		commonPages.clickOnTheToGoToShippingButton();	
	}
	
	@Step
	public void enterShippingData(String strState,String strCity, String strAddress, String strApto,String strNeighborhood) {
		commonPages.enterShippingData(strState, strCity, strAddress, strApto, strNeighborhood);	
	}
	
	@Step
	public void deliverySchedule() throws InterruptedException {
		commonPages.deliverySchedule();
	}
	
	@Step
	public void clickOnTheGoToPaymentButton() throws InterruptedException {
		commonPages.clickOnTheGoToPaymentButton();
	}
	
	@Step
	public void SelectPaymentMethod(String strPaymentMethod) throws InterruptedException{
		commonPages.SelectPaymentMethod(strPaymentMethod);
	}
	
	@Step
	public void SelectCreditCardPaymentMethod(String strPaymentMethod, String strNumberTC, String strFeeds, String strNameTC, String strMonth, String strYear, String strCVS, String strAddressTC, String strStateTC, String strCityTC) throws InterruptedException{
		commonPages.SelectCreditCardPaymentMethod(strPaymentMethod, strNumberTC, strFeeds, strNameTC, strMonth, strYear, strCVS, strAddressTC, strStateTC, strCityTC);
	}
	
	
	@Step
	public void SelectCreditCardPaymentMethod(String strPaymentMethod,String strFeeds,String strCVS) throws InterruptedException{
		commonPages.SelectCreditCardPaymentMethod(strPaymentMethod,strFeeds, strCVS);
	}
	
	@Step
    public void ClickOnThePayButton() {
		commonPages.ClickOnThePayButton();
    }

	//@Step
	//public void SelectNameAndPrice() {
		//commonPages.SelectNameAndPrice();
	//}
	
	@Step
	public void SelectNameAndPriceProducts() {
		commonPages.SelectNameAndPriceProducts();
	}
	
	@Step
	public void successfulValidateProductInTheCart() {
		commonPages.successfulValidateProductInTheCart();
	}
	
	@Step
	public void selectAnotherProduct(String strProduct2) throws InterruptedException {
		commonPages.selectAnotherProduct(strProduct2);
	}
	
	@Step
	public void selectAnotherProductsWithModal(int intProducts) {
		commonPages.selectAnotherProductsWithModal(intProducts);
	}
	
	@Step
	public void selectStoreProductsPDP(int intProducts) {
		commonPages.selectStoreProductsPDP(intProducts);
	}

	@Step
	public void selectMkpProductsPDP(int intProducts) {
		commonPages.selectMkpProductsPDP(intProducts);
	}

	@Step
	public void selectProductsWithoutModal(int intProducts) {
		commonPages.selectProductsWithoutModal(intProducts);
	}
	
	@Step
	public void successfulValidateProductsInTheCart() {
		commonPages.successfulValidateProductsInTheCart();
	}
	
	@Step
	public void selectPickupInSite() {
		commonPages.selectPickupInSite();
	}
	
	@Step
	public void selectCityPickup(String strCity) {
		commonPages.selectCityPickup(strCity);
	}
	
	@Step
	public void selectStore(String strStore) {
		commonPages.selectStore(strStore);
	}
	
	@Step 
	public void clickOnConfirmPickup() {
		commonPages.clickOnConfirmPickup();	
	}
	
	@Step
	public void EnterPreEmailUnregistered() {
		commonPages.EnterPreEmailUnregistered();
	}
	
	@Step
	public void clickBtnPreEmail() {
		commonPages.clickBtnPreEmail();
	}
	
	@Step
	public void selectShippingMethod() {
		commonPages.selectShippingMethod();
	}
	
	@Step
	public void deliverySchedulePickupInPoint() {
		commonPages.deliverySchedulePickupInPoint();
	}
	
	@Step
	public void EnterPreEmailRegistered(String strEmail) {
		commonPages.EnterPreEmailRegistered(strEmail);
	}
	
	@Step
	public void clickBtnContinuePreEmail() {
		commonPages.clickBtnContinuePreEmail();
	}
	
	@Step
	public void selectEditAddress() {
		commonPages.selectEditAddress();
	}

	@Step
	public void searchProduct(String product) {
		commonPages.searchProduct(product);
	}
}
