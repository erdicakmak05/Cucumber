package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\Pcucumber-reports1.html",
                "json:target/json-reports/Pcucumber1.json",
                "junit:target/xml-report/Pcucumber1.xml"},
        features = "src/test/resources/features", // featurelarin yolu
        glue = "stepdefinitions", //methodların yolu
        tags = "@paralel1",
        dryRun = false   //True ise driver'i çalıştırmadan eksik methodlari verir
)

public class ParalelTestRunner1 {
}
