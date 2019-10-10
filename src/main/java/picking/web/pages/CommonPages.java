package picking.web.pages;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import picking.web.utilities.FuncionesComunes;

import java.util.List;
import java.util.Set;

@DefaultUrl("https://exito.myvtex.com/")
public class CommonPages extends PageObject {


    FuncionesComunes funcionesComunes;
    public String strUnregisteredEmail="";
    public String strProductPrice;
    public String strProductList;
    public String strProductList2;
    public String strRtdPricetMyCart;
    public String strRtdProductMyCart;
    public String strRtdLstAddToCart="1 und";
    public String strRtdAddres;
    public String strRtdAddresModal;

    public String [] nameProductos;
    public String [] priceProductos;
    /**
     * Elementos del inicio de Vtex - Google
     *
     * @since 17/05/2019
     * @author Sergio Alvarez - Juan Camilo Munoz
     *
     */
    @FindBy(id = "vtexIdUI-google-plus")
    private WebElement btnGoogle;

    @FindBy(id = "identifierId")
    private WebElement inputEmail;

    @FindBy(id = "identifierNext")
    private WebElement btnNext;

    @FindBy(name = "password")
    private WebElement inputPassword;

    @FindBy(id = "passwordNext")
    private WebElement btnPasswordNext;

    /**
     * Elementos del Menu Categorias
     *
     * @since 17/05/2019
     * @author Sergio Alvarez - Juan Camilo Munoz
     *
     */
    @FindBy(className = "menu-categoria")
    public List<WebElement> lstCategories;

    @FindBy(className = "overlay-black")
    private WebElement ctdSubCategories;

    @FindBy(className = "mercado-subcategoria")
    private List<WebElement> lstSubMercado;

    @FindBy(className = "tecnología-subcategoria")
    private List<WebElement> lstSubTecnologia;

    @FindBy(className = "electrodomésticos-subcategoria")
    private List<WebElement> lstSubElectrodomesticos;

    @FindBy(className = "hogar-subcategoria")
    private List<WebElement> lstSubHogar;

    @FindBy(className = "moda-subcategoria")
    private List<WebElement> lstSubModaAccesorios;

    @FindBy(className = "salud-subcategoria")
    private List<WebElement> lstSubSalud;

    @FindBy(className = "bebés,-subcategoria")
    private List<WebElement> lstSubBebes;

    @FindBy(className = "deportes-subcategoria")
    private List<WebElement> lstSubDeportes;

    @FindBy(className = "ferretería-subcategoria")
    private List<WebElement> lstSubFerreteria;

    @FindBy(className = "list-item-link")
    private List<WebElement> lstSubCategories;

    @FindBy(className = "link")
    private List<WebElement> lstVerTodo;

    /**
     * Elementos de Seleccion Productos
     *
     * @since 17/05/2019
     * @author Sergio Alvarez - Juan Camilo Munoz
     *
     */


    @FindBy(className = "exito-search-result-3-x-editData")
    private WebElement ctdAddressPLP;

    @FindBy(className = "exito-search-result-3-x-addressResult")
    private WebElement rtdAddressPLP;
    // exito-vtex-component-nombre-producto  galleryItem-productBrand
    @FindBy(className = "exito-vtex-component-nombre-producto")
    public List<WebElement> lstProducts;

    @FindBy(className = "product-summary-add-to-car")
    private List<WebElement> lstAddToCart;

    @FindBy(className = "product-summary-add-to-car")
    private WebElement btnAddProduct;

    @FindBy(className = "product-summary-add-to-car-plus")
    private WebElement btnAddProductPlus;

    @FindBy (className ="product-summary-quantity")
    public WebElement btnAggravatedProduct;

    @FindBy (className ="exito-search-result-3-x-galleryItem")
    public List<WebElement> lstGalleryItemProducts;


    @FindBy (className ="search-result-producto")
    public WebElement galleryItemProducts;

    @FindBy (className ="loader-serach-result")
    public WebElement loaderSerachResult;
    //t-heading-5-ns
    @FindBy(className ="exito-vtex-component-precio-rojo")
    private List<WebElement> lstProductPrice;

    @FindBy (className ="exito-product-details-2-x-exitoCustomBenefits")
    public WebElement txtSoldBy;


    /**
     * Elem  de modal domicilio y compra y recoge
     *
     * @since 22/05/2019
     * @author Juan Camilo Munoz y Sergio Alejandro Alvarez
     *
     */

    @FindBy (className = "shippingaddress-lista-ciudad")
    private WebElement selectCity;

    @FindBy (name = "address")
    private WebElement inputAddress;


    @FindBy (className ="shippingaddress-confirmar")
    private WebElement btnConfirmAddress;

    @FindBy(className = "orderoption-envio-domicilio")
    private WebElement btnDomicilio;

    @FindBy(id = "requestemail-input")
    private WebElement inputEmailDomicilio;

    @FindBy(className = "requestemail-enviar")
    private WebElement btnEnviar;

    @FindBy(className ="addressbyuser-enviar-a-otra-direccion")
    private WebElement btnOtherAddress;

    @FindBy (className ="orderoption-compra-recoge")
    private WebElement btnPickup;

    @FindBy (className ="buycollect-lista-ciudades")
    private WebElement lstSelectCity;

