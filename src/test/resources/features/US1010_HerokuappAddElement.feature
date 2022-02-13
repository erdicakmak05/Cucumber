Feature: US1010 Herokuapp sayfasında add butonu testi

  Scenario: TC15 sonradan gorunen elemanlar çalışmali

    Given kullanici "HerokuappAddElementUrl" sayfasina gider
    When kullanici Add Element butona basar
    And Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler





