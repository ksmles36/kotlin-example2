package basic

class Customer()

class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer()

    val contact = Contact(1, "ksm@gmail.com")

    println(customer)
    println(contact)

    println(contact.id)
    println(contact.email)

    contact.email = "asdf@naver.com"
    println(contact.email)

}