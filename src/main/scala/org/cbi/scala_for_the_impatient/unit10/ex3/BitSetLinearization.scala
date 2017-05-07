package org.cbi.scala_for_the_impatient.unit10.ex3

class BitSetLinearization {

  "scala.immutable.BitSet Linearization"

  "lin(scala.immutable.BitSet) = " +
    "scala.immutable.BitSet >> " +
    "lin(Serializable) >> " + /*Drop this*/
    "lin(scala.collection.BitSetLike) >> " +
    "lin(scala.collection.BitSet) >> " +
    "lin(scala.collection.immutable.SortedSet) >> " +
    "lin(scala.collection.AbstractSet) = " +
    "" +
    "scala.immutable.BitSet >> " +
    "(scala.collection.BitSetLike >> scala.collection.SortedSetLike >> scala.collection.SortedSet) >> " +
    "(scala.collection.BitSet >> scala.collection.BitSetLike >> scala.collection.SortedSet) >> " +
    "(scala.collection.immutable.SortedSet >> scala.collection.SortedSetLike >> scala.collection.SortedSet >> scala.collection.immutable.Set) >> " +
    "(scala.collection.AbstractSet >> scala.collection.Set >> scala.collection.AbstractIterable) = " +
    "" +
    "scala.immutable.BitSet >> " +
    "scala.collection.BitSet >> scala.collection.BitSetLike >> " +
    "scala.collection.immutable.SortedSet >> scala.collection.SortedSetLike >> scala.collection.SortedSet >> scala.collection.immutable.Set >> " +
    "scala.collection.AbstractSet >> scala.collection.Set >> scala.collection.AbstractIterable"
}