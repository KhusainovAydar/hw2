fun sortLists(inputList: List<String>): MutableList<MutableList<String>> {
    val list = inputList.groupBy { it -> it[0] }.toSortedMap().toList().toMutableList().map { ((it.second).toMutableList()) }
    return (list.map { it.sorted() }.map { it.toMutableList() }).toMutableList()
}

fun main(args: Array<String>) {
    var list = sortLists(readLine()!!.split(" "))
    print(list.map { it -> it.joinToString(" ") }.joinToString("\n"))
}