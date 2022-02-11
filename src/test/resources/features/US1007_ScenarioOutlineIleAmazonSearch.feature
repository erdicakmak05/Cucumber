Feature: US1007 Scenario Outline ile amazon search

  Scenario Outline: TC12 amazonda bir listedeki tüm elementler aratılacak

    Given kullanici "AmazonUrl" sayfasina gider
    And "<aranacakEleman>" icin arama yapar
    Then sonuclarin "<aranacakEleman>" icerdigini test eder


    Examples:
    |aranacakEleman|
    |Kazma|
    |Kürek|
    |Kuş  |