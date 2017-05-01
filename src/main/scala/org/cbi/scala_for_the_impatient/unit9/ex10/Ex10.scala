package org.cbi.scala_for_the_impatient.unit9.ex10

import scala.collection.mutable.ArrayBuffer

@SerialVersionUID(42L)
case class Person(name: String) extends Serializable {
  private val _friends = new ArrayBuffer[Person]

  def friends = new ArrayBuffer[Person] ++= _friends

  def addFriend(friend: Person) { _friends += friend }
  def addFriends(friends: Array[Person]) { _friends ++= friends }

  def removeFriend(friend: Person) { _friends -= friend }
  def removeFriends(friends: Array[Person]) { _friends --= friends }
}