    @FindBy (className ="buycollect-lista-almacen")
    private WebElement lstSelectStore;

    @FindBy (className ="exito-geolocation-2-x-primaryButton")
    private WebElement btnConfirmPickup;

    @FindBy (id ="client-pre-email")
    private WebElement preEmail;

    @FindBy (id ="btn-client-pre-email")
    private WebElement btnPreEmail;

    @FindBy (id ="btn-identified-user-button")
    private WebElement btnContinuePreEmail;

    @FindBy (id ="shipping-option-pickup-in-point")
    private WebElement optionPickup;


    /**
     * Elementos de mi carrito-checkout-fecha de entrega-metodo de pago y pagar
     *
     * @since 27/05/2019
     * @author Juan Camilo Munoz-Sergio Alvarez
     *
     */

    @FindBy (className ="exito-header-2-x-minicartBadge")
    private WebElement btnMyCart;

    @FindBy (className ="vtex-store-components-3-x-productBrand")
    private WebElement txtProductMyCart;

    @FindBy (xpath ="/html/body/div[4]/div/div/div/div/div/div[2]/div[1]/section/section/article/a/div[2]/div[2]/div[2]/div/div/span")
    private WebElement txtPricetMyCart;

    //@FindBy (className ="gocheckout-minicart-button")
    //private WebElement btnCheckout;

    //hover-c-on-action-primary
    @FindBy (className ="hover-c-on-action-primary")
    private WebElement btnCheckout;

    @FindBy (className ="cart-links-bottom")
    private WebElement ctdFinalizePurchase;

    @FindBy (id ="acceptTerms")
    private WebElement chkAcceptTerms;

    @FindBy (id ="cart-to-orderform")
    private WebElement btnFinalizePurchase;

    //@FindBy (className ="btn-place-order-wrapper")
    //private WebElement btnFinalizePurchase;

    @FindBy(id ="go-to-shipping")
    private WebElement btnGoToShipping;

    @FindBy(id ="scheduled-delivery-choose-Domicilio_Programado")
    public WebElement btnScheduledDelivery;

    @FindBy (className ="react-datepicker__day--keyboard-selected")
    public WebElement btndaykeyboardSelected;

    @FindBy(id ="btn-go-to-payment")
    private WebElement btnGoToPayment;

    @FindBy (className ="box-new")
    private WebElement ctdPaymetMethod;

    // payment-group-list-btn payment-group

    @FindBy (className ="payment-group")
    private WebElement paymetMethodGroup;

    @FindBy (className ="payment-group-item")
    private List<WebElement> lstPaymetMethodGroup;

    @FindBy(xpath ="//*[@id=\"creditCardpayment-card-0Code\"]")
    private WebElement inputCvvs;

    @FindBy(xpath ="//*[@id=\"creditCardpayment-card-0Number\"]")
    private WebElement inputNumbertc;

    @FindBy(id ="creditCardpayment-card-0Brand")
    private WebElement lstFees;

    @FindBy(id ="creditCardpayment-card-0Name")
    private WebElement inputNametc;

    @FindBy(id ="creditCardpayment-card-0Month")
    private WebElement inputMonth;

    @FindBy(id ="creditCardpayment-card-0Year")
    private WebElement inputYear;

    @FindBy(id ="address-toggle-0")
    private WebElement chkAddress;

    @FindBy(id ="payment-billing-address-street-0")
    private WebElement inputAddressTC;

    @FindBy(id ="payment-billing-address-state-0")
    private WebElement inputStateTC;

    @FindBy(id ="payment-billing-address-city-0")
    private WebElement inputCityTC;

    @FindBy (xpath ="//*[@id='payment-data-submit'][2]")
    private WebElement btnPay;

    @FindBy(id ="scheduled-delivery-choose-CompraRecoge_Programado (ptorecogida_30)")
    public WebElement btnScheduledDeliveryPickup;

    /**
     * elementos del checkout para tienda.
     *
     * @since 27/05/2019
     * @author Juan Camilo Munoz-Sergio Alvarez
     *
     */

    @FindBy (className ="shipping-data")
    public WebElement ctdShippingData;

    @FindBy (id ="ship-state")
    public WebElement selectShipState;

    @FindBy (id ="ship-city")
    public WebElement selectShipCity;

    @FindBy (id ="ship-street")
    public WebElement inputShipAddress;

    @FindBy (id ="ship-complement")
    public WebElement inputApto;

    @FindBy (id ="ship-neighborhood")
    public WebElement inputNeighborhood;

    /**
     * Otros elementos
     *
     * @since 27/05/2019
     * @author Juan Camilo Munoz-Sergio Alvarez
     *
     */

    @FindBy (className ="exito-search-result-3-x-editDeliveryType")
    private WebElement btnEditAddress;

    @FindBy (xpath = "//*[contains(@id,'downshift')]")
    private WebElement inpuntSearchProduct;

    /**
     * Metodos codigo de los pasos.
     *
     * @since 17/05/2019
     * @author Sergio Alvarez - Juan Camilo Munoz
     *
     */
    public void SeleccionarCuenta() {
        btnGoogle.click();
    }

