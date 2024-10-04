package basic

fun main() {

    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "하이 ")




}


