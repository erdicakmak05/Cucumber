@parametreliTest
Feature: US1003 parametre ile stepdefinition olusturma

  Scenario: TC05_Parametre kullanımı

    Given kullanici amazon sayfasina gider
    And "iPhone" icin arama yapar
    Then sonuclarin "iPhone" icerdigini test eder
    And sayfayi kapatir