import java.util.*
import java.io.*
import java.math.*
import kotlin.text.*
import kotlin.math.*

// I seriously need to rewrite this someday hehe

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val W = input.nextInt()
    val H = input.nextInt()
    val T0 = input.nextInt()
    val T1 = input.nextInt()
    val T2 = input.nextInt()
    input.nextLine()

    val initial = Array(H) {input.nextLine()}

    // positionH represents the vertical coordinates of
    // the asteroids during the first and second time
    var positionH = Array(26) {intArrayOf(-1, -1)}

    // positionH represents the horizontal coordinates of
    // the asteroids during the first and second time
    var positionW = Array(26) {intArrayOf(-1, -1)}
    
    var char:Int

    // looking for asteroids!!
    for(i in 0 until H){
        for(j in 0 until W){
            char = initial[i][j].toInt() - 65
            if (char in 0..25){
                positionH[char][0] = i
                positionW[char][0] = j
            }
            char = initial[i][j+W+1].toInt() - 65
            if (char in 0..25){
                positionH[char][1] = i
                positionW[char][1] = j
            }
        }
    }

    // finalPosition will show us the final answer
    var finalPosition = Array(H) {CharArray(W) {'.'}}

   for (i in 0..25){
        var fH = -1
        var fW = -1
        // calculating the final position
        if (positionH[i][1] >= 0){
            fH = (T2-T0) * (positionH[i][1] - positionH[i][0])
            fH = floor(fH.toDouble()/(T1-T0).toDouble()).toInt() + positionH[i][0]
            
            fW = (T2-T0) * (positionW[i][1] - positionW[i][0])
            fW = floor(fW.toDouble()/(T1-T0).toDouble()).toInt() + positionW[i][0]
        }
        if (fH in 0 until H && fW in 0 until W && finalPosition[fH][fW] == '.'){
            finalPosition[fH][fW] = (i+65).toChar()
        }
    }

    finalPosition.forEach(){
        println(it)
    }
}
