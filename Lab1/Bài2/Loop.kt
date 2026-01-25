fun main(){
    val myList = listOf("a", "b", "c")

    for (element in myList){
        println(element)
    }
    var index = 0
    while (index < myList.size) {
        println(myList[index])
        index++
    }
}
