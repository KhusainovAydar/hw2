var ncnt = 0

fun permutation(str: String, n : Int) {
    permutation("", str, n)
}

private fun permutation(prefix: String, str: String, cnt : Int) {
    val n = str.length
    if (n == 0) {
        if (cnt == ncnt) {
            println(prefix)
        }
        ncnt++
    }
    else {
        var ncnt = cnt + 1
        for (i in 0 until n)
            permutation(prefix + str[i], str.substring(0, i) + str.substring(i + 1, n), cnt)
    }
}

fun main(args : Array<String>) {
    permutation("0123456789", readLine()!!.toInt())
}