    public void IniciarSesionGoogle(String strUsuario, String strPassword) throws InterruptedException {
        String parentWinHandle = getDriver().getWindowHandle();
        Set<String> winHandles = getDriver().getWindowHandles();
        for (String handle : winHandles) {
            if (!handle.equals(parentWinHandle)) {
                getDriver().switchTo().window(handle);
                funcionesComunes.waitElement(inputEmail);
                inputEmail.sendKeys(strUsuario);
                btnNext.click();
                funcionesComunes.waitElement(inputPassword);
                inputPassword.sendKeys(strPassword);
                btnPasswordNext.click();
                break;
            }
        }
        getDriver().switchTo().window(parentWinHandle);

    }

    public void selectCategoryAndSubcategory(String strCategory, String strSubcategory) {
        boolean swCategory = false;
        funcionesComunes.waitLstElement(lstCategories);
        int size = lstCategories.size();
        for (int i = 0; i < size; i++) {
            String objMenu = funcionesComunes.normalizeString((lstCategories.get(i)).getText());
            if (objMenu.equals(strCategory)) {
                Actions action = new Actions(getDriver());
                action.moveToElement(lstCategories.get(i)).build().perform();
                swCategory = true;
                break;
            } else {
                //Assert.assertTrue("No fue encontrada la categoría", swCategory);
            }
        }

        Assert.assertTrue("No fue encontrada la categoría", swCategory);
        funcionesComunes.waitElement(ctdSubCategories);
        switch(strCategory) {
            case "Mercado":
                selectSubCategory(lstSubMercado, strSubcategory);
                break;
            case "Tecnologia":
                selectSubCategory(lstSubTecnologia, strSubcategory);
                break;
            case "Electrodomesticos":
                selectSubCategory(lstSubElectrodomesticos, strSubcategory);
                break;
            case "Hogar":
                selectSubCategory(lstSubHogar, strSubcategory);
                break;
            case "Moda y accesorios":
                selectSubCategory(lstSubModaAccesorios, strSubcategory);
                break;
            case "Salud y belleza":
                selectSubCategory(lstSubSalud, strSubcategory);
                break;
            case "Bebes, ninos y jugueteria":
                selectSubCategory(lstSubBebes, strSubcategory);
                break;
            case "Deportes y Tiempo Libre":
                selectSubCategory(lstSubDeportes, strSubcategory);
                break;
            case "Ferreteria y Vehiculos":
                selectSubCategory(lstSubFerreteria, strSubcategory);
                break;
            default:
                System.out.println("No fue posible encontrar la categoría en el case");
        }
    }

    public void selectSubCategory(List<WebElement> lstSubCategory, String strSubcategory) {
        boolean swSubcategory = false;
        int size = lstVerTodo.size();
        for (int j = 0; j < size; j++) {
            String objMenu2 = funcionesComunes.normalizeString((lstVerTodo.get(j)).getText());
            if (objMenu2.equals(strSubcategory)) {
                lstVerTodo.get(j).click();
                swSubcategory = true;
                break;
            }
        }
        if(swSubcategory==false) {
            int size2 = lstSubCategory.size();
            for (int j = 0; j < size2; j++) {
                String objMenu3 = funcionesComunes.normalizeString((lstSubCategory.get(j)).getText());
                if (objMenu3.equals(strSubcategory)) {
                    lstSubCategory.get(j).click();
                    swSubcategory = true;
                    break;
                }
            }
            Assert.assertTrue("No fue encontrada la subcategoría", swSubcategory);

        }
    }

    public void selectProductPLP(String strProduct) {
        funcionesComunes.waitLstElement(lstGalleryItemProducts);
        funcionesComunes.waitLstElement(lstProducts);
        strProductList = strProduct;
        int size = lstProducts.size();
        for (int i = 0; i < size; i++) {
            String objProduct = (lstProducts.get(i)).getText();
            if (objProduct.equals(strProductList)) {
                funcionesComunes.scrollDown("250");
                funcionesComunes.waitLstElement(lstAddToCart);
                lstAddToCart.get(i).click();
                //strProductPrice = lstProductPrice.get(i).getText().replace("$", "COP");

                break;
            }
        }

    }

    public void selectAnotherProduct(String strProduct2) throws InterruptedException {
        funcionesComunes.waitElement(btnAggravatedProduct);
        Assert.assertEquals(btnAggravatedProduct.getText(), strRtdLstAddToCart);
        getDriver().navigate().refresh();
        System.out.println("si agrego producto al carrito " + strProductList);
        funcionesComunes.waitLstElement(lstGalleryItemProducts);
        strProductList2 = strProduct2;
        int size = lstProducts.size();
        for (int i = 0; i < size; i++) {
            String objProduct = (lstProducts.get(i)).getText();
            if (objProduct.equals(strProduct2)) {
                funcionesComunes.scrollDown("250");
                funcionesComunes.waitLstElement(lstAddToCart);
                lstAddToCart.get(i).click();
                funcionesComunes.scrollUp();
                System.out.println("si agrego el segundo producto, click en el boton agregar al carrito del producto seleccionado");
                break;

            }

        }

    }


