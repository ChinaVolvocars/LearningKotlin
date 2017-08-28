package examples.helloworld

fun main(array: Array<String>) {


    mapTest()
    /*val pair = Pair(1, "one")
    val (num, n) = pair
    println("num = $num,n = $n")

    val user = getUser()
    println("name = ${user.name},id = ${user.id}")

    val (name, id) = getUser()
    println("name = ${name},id = ${id}")

    println("name = ${getUser().component1()},id = ${getUser().component2()}")
*/
}

class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }

}

data class User(val name: String, val id: Int)

fun getUser(): User {
    return User("alex", 1)
}


fun mapTest() {
    val map = hashMapOf<String, Int>()
    map.put("one", 1)
    map.put("two", 2)
    map.put("three", 3)
    for ((key, value) in map)
        println("key = $key, value = $value")

    val get = map.get("one")
    val get1 = map.get("two")
    val get2 = map.get("three")
    println(get)
    println(get1)
    println(get2)

}