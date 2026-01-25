object DataProviderManager {
    fun getData(): String {
        return "Data loaded"
    }
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun main() {

    try {
        val data = DataProviderManager.getData()
        println(data)
    } catch (exception: Exception) {
        println("Error occurred")
    }

    val direction = Direction.NORTH

    when (direction) {
        Direction.NORTH -> {
            println("Going North")
        }
        Direction.SOUTH -> {
            println("Going South")
        }
        Direction.WEST -> {
            println("Going West")
        }
        Direction.EAST -> {
            println("Going East")
        }
    }
}