    public void selectAnotherProductsWithModal(int intProducts) {
        funcionesComunes.waitLstElement(lstGalleryItemProducts);
        //funcionesComunes.waitLstElement(lstProducts);
        // funcionesComunes.waitLstElement(lstAddToCart);
        nameProductos = new String[intProducts + 1];
        priceProductos = new String[intProducts + 1];
        nameProductos[0] = strProductList;
        priceProductos[0] = strProductPrice;
        System.out.println("Producto  " + nameProductos[0] + " Precio : " + priceProductos[0]);
        int size = lstAddToCart.size();
        System.out.println("EL TAMAÑO ES: "+ size);
        if(size == 1) {
            funcionesComunes.scrollUp();
        }else {
            if (size <= intProducts) {
                System.out.println("Si Size " + size +" es menor igual a la catidad de producto "+ intProducts+ " el limite es size: " + size);

                for (int i = 0; i <= size; i++) {
                    String objProduct = (lstProducts.get(i)).getText();
                    if (objProduct.equals(strProductList)) {
                        strProductPrice = lstProductPrice.get(i).getText().replace("$", "COP");
                        System.out.println("el producto " + strProductList + " su precio es: " + strProductPrice);
                        continue;
                    }

                    try {
                        funcionesComunes.scrollDown("250");
                        funcionesComunes.waitLstElement(lstAddToCart);
                        lstAddToCart.get(i).click();
                        //nameProductos[i + 1] = lstProducts.get(i).getText();
                        //priceProductos[i + 1] = lstProductPrice.get(i).getText().replace("$", "COP");

                        System.out.println("CONTADOR: " + i + " producto : "+ lstProducts.get(i).getText() + " Precio " +lstProductPrice.get(i).getText().replace("$", "COP"));
                        //System.out.println("si hizo click en el boton agregar al carrito del producto seleccionado " + nameProductos[i + 1] + " precio " + priceProductos[i + 1]);
                    } catch (Exception e) {
                        System.out.println("Baja el Scroll para seleccionar más productos: " +"producto numero : "+lstAddToCart.get(i) +" producto es "+lstAddToCart.get(i).getText() + e.getMessage());

                        funcionesComunes.scrollDown("250");
                        //funcionesComunes.scrollDown();
                        //funcionesComunes.waitLstElement(lstAddToCart);
                        lstAddToCart.get(i).click();
                    }

                }
            }else {
                System.out.println("Si Size " + size +" NO es menor a la catidad de producto "+ intProducts+ " el limite es intProducts: " + intProducts);
                for (int i = 0; i <= intProducts; i++) {
                    String objProduct = (lstProducts.get(i)).getText();
                    if (objProduct.equals(strProductList)) {
                        //strProductPrice = lstProductPrice.get(i).getText().replace("$", "COP");
                        //System.out.println("el producto " + strProductList + " su precio es: " + strProductPrice);
                        System.out.println("CONTADOR: " + i);
                        continue;
                    }
                    funcionesComunes.waitLstElement(lstAddToCart);
                    lstAddToCart.get(i).click();
                    //nameProductos[i + 1] = lstProducts.get(i).getText();
                    //priceProductos[i + 1] = lstProductPrice.get(i).getText().replace("$", "COP");

                    System.out.println("CONTADOR: " + i + " producto : "+ lstProducts.get(i).getText() + " Precio " +lstProductPrice.get(i).getText().replace("$", "COP"));
                    //System.out.println("si hizo click en el boton agregar al carrito del producto seleccionado " + nameProductos[i + 1] + " precio " + priceProductos[i + 1]);

                }
            }
        }
        funcionesComunes.scrollUp();
    }

    public void selectProductsWithoutModal(int intProducts) {
        System.out.println(" cuantos productos son :" + intProducts);
        funcionesComunes.waitLstElement(lstGalleryItemProducts);
        int size = lstAddToCart.size();
        System.out.println("EL TAMAÑO DE LA LISTA ES:  "+ size);

        if (size <= intProducts) {
            System.out.println("Si Size " + size +" es menor igual a la catidad de producto "+ intProducts+ " el limite es size: " + size);
            for (int i = 0; i < size; i++) {

                try {
                    funcionesComunes.scrollDown("250");
                    funcionesComunes.waitLstElement(lstAddToCart);
                    lstAddToCart.get(i).click();
                    System.out.println("CONTADOR: " + i + " producto : "+ lstProducts.get(i).getText() + " Precio " +lstProductPrice.get(i).getText().replace("$", "COP"));

                } catch (Exception e) {
                    System.out.println("Baja el Scroll para seleccionar más productos: " +"producto numero : "+lstAddToCart.get(i) +" producto es "+lstAddToCart.get(i).getText() + e.getMessage());

                    funcionesComunes.scrollDown("250");
                    //funcionesComunes.scrollDown("250");
                    lstAddToCart.get(i).click();
                }

            }
        }else {
            System.out.println("Si Size " + size +" NO es menor a la catidad de producto "+ intProducts+ " el limite es intProducts: " + intProducts);
            for (int i = 0; i < intProducts; i++) {
                try {
                    funcionesComunes.scrollDown("250");
                    funcionesComunes.waitLstElement(lstAddToCart);
                    lstAddToCart.get(i).click();
                    System.out.println("CONTADOR: " + i + " producto : "+ lstProducts.get(i).getText() + " Precio " +lstProductPrice.get(i).getText().replace("$", "COP"));

                } catch (Exception e) {
                    System.out.println("Baja el Scroll para seleccionar más productos: " +"producto numero : "+lstAddToCart.get(i) +" producto es "+lstAddToCart.get(i).getText() + e.getMessage());

                    funcionesComunes.scrollDown("250");
                    //funcionesComunes.scrollDown("250");
                    lstAddToCart.get(i).click();
                }
            }
        }

        funcionesComunes.scrollUp();
    }



