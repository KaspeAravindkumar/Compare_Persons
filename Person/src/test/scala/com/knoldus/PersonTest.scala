package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class PersonTest extends AnyFlatSpec {

  "compare" should "return both are equal" in {
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test",24)
    val result = personOne compare personTwo
    assert(result==0)
  }

  it should "return person1 is greater" in {
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test",18)
    val result = personOne > personTwo
    assert(result)
  }

  it should "return person1 is greater because of lengthy name" in{
    val personOne = new Person("TestAgain", 24)
    val personTwo = new Person("Test",24)
    val result = personOne > personTwo
    assert(result)
  }

  it should "return person2 is greater" in {
    val personOne = new Person("Test", 18)
    val personTwo = new Person("Test",24)
    val result = personOne < personTwo
    assert(result)
  }

  it should "return person2 is greater because of lengthy name" in{
    val personOne = new Person("Test", 24)
    val personTwo = new Person("TestAgain",24)
    val result = personOne < personTwo
    assert(result)
  }

  it should "return fail because both are equal" in {
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test",24)
    val result = personOne > personTwo
    assert(!result)
  }

  it should "return fail because age of person1 is greater" in {
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test",18)
    val result = personOne < personTwo
    assert(!result)
  }

  it should "return fail because age of person2 is greater" in {
    val personOne = new Person("Test", 18)
    val personTwo = new Person("Test",24)
    val result = personOne > personTwo
    assert(!result)
  }

  it should "return fail because length of person1's name is lengthy" in{
    val personOne = new Person("TestAgain", 24)
    val personTwo = new Person("Test",24)
    val result = personOne < personTwo
    assert(!result)
  }

  it should "return fail because length of person2's name is lengthy" in{
    val personOne = new Person("Test", 24)
    val personTwo = new Person("TestAgain",24)
    val result = personOne > personTwo
    assert(!result)
  }

}
