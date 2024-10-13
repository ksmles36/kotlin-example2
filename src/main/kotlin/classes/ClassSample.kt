package classes

fun main() {
    val jedi = PersonWithConstructor("jedi", 150)
    val flature = PersonWithConstructor("flature")
    val harry = PersonWithConstructor(name = "harry", age = 25, etc = "추가값")

    jedi.sayHello()
    jedi.introduce()

    flature.sayHello()
    flature.introduce()

    harry.sayHello()
    harry.introduce()
}
