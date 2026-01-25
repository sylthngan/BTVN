
fun main(){

    val numbers = listOf(1,2,3,4,5,6)
    println(numbers.size)
    println(numbers[0])

    println(listOf("red", "blue", "green").reversed())

    val entrees = mutableListOf<String>()
    entrees.add("spaghetti")
    println(entrees)

    entrees[0] = "lasagna"
    println(entrees)

    entrees.remove("lasagna")
    println(entrees)
}