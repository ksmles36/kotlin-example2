package loop

fun main(args: Array<String>) {
    for (i in 1..5) println(i)
    println()

    for (i in 5 downTo 1) println(i)
    println()

    for (i in 1..5 step 2) println(i)
    println()

    val num1: Int = 2
    val num2: Int = 4
    for (n in num1..num2) println(n)
    

}