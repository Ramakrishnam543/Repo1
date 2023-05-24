Feature:
 Scenario Outline: book an appointment
  Given user is on login page
  When enter user name asJohn Doe and password as ThisIsNotAPassword "<username>"  "<password>"
  And select the Hong kong center
  And Apply for readmission option and select none of health care product
  Then enter date and mention comment
  And Click on book appointment
   Then validate text on a webpage



    Examples:
    |username|password|
    |John Doe|ThisIsNotAPassword|


