Feature: Registration
  As user, I want to be able to register on demotours

  Scenario: Register user with valid information
    Given user is on the landing page
    When user clicks on the "REGISTER" link
    Then user enters registration information:
      | First Name       | Zheka               |
      | Last Name        | Grechka             |
      | Phone            | 2403430000          |
      | Email            | test_user@email.com |
      | Address          | 123 Fake Dr         |
      | City             | Silver Summer       |
      | State/Province   | Maryland            |
      | Postal Code      | 21210               |
      | Country          | United States       |
      | User Name        | zheka_forever       |
      | Password         | qwerty              |
      | Confirm Password | qwerty              |
    And clicks "SUBMIT" button