    public void selectProductPDP(String strProduct) {
        funcionesComunes.waitLstElement(lstGalleryItemProducts);
        funcionesComunes.waitLstElement(lstProducts);
        int size = lstProducts.size();
        for (int i = 0; i < size; i++) {
            String objProduct = (lstProducts.get(i)).getText();
            if (objProduct.equals(strProduct)) {
                funcionesComunes.scrollDown("250");
                funcionesComunes.waitLstElement(lstProducts);
                lstProducts.get(i).click();
                break;

            }
        }
        btnAddProduct.click();

    }

    public void selectStoreProductsPDP(int intProducts) {
        System.out.println(" cuantos productos son :" + intProducts);
        funcionesComunes.waitLstElement(lstGalleryItemProducts);
        funcionesComunes.waitLstElement(lstAddToCart);
        int size = lstAddToCart.size();
        int nProducts=intProducts;
        if (size <= intProducts) {
            System.out.println("Si Size " + size + " es menor igual a la catidad de producto " + intProducts
                    + " el limite es size: " + size);
            for (int i = 0; i <= size; i++) {

                try {
                    funcionesComunes.waitLstElement(lstGalleryItemProducts);
                    funcionesComunes.scrollDown("250");
                    funcionesComunes.waitLstElement(lstProducts);
                    lstProducts.get(i).click();
                    funcionesComunes.waitElement(txtSoldBy);
                    String strSoldBy = txtSoldBy.getText();
                    if (strSoldBy.equals("Vendido por: exito")) {
                        btnAddProduct.click();
                        getDriver().navigate().back();


                    } else {

                        getDriver().navigate().back();
                    }

                } catch (Exception e) {
                    System.out.println("Baja el Scroll para seleccionar más productos: " + "producto numero : "
                            + lstAddToCart.get(i) + " producto es " + lstAddToCart.get(i).getText() + e.getMessage());

                    funcionesComunes.scrollDown("250");
                    lstProducts.get(i).click();
                }

            }
        } else {
            System.out.println("Si Size " + size + " NO es menor a la catidad de producto " + intProducts
                    + " el limite es intProducts: " + intProducts);

            for (int i = 0; i < nProducts; i++) {
                if(nProducts==size) {
                    break;
                }
                funcionesComunes.waitLstElement(lstGalleryItemProducts);
                funcionesComunes.scrollDown("250");
                funcionesComunes.waitLstElement(lstProducts);
                lstProducts.get(i).click();
                funcionesComunes.waitElement(txtSoldBy);
                String strSoldBy = txtSoldBy.getText();
                System.out.println("Contador: " +i+ " Vendendor: " + strSoldBy);
                if (strSoldBy.equals("Vendido por: exito")) {
                    System.out.println("Entre: "+ i + "liminte "+ nProducts);
                    //btnAddProduct.click();
                    getDriver().navigate().back();

                } else {
                    nProducts++;
                    System.out.println(" No Entre: " + nProducts);
                    getDriver().navigate().back();
                }
            }
        }

        funcionesComunes.scrollUp();

    }


    public void selectMkpProductsPDP(int intProducts) {
        System.out.println(" cuantos productos son :" + intProducts);
        funcionesComunes.waitLstElement(lstGalleryItemProducts);
        funcionesComunes.waitLstElement(lstAddToCart);
        int size = lstAddToCart.size();
        int nProducts=intProducts;
        if (size <= intProducts) {
            System.out.println("Si Size " + size + " es menor igual a la catidad de producto " + intProducts
                    + " el limite es size: " + size);
            for (int i = 0; i < size; i++) {

                try {
                    funcionesComunes.waitLstElement(lstGalleryItemProducts);
                    funcionesComunes.scrollDown("250");
                    funcionesComunes.waitLstElement(lstProducts);
                    lstProducts.get(i).click();
                    funcionesComunes.waitElement(txtSoldBy);
                    String strSoldBy = txtSoldBy.getText();
                    if (!strSoldBy.equals("Vendido por: exito")) {
                        System.out.println("Entre-MKP: "+ i );
                        btnAddProduct.click();
                        getDriver().navigate().back();


                    } else {
                        System.out.println(" EXITO: " + nProducts);
                        getDriver().navigate().back();
                    }

                } catch (Exception e) {
                    System.out.println("Baja el Scroll para seleccionar más productos: " + "producto numero : "
                            + lstAddToCart.get(i) + " producto es " + lstAddToCart.get(i).getText() + e.getMessage());

                    funcionesComunes.scrollDown("250");
                    lstProducts.get(i).click();
                }

            }
        } else {
            System.out.println("Si Size " + size + " NO es menor a la catidad de producto " + intProducts
                    + " el limite es intProducts: " + intProducts);

            for (int i = 0; i < nProducts; i++) {
                if(nProducts==size) {
                    break;
                }
                funcionesComunes.waitLstElement(lstGalleryItemProducts);
                funcionesComunes.scrollDown("250");
                funcionesComunes.waitLstElement(lstProducts);
                lstProducts.get(i).click();
                funcionesComunes.waitElement(txtSoldBy);
                String strSoldBy = txtSoldBy.getText();
                System.out.println("Contador: " +i+ " Vendendor: " + strSoldBy);
                if (!strSoldBy.equals("Vendido por: exito")) {
                    System.out.println("Entre-MKP: "+ i + "liminte "+ nProducts);
                    //btnAddProduct.click();
                    getDriver().navigate().back();

                } else {
                    nProducts++;
                    System.out.println(" EXITO: " + nProducts);
                    getDriver().navigate().back();
                }
            }
        }

        funcionesComunes.scrollUp();

    }

