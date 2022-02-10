Feature: US1002 Background ile amazon search testi

  Background: amazon sayfasına gidiş
    Given kullanici amazon sayfasina gider

  @wip
  Scenario: TC02_Amazon Iphone Search Testi

    And iPhone icin arama yapar
    Then sonuclarin Iphone icerdigini test eder
  @wip
  Scenario: TC02_Amazon Tea Pot Search Testi

    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder

  Scenario: TC02_Amazon Flower Search Testi

    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder