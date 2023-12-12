fun main(args: Array<String>) {
    println("Hello World!")
//    this is variable changeable
    var x: Int = 1
//    this is constant
    val y: Int = 2
//    Long
    val big_number = 32L
//    float
    val a = 3.32f
    val precise_decimal = 3.3333
    val boolean_num = false
    var mul = 3*4
    x = 4

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}"+ mul)

//    if else conditions
    if(x==4){
        println("x is 4")
    } else if(x==4){
        println("x is 3")
    }

//    we can use if-else conditions as variables
    var z = if(x==4) 2 else 3
}
