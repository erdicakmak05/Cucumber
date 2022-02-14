package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\Pcucumber-reports2.html",
                "json:target/json-reports/Pcucumber2.json",
                "junit:target/xml-report/Pcucumber2.xml"},
        features = "src/test/resources/features", // featurelarin yolu
        glue = "stepdefinitions", //methodların yolu
        tags = "@paralel2",
        dryRun = false   //True ise driver'i çalıştırmadan eksik methodlari verir
)

public class ParalelTestRunner2 {
}
