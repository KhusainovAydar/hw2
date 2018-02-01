fun main (args : Array<String>) {
    var array = readLine()!!.split(" ").toTypedArray()
    var answer = array.distinct()
    println(answer.joinToString(" "))
}