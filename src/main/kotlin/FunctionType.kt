typealias Arithmetic = ((Int, Int) -> Int)?

val sum1: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

fun main() {
    val sumResult = sum1?.invoke(10, 10)
    val multiplyResult = multiply?.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)
}