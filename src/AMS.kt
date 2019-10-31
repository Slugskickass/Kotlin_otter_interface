import java.lang.Math.random
import java.util.*
//import net.imagej.Dataset

fun main(args: Array<String>){
   println("Hello, ${args[0]} !")
    dayOfWeek()
    feedTheFish()
}

fun dayOfWeek() {
    println("what is the day of the week ?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(
        when (day) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "Time has stopped"
        }
    )
}

fun feedTheFish(){
    val day = randomDay()
    val type = fishFood(day)
    println("to day is $day feed the fish $type")
}

fun randomDay() : String {
    val week = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood (day : String) : String{
    var food = "fasting"

    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}

fun swim(speed : String = "fast"){
    println("swimming $speed")
}