package examples.helloworld

/**
 * 基本语法
 */
fun main(array: Array<String>) {
//    val x = array[0].toInt()
    val x = 1
    val y = 10
    if (x in 1..y - 1)
        println("----OK----")

    for (a in 1..8)
        print("${a}")

    println()
    val array = arrayListOf<String>()
    array.add("A")
    array.add("B")
    array.add("C")

    if (x in 0..array.size - 1)
        println("Out: array has only ${array.size} elements. x = ${x}")

    if ("A" in array)
        println("YES")
    if ("B" in array)
        println("yes b")
    else
        println("no")

    val max = max(2, 1)
    print("-------------" + max)
    print(maxA(33, 3))

    val stringLength = getStringLength("aaaaa")
    val stringLength1 = getStringLength(1)
    println(stringLength)
    println(stringLength1)

    if (array.size < 2) {
        println("No number supplied")
    } else {
        val x = parseInt(array[0])
        val y = parseInt(array[1])

        if (x != null && y != null) {
            print(x * y)
        } else {
            println("One of the arguments is null")
        }
    }


    println("------转换------")
    val parseInt = parseInt("2222")
    println(parseInt)
}

fun parseInt(string: String): Int? {
    try {
        return string.toInt()
    } catch (e: NumberFormatException) {
        println("One of the arguments isn't Int")
    }
    return null
}


fun getStringLength(obj: Any): Int? {

    if (obj is String)
        return obj.length

    return null
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun maxA(a: Int, b: Int) {
    if (a > b)
        a
    else
        b
}

fun whileD(array: Array<Int>) {
    var a = 0;
    while (a < array.size)
        println(array[a++])

}

fun forLoop(array: Array<Int>) {
    for (a in array)
        println(a)

    for (i in array.indices)
        println(array[i])

}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("one")
        "Hello" -> println("Greeting")
        is Long -> println("long")
        !is String -> println("NOT String")
        else -> println("unknown")
    }
}