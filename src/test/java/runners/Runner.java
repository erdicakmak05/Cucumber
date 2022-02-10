package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // featurelarin yolu
        glue = "stepdefinitions", //methodların yolu
        tags = "@hotel",
        dryRun = true   //True ise driver'i çalıştırmadan eksik methodlari verir
)
public class Runner {

    //Runner class'inin bodysine hiçbir kod yazmıyoruz
    //Önemli olan bu class icin 2 adet notasyon kullanacağız
}
