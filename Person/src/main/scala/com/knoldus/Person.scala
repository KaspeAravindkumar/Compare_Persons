package com.knoldus

class Person(val name: String, val age: Int) extends Ordered[Person] {
  def compare(that: Person): Int = {
    if((this.name compare that.name)== 0 ) {
      this.age - that.age
    } else {
      this.name.length - that.name.length
    }
  }
}




