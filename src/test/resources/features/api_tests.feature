Feature: REST API Testing with Cucumber

  Scenario: Get all posts
    When I send a GET request to "/posts"
    Then the response status code should be 200
    And the response should contain multiple posts

  Scenario: Get a specific post
    When I send a GET request to "/posts/1"
    Then the response status code should be 200
    And the response should contain post with id 1

  Scenario: Create a new post
    Given I have the following post data:
      | title     | body               | userId |
      | Test Post | This is a test post| 1      |
    When I send a POST request to "/posts"
    Then the response status code should be 201
    And the response should contain the created post

  Scenario: Update an existing post
    Given I have the following post data:
      | title        | body                   | userId |
      | Updated Post | This is an updated post| 1      |
    When I send a PUT request to "/posts/1"
    Then the response status code should be 200
    And the response should contain the updated post 