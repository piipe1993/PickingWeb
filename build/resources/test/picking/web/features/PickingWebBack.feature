@Back
Feature: Validate the download to the database of Market orders


  Background: Loggin in web site
#    Given Ingresar al sitio del exito "andres.cardona@sqasa.co" "Andres1993"


  @CaseMercadoDomicilio
  Scenario Outline: Validate the download of differents order types with different means of payment and discounts modality DP
#    Given Search the <Product> in website
#    And Select product PLP <Product>
#    When Select delivery at home and enter email qwerty@qwerty.co
#    And  Click on the confirm address button
#    And Click on my cart
#    And Click on the button to finalize purchase
#    And Delivery schedule
#    And Click on the go to payment button
#    And Select payment method <Paymentmethod>
#    And Click on the pay button
#    Then Successful purchase
#    And Validate fields in the database <Order> with Excel File <NameFile>
    And Validate the complete flow from the Picking web dispatch window of the market order <Order> with the transport type <TransportType>
#    And Validate the complete flow from the Picking web dispatch window of the buy and collect market order <Order>

    Examples:
      | Product                    | Paymentmethod         | NameFile               | Order        |TransportType|
      | Milo doy pack x 250 gramos | Tarjeta Credito Mixto | Campos_Mer_DP_TC_DE_PF | 948683429647 |Carro        |




  @CaseMercadoCYR
  Scenario Outline: Validate the download of differents order types with different means of payment and discounts modality DP
#    Given Search the <Product> in website
#    And Select product PLP <Product>
#    When Select delivery at home and enter email qwerty@qwerty.co
#    And  Click on the confirm address button
#    And Click on my cart
#    And Click on the button to finalize purchase
#    And Delivery schedule
#    And Click on the go to payment button
#    And Select payment method <Paymentmethod>
#    And Click on the pay button
#    Then Successful purchase
#    And Validate fields in the database <Order> with Excel File <NameFile>
#    And Validate the complete flow from the Picking web dispatch window of the market order <Order> with the transport type <TransportType
    And Validate the complete flow from the Picking web dispatch window of the buy and collect market order <Order>

    Examples:
      | Product                    | Paymentmethod         | NameFile               | Order        |
      | Milo doy pack x 250 gramos | Tarjeta Credito Mixto | Campos_Mer_DP_TC_DE_PF | 948683429647 |




