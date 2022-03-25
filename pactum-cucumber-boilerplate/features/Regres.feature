Feature: Regres

  In order to keep Regres api stable
  As a tester
  I want to make sure that everything works as expected

  Scenario: Get A User With Id
    Given I make a GET request to /api/v1/employees/1
      And I set path param id to $S{UserId}
     When I receive a response
     Then I expect response should have a status 200
      And I expect response should have a json like
      """
      {
        "id": 1,
        "firstName": "Razvan",
        "lastName": "Smith",
        "dob": "1994-05-06",
        "email": "iamqarv@gmail.com"
      }
      """

  Scenario: Create A User
    Given I make a POST request to /api/v1/employees
      And I set body to
      """
      {
        "dob": "1967-06-06",
        "email": "foobar12@gmail.com",
        "firstName": "John",
        "lastName": "Bravo"
      }
      """
     When I receive a response
     Then I expect response should have a status 201