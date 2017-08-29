package examples.helloworld

class App(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    val app = App(mapOf(
            "name" to "Jaono",
            "age" to 25
    ))

    println("name = ${app.name},age = ${app.age}")
}