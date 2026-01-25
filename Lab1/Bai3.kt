fun main(){
    //Nhóm
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    val setOfNumbers = numbers.toSet()
    println(setOfNumbers)

    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3, 4, 5)

    println(set1.intersect(set2))
    println(set1.union(set2))

    //Sơ đồ
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 38,
        "Ann" to 23
    )
    println(peopleAges)

    peopleAges.put("Barbar", 42)
    println(peopleAges)

    peopleAges["Joes"] = 51
    println(peopleAges)

    //Phép toán trên tập hợp
    peopleAges.forEach{
        print("${it.key} is ${it.value}, ")
    }
    println()
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )

    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)

    val words = listOf("about", "acute", "balloon", "best", "brief", "class")
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }.shuffled().take(2).sorted()
    println(filteredWords)

    //Hàm phạm vi
    
}
