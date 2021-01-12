
// 2
import scala.math.{pow, sqrt}
pow(sqrt(3), 2)

// 3
// переменные res в REPL являются val

// 4
"crazy" * 3

// 5
10 max 2

// 6
BigInt(2).pow(1024)

// 7
import scala.math.BigInt.probablePrime
import util.Random
probablePrime(100, Random)

// 8
import util.Random.nextInt
nextInt().toHexString

// 9
val string = "hello world"
string(0)
string.last

// 10
string.take(3)
string.drop(3)
string.takeRight(3)
string.dropRight(3)