    public void SelectNameAndPriceProducts2() {
        //funcionesComunes.waitLstElement(lstProducts);
        int size = lstProducts.size();
        for (int i = 0; i < size; i++) {
            String objMenu = (lstProducts.get(i)).getText();
            if (objMenu.equals(strProductList)) {
                //funcionesComunes.scrollDown();
                try {

                    //	strProductPrice = lstProductPrice.get(i).getText().replace("$", "COP");
                    //System.out.println("el producto " + strProductList + " su precio es: " + strProductPrice);
                    //funcionesComunes.waitElement(btnLstAddToCart.get(i));
                    //System.out.println("si agrego producro al carrito " +strProductList);
                    funcionesComunes.scrollUp();

                } catch (Exception e) {
                    System.out.println("Error: no selecciono el precio del producto: " + e.getMessage());


                }

                break;
            }

        }

    }




    public void selectDeliveryAtHome() {
        funcionesComunes.waitElementClicleable(btnDomicilio);
        btnDomicilio.click();
    }


    public void EnterUnregisteredEmail() {
        funcionesComunes.waitElement(inputEmailDomicilio);
        String strUnregisteredEmail=funcionesComunes.createEmail();
        inputEmailDomicilio.sendKeys(strUnregisteredEmail);
    }

    public void enterEmail(String strEmail) {
        funcionesComunes.waitElement(inputEmailDomicilio);
        inputEmailDomicilio.sendKeys(strEmail);
    }

    public void clickOnSend() {
        funcionesComunes.waitElementClicleable(btnEnviar);
        btnEnviar.click();
    }


    public void selectCity(String strCity)  {
        funcionesComunes.waitElementClicleable(selectCity);
        Actions action = new Actions(getDriver());
        action.moveToElement(selectCity);
        action.click();
        action.sendKeys(strCity);
        action.sendKeys(Keys.RETURN);
        action.build().perform();
    }

    public void enterAddress(String strAddress) {
        funcionesComunes.waitElement(inputAddress);
        inputAddress.sendKeys(strAddress);
    }

    public void clickOnConfirmAddress() {
        funcionesComunes.waitElementClicleable(btnConfirmAddress);
        btnConfirmAddress.click();
    }

    public void clicOtherAddressButton() {
        funcionesComunes.waitElementClicleable(btnOtherAddress);
        btnOtherAddress.click();
    }

    public void checkPointProductAdded() {
        try {
            funcionesComunes.waitElement(btnAggravatedProduct);
            Assert.assertEquals(
                    "El producto NO fue agreagdo al carrito correctamente y/o el botón agregar al carrito no funciona correctamente",
                    btnAggravatedProduct.getText(), strRtdLstAddToCart);

        } catch (Exception e) {
            Assert.assertNull(
                    "El producto NO fue agreagdo al carrito correctamente y/o el botón agregar al carrito no funcionó correctamente",
                    btnAggravatedProduct);
        }
    }

    public void checkPointShowAddress() {
        funcionesComunes.scrollUp();
        strRtdAddres=Serenity.sessionVariableCalled("City") + " " + Serenity.sessionVariableCalled("Address");
        funcionesComunes.waitElement(ctdAddressPLP);
        Assert.assertEquals("No cargo la direccion del cliente y/o son diferentes ", funcionesComunes.normalizeString(rtdAddressPLP.getText()), strRtdAddres);
        System.out.println("Carga correctamente la direccion del cliente: "+ strRtdAddres);
    }



    public void checkPointShowAddressWithLogin() {
        funcionesComunes.scrollUp();
        strRtdAddres=Serenity.sessionVariableCalled("selectedAddressModal");
        String [] ArrayText = strRtdAddres.split("\n");
        strRtdAddresModal=ArrayText[1] + " " + ArrayText[0];
        funcionesComunes.waitElement(ctdAddressPLP);
        Assert.assertEquals("No cargo la direccion del cliente y/o son diferentes ", rtdAddressPLP.getText(), strRtdAddresModal);
        System.out.println("Carga correctamente la direccion del cliente: "+ strRtdAddresModal);
    }


    public void checkPointShowPickupInPoint() {
        funcionesComunes.scrollUp();
        strRtdAddres=Serenity.sessionVariableCalled("Store");
        funcionesComunes.waitElement(ctdAddressPLP);
        Assert.assertEquals("No el almacen de compra y recoge seleccionado por el cliente y/o son diferentes ", funcionesComunes.normalizeString(rtdAddressPLP.getText()), strRtdAddres);
        System.out.println("Carga correctamente el almacen de compra y recoge seleccionado por el cliente: "+ strRtdAddres);
    }


