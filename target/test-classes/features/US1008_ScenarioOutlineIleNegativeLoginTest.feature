@SO
Feature: US1008 Scenario Outline kullanarak farkli degerlerle nagateive login testi

  Scenario Outline: TC13 farkli kullanici adi ve password

    Given kullanici "HMCUrl" sayfasina gider
    And kullanıcı login linkine tiklar
    Then scenario outline'dan username olarak "<username>" yazar
    And scenario outline'dan password olarak "<password>" yazar
    And login butonuna basar
    Then giris yapilamadigini test eder

    
    
    Examples:
    |username|password|
    |MANAGER |MANAGER1|
    |manager |manager1|
    |MAnager |MANager1|
    |MAN ager|Man ager1|
