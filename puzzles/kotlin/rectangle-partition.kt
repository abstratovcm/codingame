import java.util.*
import java.io.*
import java.math.*

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val w = input.nextInt()
    val h = input.nextInt()
    val countX = input.nextInt()
    val countY = input.nextInt()
    var x = mutableListOf<Int>()
    for (i in 0 until countX) {
        x.add(input.nextInt())
    }
    x.add(w)
    var y = mutableListOf<Int>()
    for (i in 0 until countY) {
        y.add(input.nextInt())
    }
    y.add(h)

    for (i in 0 until countX)
        for (j in i+1..countX)
            x.add(x[j]-x[i])
    x.sort()
        
    for (i in 0 until countY)
        for (j in i+1..countY)
            y.add(y[j]-y[i])
    y.sort()

    println(countSquares(x,y))
}

fun countSquares(x:MutableList<Int>, y:MutableList<Int>):Int{
    var count = 0
    for (i in x){
        for (j in y){
            if (i == j)
                count++
            else if (i < j)
                break
        }
    }
    return count
}
