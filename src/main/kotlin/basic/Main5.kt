package basic

fun main() {

    var neverNull: String = "이 변수는 null이 될 수 없습니다."
//    neverNull = null
    println(neverNull)

    var nullable: String? = "이 변수는 null이 될 수 있습니다."
    nullable = null
    println(nullable)

    var inferredNonNull = "컴파일러 타입추론은 null-불가로 봅니다."
//    inferredNonNull = null

    fun strLength(value: String): Int {
        return value.length
    }

    val str1: String = "변수1"
    val str2: String? = "null 가능한 변수2"

    val length = strLength(str1)
//    strLength(str2)
    println(length)


}