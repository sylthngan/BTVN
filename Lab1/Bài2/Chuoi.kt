import kotlin.math.PI

class sCabin(val residents: Int, val buildingMaterial: String) {

    fun capacity(): Int {
        return residents
    }

    fun hasRoom(): Boolean {
        return residents < 10
    }
}

fun main(){
    val name = "Android"
    println(name.length)

    val num = 18
    println(" $num people")

    val number = 10
    val groups = 5
    println(" ${number * groups} people")

    var a = 16
    val b = 4
    a += b
    println(a)
    a -= b
    println(a)
    a *= b
    println(a)
    a /= b
    println(a)

    val squareCabin = sCabin(4, "Wood")
    with(squareCabin) {
        println("Capacity: ${capacity()}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
    }

    val radius = 3.0
    val area = PI * radius * radius
    println(area)

}
