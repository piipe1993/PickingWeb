package picking.web.definitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import picking.web.steps.PickingWebSteps;

public class PickingWebDefinition {
    @Steps
    PickingWebSteps pickingWeb;



    @And("^Validate the complete flow from the Picking web dispatch window of the market order (.*) with the transport type selected$")
    public void validate_the_complete_flow_from_the_picking_web_dispatch_window_of_the_order_with_the_transport_type(String order) {
        pickingWeb.searchOrder(order);
        pickingWeb.goToPickingState();
        pickingWeb.goToRegisterPosState();
        pickingWeb.selectTransportBy();
        pickingWeb.confirmDelivery();

    }

    @And("^Validate the complete flow from the Picking web dispatch window of the buy and collect market order (.*)$")
    public void validate_the_complete_flow_from_the_picking_web_dispatch_window_of_the_buy_and_collect_market_order(String order)  {
        pickingWeb.searchOrder(order);
        pickingWeb.goToPickingState();
        pickingWeb.goToRegisterPosState();
        pickingWeb.confirmDeliveryCYR();

    }

}
