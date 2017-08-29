package examples.helloworld

import kotlin.properties.Delegates

class Stu {
    var name: String by Delegates.notNull()

    fun init(name: String) {
        this.name = name
    }
}

fun main(args: Array<String>) {
    val stu = Stu()
    stu.init("carl")
    println(stu.name)
}