Feature: US1011 WebUniversty Window Handle
  @WebU
  Scenario Outline: TC16 Reasuble Methods ile Window Handle Testi

    Given kullanici "WUUrl" sayfasina gider
    And Login Portal'a  kadar asagi iner
    And Login Portal'a tiklar
    Then acilan diger window'a gecer
    And "<username>" ve  "<password>" kutularina deger yazar
    And login butonuna basin
    And popup'ta cikan yazinin validation failed oldugunu test eder
    And ok diyerek popup'i kapatir
    And ilk sayfaya geri doner
    And ilk sayfaya donuldugunu test eder


    Examples:
    |username|password|
    |erdi    |bey     |

