package examples.helloworld

data class User1(val name: String, val id: Int)

fun main(args: Array<String>) {

    val map = hashMapOf<String, String>()
    map.put("H", "1")
    map.put("HD", "12")
    map.put("HDD", "122")
    for ((key, value) in map)
        println("KEY = $key,value = $value")
    println("-----------------------------")

    val user = User1("alex", 1)
    println(user)
    println("-----------------------------")

    val user1 = User1("alex", 1)
    val user2 = User1("max", 2)
    println("-----------------------------")

    println("user == user1: ${user == user1}")
    println("user == user2: ${user == user2}")

    println("-----------------------------")

    println(user.copy())
    println(user.copy("max"))
    println(user.copy(id = 2))
    println(user.copy("max", 2))


}

