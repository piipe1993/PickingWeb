package picking.web.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/picking/web/features/PickingWebBack.feature",
        glue = "picking.web.definitions",
        //tags = "@TestCase1",
        snippets = SnippetType.CAMELCASE,
        plugin = "json:target/cucumber_json/cucumber.json"
)

public class RunnerPickingWeb {
}
