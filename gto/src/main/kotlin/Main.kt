import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


    //1.
    val exercises: Int = 13
    var exercisesSolved: Int = 0
    exercisesSolved += 1
    println(exercisesSolved)
    // создали константу =13 и переменную которую увеливали
//2.
    val averageAge: Int = 19
    //создана константа типа int.
//3.
    var personAge1: Double = 19.0
    var personAge2: Double = 30.0
    println((personAge1 + personAge2) / 2)
//
//4.
    val testNumber: Int = 15
    val evenOdd: Int = 15 % 2
    println(evenOdd)
    //
//5.
    var answer:Int = 0
    answer+=((1+10)*10)
    100 shr 8
    // результат = 13
//6.
    /*  age=16
    print(age)
    age=30
    print(age)
    val age: Int
    // используется val  и var */
//7.
    val a:Int= 46
    val b: Int=10
    val answer1: Int =(a*100)+b
//1 = 4610
    val answer2: Int =(a*100)+(b*100)
//2 = 5600
    val answer3: Int =(a*100)+b
//3 = 4601
    //
//8.
    (5*3)-(4/2)*2
    //
//9.
    val a1: Double = 45.0
    val b2: Double = 56.0
    val average: Double = (a1+b2)/2
    println(average)
    // результат = 50.5
//10.
    val F:Double = 156.0
    val fahrenheit: Double = (F-32)*5/9
    val celcius: Double = fahrenheit
    println(celcius)
    //

//13.
    val x1: Double = 45.0
    val y1: Double = 56.0
    val x2: Double = 30.0
    val y2: Double = 25.0
    val distance: Double =sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))
    println(distance)
    //



}