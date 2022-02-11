Feature: US1006_Negative Login Test

  Scenario: TC09 yanlis username, dogru sifre ile giris yapilamaz
    Given kullanici "HMCUrl" sayfasina gider
    Then kullanıcı login linkine tiklar
    And kullanıcı adi olarak "HMCWrongUsername" girer
    And password olarak "HMCValidPassword" girer
    Then login butonuna basar
    And giris yapilamadigini test eder
    And sayfayi kapatir

    Scenario: TC10 dogru username, yanlis sifre ile giris yapilamaz
      Given kullanici "HMCUrl" sayfasina gider
      Then kullanıcı login linkine tiklar
      And kullanıcı adi olarak "HMCValidUsername" girer
      And password olarak "HMCWrongPassword" girer
      Then login butonuna basar
      And  giris yapilamadigini test eder
      And sayfayi kapatir

    Scenario: TC11 yanlis username ve yanlis sifre ile giris yapamaz
      Given kullanici "HMCUrl" sayfasina gider
      Then kullanıcı login linkine tiklar
      And kullanıcı adi olarak "HMCWrongUsername" girer
      And password olarak "HMCWrongPassword" girer
      Then login butonuna basar
      And giris yapilamadigini test eder
      And sayfayi kapatir