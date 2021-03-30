#Autor: Luis Lopez
@stories
Feature: Register user in Utest
  @scenario1
  Scenario: Register user Luis on the utest page
    Given that Luis wants to register on the utest page
    When he filled out the form on the page
    |firstName|lastName  |email                 |birthMonth|birthDay|birthYear|city     |codePostal|country |password    |systemOperative|version  |language|
    |Luis     |Lopez     |luialberto93@gmail.com|May       |5       |1993     |Montería |230303    |Colombia|@Alberto123*  |Windows        |10 64-bit|Spanish |
    Then he verifies Welcome to the world's largest community of freelance software testers!
