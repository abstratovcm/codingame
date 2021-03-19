import java.util.*
import java.io.*
import java.math.*
import kotlin.math.*

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val N = input.nextInt()
    var pi = IntArray(N) {0}

    for (i in 0 until N) {
        pi[i] = input.nextInt()
    }

    pi = pi.sorted().toIntArray()

    var min = pi[1]-pi[0]

    for (i in 0 until N-1)
        if (pi[i+1]-pi[i] < min) min = pi[i+1]-pi[i]
   

    
    println(min)
}
