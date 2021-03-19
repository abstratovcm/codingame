import java.util.*
import java.io.*
import java.math.*

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val lightX = input.nextInt()
    val lightY = input.nextInt()
    val initialTx = input.nextInt()
    val initialTy = input.nextInt()

    var Tx = initialTx
    var Ty = initialTy

    var answer = ""

    while (true) {
        val remainingTurns = input.nextInt()

        when{
            (lightY > Ty) -> {answer = answer.plus("S"); Ty += 1}
            (lightY < Ty) -> {answer = answer.plus("N"); Ty -= 1}
            else          -> {answer = answer.plus("")}
        }
        
        when{
            (lightX > Tx) -> {answer = answer.plus("E"); Tx += 1}
            (lightX < Tx) -> {answer = answer.plus("W"); Tx -= 1}
            else          -> {answer = answer.plus("")}
        }

        println(answer)
        answer = ""
    }
}

