fun main() {
    val hut = RoundHut(3, 5.0)
    val cabin = SquareCabin(4, 6.0, 2)

    println(hut.buildingMaterial)
    println(hut.floorArea())

    println(cabin.buildingMaterial)
    println(cabin.floorArea())
}

abstract class Dwelling(val residents: Int) {
    abstract val buildingMaterial: String
    abstract fun floorArea(): Double
}

open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"

    override fun floorArea(): Double {
        return Math.PI * radius * radius
    }
}

class SquareCabin(residents: Int, val side: Double, val floors: Int) :
    RoundHut(residents, side) {

    override val buildingMaterial = "Wood"

    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}
