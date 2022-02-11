Feature: US1005 Positive login testi
  @hotel
  Scenario: TC08 Positive Login

    Given kullanici "HMCUrl" sayfasina gider
    And kullanıcı login linkine tiklar
    Then kullanıcı adi olarak "HMCValidUserName" girer
    And password olarak "HMCValidPassword" girer
    And login butonuna basar
    Then basarili olarak giris yapildigini test eder
    And sayfayi kapatir