    public void refreshPage() {
        getDriver().navigate().refresh();
    }

    public void clickOnMyCart() {
        funcionesComunes.waitElementClicleable(btnMyCart);
        funcionesComunes.scrollUp();
        btnMyCart.click();
    }

    public void clickOnTheCheckoutButton() {
        funcionesComunes.waitElementClicleable(btnCheckout);
        btnCheckout.click();
    }

    public void clickOnTheButtonToFinalizePurchase() {
        funcionesComunes.waitElement(ctdFinalizePurchase);
        //funcionesComunes.waitElementClicleable(chkAcceptTerms);
        chkAcceptTerms.click();
        //funcionesComunes.waitElementClicleable(btnFinalizePurchase);
        btnFinalizePurchase.click();
    }

    public void clickOnTheToGoToShippingButton() {
        funcionesComunes.waitElementClicleable(btnGoToShipping);
        btnGoToShipping.click();
    }

    public void enterShippingData(String strState,String strCity, String strAddress, String strApto,String strNeighborhood) {
        funcionesComunes.waitElement(ctdShippingData);
        selectShipState.sendKeys(strState);
        funcionesComunes.waitElement(ctdShippingData);
        funcionesComunes.waitElementClicleable(selectShipCity);
        Actions action = new Actions(getDriver());
        action.moveToElement(selectShipCity);
        action.click();
        action.sendKeys(strCity);
        action.sendKeys(Keys.RETURN);
        action.build().perform();
        inputShipAddress.sendKeys(strAddress);
        inputApto.sendKeys(strApto);
        inputNeighborhood.sendKeys(strNeighborhood);
        funcionesComunes.scrollDown("350");
    }

    public void deliverySchedule(){
        funcionesComunes.scrollDown("750");
        funcionesComunes.waitElementClicleable(btnScheduledDelivery);
        btnScheduledDelivery.click();
        funcionesComunes.waitElementClicleable(btndaykeyboardSelected);
        btndaykeyboardSelected.click();
    }


    public void clickOnTheGoToPaymentButton() {
        funcionesComunes.waitElementClicleable(btnGoToPayment);
        btnGoToPayment.click();
    }


    public void SelectPaymentMethod(String strPaymentMethod) throws InterruptedException {
        funcionesComunes.waitElement(ctdPaymetMethod);
        funcionesComunes.waitElement(paymetMethodGroup);
        Thread.sleep(2000);
        int size = lstPaymetMethodGroup.size();
        System.out.println("tamaño lista size " +size);
        for (int i = 0; i < size; i++) {
            String objPaymetMethod= funcionesComunes.normalizeString((lstPaymetMethodGroup.get(i)).getText());
            System.out.println("metodo: " + objPaymetMethod);
            if (objPaymetMethod.equals(strPaymentMethod)) {
                lstPaymetMethodGroup.get(i).click();
                break;
            }
        }

    }

    public void SelectCreditCardPaymentMethod(String strPaymentMethod, String strNumberTC, String strFeeds,
                                              String strNameTC, String strMonth, String strYear, String strCVS, String strAddressTC, String strStateTC,
                                              String strCityTC) throws InterruptedException {
        String parentWinHandle = getDriver().getWindowHandle();
        funcionesComunes.waitElement(paymetMethodGroup);
        Thread.sleep(2000);
        int size = lstPaymetMethodGroup.size();
        for (int i = 0; i < size; i++) {
            String objPaymetMethod = (lstPaymetMethodGroup.get(i)).getText();
            if (funcionesComunes.normalizeString(objPaymetMethod).equals(strPaymentMethod)) {
                lstPaymetMethodGroup.get(i).click();
                break;
            }
        }
        getDriver().switchTo().frame(0);
        inputNumbertc.sendKeys(strNumberTC);
        funcionesComunes.waitElementTxt(lstFees);
        lstFees.sendKeys(strFeeds);
        inputNametc.sendKeys(strNameTC);
        inputMonth.sendKeys(strMonth);
        inputYear.sendKeys(strYear);
        inputCvvs.sendKeys(strCVS);
        chkAddress.click();
        inputAddressTC.sendKeys(strAddressTC);
        inputStateTC.sendKeys(strStateTC);
        inputCityTC.sendKeys(strCityTC);
        getDriver().switchTo().window(parentWinHandle);
    }



    public void SelectCreditCardPaymentMethod(String strPaymentMethod,String strFeeds,String strCVS) throws InterruptedException {
        String parentWinHandle = getDriver().getWindowHandle();
        funcionesComunes.waitElement(paymetMethodGroup);
        Thread.sleep(2000);
        int size = lstPaymetMethodGroup.size();
        for (int i = 0; i < size; i++) {
            String objPaymetMethod = (lstPaymetMethodGroup.get(i)).getText();
            if (funcionesComunes.normalizeString(objPaymetMethod).equals(strPaymentMethod)) {
                lstPaymetMethodGroup.get(i).click();
                break;
            }
        }
        getDriver().switchTo().frame(0);
        funcionesComunes.waitElementTxt(lstFees);
        lstFees.sendKeys(strFeeds);
        inputCvvs.sendKeys(strCVS);
        getDriver().switchTo().window(parentWinHandle);

    }



    public void ClickOnThePayButton()  {
        funcionesComunes.waitElementClicleable(btnPay);
        btnPay.click();

    }

  /*  public void SelectNameAndPrice() {
    	//funcionesComunes.waitLstElement(lstProducts);
		int size = lstProducts.size();
		for (int i = 0; i < size; i++) {
			String objMenu = (lstProducts.get(i)).getText();
			if (objMenu.equals(strProductList)) {
				//funcionesComunes.scrollDown();
				try {
					strProductPrice = lstProductPrice.get(i).getText().replace("$", "COP");
					System.out.println("el producto " + strProductList + " su precio es: " + strProductPrice);
					//funcionesComunes.waitElement(btnLstAddToCart.get(i));
					//System.out.println("si agrego producro al carrito " +strProductList);
					funcionesComunes.scrollUp();
				} catch (Exception e) {
					System.out.println("Error: no selecciono el precio del producto: " + e.getMessage());
				}
				break;
			}
		}
}*/


    public void SelectNameAndPriceProducts() {
        //funcionesComunes.waitLstElement(lstProducts);
        int size = lstProducts.size();
        for (int i = 0; i < size; i++) {
            String objMenu = (lstProducts.get(i)).getText();
            if (objMenu.equals(strProductList)) {
                //funcionesComunes.scrollDown();
                try {

                    //strProductPrice = lstProductPrice.get(i).getText().replace("$", "COP");
                    //System.out.println("el producto " + strProductList + " su precio es: " + strProductPrice);
                    //funcionesComunes.waitElement(btnLstAddToCart.get(i));
                    //System.out.println("si agrego producro al carrito " +strProductList);
                    funcionesComunes.scrollUp();

                } catch (Exception e) {
                    System.out.println("Error: no selecciono el precio del producto: " + e.getMessage());


                }

                break;
            }

        }

    }


    public void successfulValidateProductInTheCart() {

        try {

            funcionesComunes.waitElement(txtProductMyCart);
            strRtdProductMyCart=txtProductMyCart.getText().toLowerCase();
            strRtdPricetMyCart=txtPricetMyCart.getText().replace(",00", "");
            Assert.assertEquals(strProductList.toLowerCase(), strRtdProductMyCart);
            System.out.println("si encuentra el producto del carrito:" + strRtdProductMyCart);
            Assert.assertEquals(strProductPrice, strRtdPricetMyCart);
            System.out.println("Si encuentra precio del carrito: " + strRtdPricetMyCart +" "+ strProductPrice);


        }catch(Exception e) {
            System.out.println("Error:No encuentra el precio ni el producto del carrito : " +strRtdPricetMyCart+ " Supero tiempo de espera: " + e.getMessage());

        }

    }




    public void successfulValidateProductsInTheCart() {

    }

    public void selectPickupInSite() {
        funcionesComunes.waitElementClicleable(btnPickup);
        btnPickup.click();
    }

    public void selectCityPickup(String strCity)  {
        funcionesComunes.waitElementClicleable(lstSelectCity);
        Actions action = new Actions(getDriver());
        action.moveToElement(lstSelectCity);
        action.click();
        action.sendKeys(strCity);
        action.sendKeys(Keys.RETURN);
        action.build().perform();
    }

    public void selectStore(String strStore)  {
        funcionesComunes.waitElementClicleable(lstSelectStore);
        Actions action = new Actions(getDriver());
        action.moveToElement(lstSelectStore);
        action.click();
        action.sendKeys(strStore);
        action.sendKeys(Keys.RETURN);
        action.build().perform();
    }

    public void clickOnConfirmPickup() {
        funcionesComunes.waitElementClicleable(btnConfirmPickup);
        btnConfirmPickup.click();
    }

    public void EnterPreEmailUnregistered() {
        funcionesComunes.waitElementClicleable(preEmail);
        String strUnregisteredEmail=funcionesComunes.createEmail();
        preEmail.sendKeys(strUnregisteredEmail);
    }

    public void clickBtnPreEmail() {
        btnPreEmail.click();
    }

    public void selectShippingMethod() {
        optionPickup.click();
    }

    public void deliverySchedulePickupInPoint() {
        funcionesComunes.waitElementClicleable(btnScheduledDeliveryPickup);
        funcionesComunes.scrollDown("750");
        btnScheduledDeliveryPickup.click();
        funcionesComunes.waitElementClicleable(btndaykeyboardSelected);
        btndaykeyboardSelected.click();
    }

    public void EnterPreEmailRegistered(String strEmail) {
        funcionesComunes.waitElementClicleable(preEmail);
        preEmail.sendKeys(strEmail);
    }

    public void clickBtnContinuePreEmail() {
        funcionesComunes.waitElementClicleable(btnContinuePreEmail);
        btnContinuePreEmail.click();
    }

    public void selectEditAddress() {
        funcionesComunes.waitElementClicleable(btnEditAddress);
        btnEditAddress.click();
    }

    public void searchProduct(String product) {
        funcionesComunes.waitElement(inpuntSearchProduct);
        inpuntSearchProduct.sendKeys(product + Keys.ENTER);
    }
}