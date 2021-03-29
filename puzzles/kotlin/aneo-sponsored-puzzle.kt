import java.util.*
import java.io.*
import java.math.*
import kotlin.math.*

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val maxSpeed = input.nextInt()
    val lightCount = input.nextInt()
    var distance = IntArray(lightCount) {0}
    var duration = IntArray(lightCount) {0}
    for (i in 0 until lightCount) {
        distance[i] = input.nextInt()
        duration[i] = input.nextInt()
    }

    var speed = maxSpeed

    for (s in 1..maxSpeed){
        if(passesAll(distance, duration, s)){
            speed = s
        }
    }

    println(speed)
}

fun passesTrafficLight(distance:Int, duration:Int, speed:Double):Boolean
{
    var time = floor(round((distance.toDouble()/speed)*10000.0)/10000.0)/duration
    if(time.toInt() % 2 == 0)
        return true
    else{
        return false
    }
}

fun passesAll(distance:IntArray, duration:IntArray, speed:Int):Boolean{
    val N = distance.size
    var answer = true
    for (i in 0..N-1){
        if (!passesTrafficLight(distance[i], duration[i], speed.toDouble()/3.6))
            answer = false
    }

    return answer
}
