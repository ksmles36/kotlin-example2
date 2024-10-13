package function

fun main() {
    println(sum1(1, 12))
    println(sum2(1, 12))
    noReturnFunction("un used value")

    println()
    defaultParameter("parameter value")
    defaultParameter()
    println()

    namedArgument(c = "c임다", b = "b임다", a = "a임다")
}

fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun noReturnFunction(a: String) {
    println("print : $a")
}

fun defaultParameter(a: String = "default value") {
    println("print: $a")
}

fun namedArgument(a: String, b: String, c: String) {
    println("$a $b $c")
}
