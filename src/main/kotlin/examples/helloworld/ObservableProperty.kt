package examples.helloworld

import kotlin.properties.Delegates

class Use {
    var name: String by Delegates.observable("NO NAME") { d, old, new ->
        println("$old - $new")
    }
}

fun main(args: Array<String>) {
    val use = Use()
    use.name = "carl"

}