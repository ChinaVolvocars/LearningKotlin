package examples.helloworld

/**
 * Created by Administrator on 2017/8/24.
 */
fun main(args: Array<String>) {
    println("Hello, world!")

//    whileLoop()

    Greeter(args[0]).greet()


    if (args.size == 0) {
        println("\"Please provide a name as a command-line argument\"")
        return
    }


    println("Hello,${args[0]}")
}

fun readName(array: Array<String>) {
    for (name in array)
        println("Hello,$name!")
}


fun multiLanguage(array: Array<String>) {

    val language = if (array.size == 0) "EN" else array[0]

    println(when (language) {
        "EN" -> "Hello!"
        "FR" -> "Salut!"
        "IT" -> "Ciao!"
        else -> "Sorry, I can't greet you in $language yet"
    })

}

class Greeter(val name: String) {
    fun greet() {
        println("hello,${name}")
    }
}

fun whileLoop(args: Array<String>) {
    var i = 0
    while (i < args.size)
        println(args[i++])
}