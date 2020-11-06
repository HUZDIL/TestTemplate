
Feature: Edit info

  @firstTask
  Scenario: : Customer has access to change setting into system
  Given Customer is logged in
  When Customer clicks the setting button
  And Customer clicks the User info tab
  Then Customer edit info fields to add updated info
    Then Verify to the changes



