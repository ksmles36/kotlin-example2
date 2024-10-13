package classes

class KsmPerson(private val name: String, private val age: Int) {

    var address: String = ""

    init {
        println("init 블록 실행됨!")
    }

    fun sayHello() {
        println("hello ksm, name: $name, age: $age, address: $address")
    }

}