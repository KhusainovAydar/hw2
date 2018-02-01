fun main (args : Array<String>) {
    var array = readLine()!!.split(" ").map{ it.toDouble() }.toTypedArray()
    var sum: Double = 0.0
    var cnt: Int = 0
    var median: Double = 0.0

    array.sort()

    for (i in array) {
        sum += i.toDouble()
        cnt += 1
    }

    if (cnt % 2 == 0) {
        median = array[cnt / 2].toDouble() + array[cnt / 2 - 1].toDouble()
        median /= 2
    } else {
        median = array[cnt / 2].toDouble()
    }

    sum /= cnt.toDouble()
    println(sum.toString() + " " + median.toString())
}