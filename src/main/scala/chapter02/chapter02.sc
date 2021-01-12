// 1
def sign(x: Int): Int = {
  x match {
    case x if x < 0 => -1
    case x if x > 0 => 1
    case _ => 0
  }
}

// 2
val x: Unit = {}

// 3
var y: Int = 2
val t: Unit = y = 1

// 4
for (i <- 10 to 1 by -1)
  println(i)

// 5
def countDown(n: Int): Unit = {
  for (i <- n to 0 by -1)
    println(i)
}

// 6
var r: Long = 1
for (c <- "Hello")
  r = r * c.toLong
r

// 7
"Hello".map(_.toLong).product

// 8
def product(s: String): Long = {
  s.map(_.toLong).product
}

// 9
def productR(s: String): Long = {
  if (s.isEmpty) 1 else s(0) * productR(s.drop(1))
}

// 10
def pow(x: Double, n: Int): Double = {
  n match {
    case 0 => 1
    case n if n < 0 => 1 / pow(x, -n)
    case n if n % 2 == 0 => {
      val t = pow(x, n / 2)
      t * t
    }
    case n if n % 2 != 0 => x * pow(x, n - 1)
  }
}
