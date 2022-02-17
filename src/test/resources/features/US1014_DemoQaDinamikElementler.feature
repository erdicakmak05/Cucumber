Feature: US1014 Dinamik Elemanlar
  @Dinamik
  Scenario: TC19 Dinamik elementlere tıklanabilmeli

    Given kullanici "DemoQaUrl" sayfasina gider
    Then "Will enable 5 seconds" butonunun enable olmasini bekleyin
    And "Will enable 5 seconds" butonunun enable oldugunu test edin

