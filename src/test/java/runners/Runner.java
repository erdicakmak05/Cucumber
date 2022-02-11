package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber_rapor.html"},
        features = "src/test/resources/features", // featurelarin yolu
        glue = "stepdefinitions", //methodların yolu
        tags = "@Editor",
        dryRun = true   //True ise driver'i çalıştırmadan eksik methodlari verir
)
public class Runner {

    //Runner class'inin bodysine hiçbir kod yazmıyoruz
    //Önemli olan bu class icin 2 adet notasyon kullanacağız

    // features ve glue olarak spesifik bir class veya feature dosyasini degil
    // tum klasor ve package'i sectik
    // dolayisiyla stepdefinitions package'i icerisinde hangi class'da olursa olsun
    // isimize yarayan bir stepdefition varsa rahatlikla kullanabiliriz
}
