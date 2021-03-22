import java.util.*
import java.io.*
import java.math.*
import kotlin.math.*

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    var N = input.nextInt().toDouble()
    when{
        N>1 -> println((N.pow(3) - (N-2).pow(3)).toInt())
        N==1.0 -> println(1)
    }
}
