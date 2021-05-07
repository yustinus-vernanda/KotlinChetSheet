/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

import kotlinx.coroutines.*

// TODO 1
suspend fun sum2(valueA: Int?, valueB: Int?): Int {
    val A = valueA?:0
    val B = valueB?:0
    val C = A+B

    delay(3000L)
    return C
}

// TODO 2
suspend fun multiple2(valueA: Int?, valueB: Int?): Int {
    val A = valueA?:0
    val B = valueB?:0
    val C = A*B
    delay(2000L)
    return C
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum2(10, 10) }
    val resultMultiple = async { multiple2(20, 20) }

    // TODO 3
    println("Result sum: "+resultSum.await())
    println("Result multiple: "+resultMultiple.await())
}