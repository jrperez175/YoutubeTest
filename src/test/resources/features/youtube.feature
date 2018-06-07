#Author: jrperez@bancolombia.com.co
@tag
Feature: Search song artist
  As a Web user 
  I want to use youtube
  To search for songs by my favorite artist

  @tag1
  Scenario Outline: Search song
    Given that jhon opens his browser at Youtube page
    When he enter your artist <artist>
    Then he would see your songs

    Examples: 
      | artist |
      | arjona |
