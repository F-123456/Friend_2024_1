@UKBA

Feature:
  Scenario: Country and Study
    Given I am on UKba Website
    When I provide nationality of "Japan"
    And I click on Continue button
    And I select reason as "Study"
    And I click on Continue button
    And I state I intend to stay for more than 6 months
    And I click on Continue button
    Then I should be informed that "You'll need a visa to study in the UK"



#  @UKBA
#  Scenario Outline: Nationalities and Tourism
#    Given I am on UKba Website
#    Given I choose nationality of "<CountryName>"
#    And I click on Continue button
#    And I select the "<reason>" for coming to Uk
#    And I click on Continue button
#    And I select "Yes" button for travelling with or visiting partner or family member
#    And I click on Continue button
##    Then I should be informed that "<Message>"
#    Then  I will be informed "<You'll usually need a visa to come to the UK>"
#    Examples:
#
#    Examples:
#      | CountryName |reason|
#      | Russia      |   Tourism    |
#      |Cuba         |   Tourism    |
#      |Belarus      |   Tourism    |
#      |Albania      |   Tourism    |