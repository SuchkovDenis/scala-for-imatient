// 1
import Array.range
import scala.collection.mutable.ArrayBuffer
val a1: Array[Int] = range(1, 10)
// или так:
val a2: Array[Int] = new Array[Int](9)
for (i <- a2.indices)
  a2(i) = i + 1

// 2
val a3 = Array(1, 2, 3, 4, 5)
for (i <- a3.indices by 2)
  if (i + 1 < a3.length) {
    val t = a3(i)
    a3(i) = a3(i + 1)
    a3(i + 1) = t
  }
a3
// или так:
a3.grouped(2).flatMap(_.reverse).toArray

// 3
val a4 = Array(1, 2, 3, 4, 5)
for {
  xs <- a4.grouped(2).toArray
  x <- xs.reverse
} yield x

// 4
val a5 = Array(1, -1, -2, 2, -3, 0, 3, 4, 0, 5, -4, -5)
a5.filter(i => i > 0) ++ a5.filter(i => i <= 0)

// 5
val a6 = Array(4, 5, 1, 2.0, 3)
a6.sum / a6.length

// 6
a6.sorted(Ordering[Double].reverse)
val a7 = ArrayBuffer(4, 5, 1, 2.0, 3)
a6.sorted(Ordering[Double].reverse)

// 7
val a8 = Array(1, 1, 2, 3, 4)
a8.distinct

// 8-9
// pass

// 10
java.util.TimeZone.getAvailableIDs
  .filter(s => s.startsWith("America/"))
  .map(s => s.substring("America/".length))
  .sorted

// 11
// pass
