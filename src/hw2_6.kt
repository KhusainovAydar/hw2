fun isAnagram(s1: String, s2: String) : Boolean {
    var str1 = readLine()!!.split(" ").joinToString("") { it.toLowerCase() }
    var str2 = readLine()!!.split(" ").joinToString("") { it.toLowerCase() }
    if (str1.length != str2.length) {
        return false
    }
    for (i in str1) {
        var cnt1: Int = 0
        var cnt2: Int = 0
        for (j in str1) {
            if (i == j) {
                cnt1++
            }
        }
        for (j in str2) {
            if (i == j) {
                cnt2++
            }
        }
        if (cnt1 != cnt2) {
            return false
        }
    }
    return true
}

fun main(args : Array<String>) {
    var str1 = readLine()!!.split(" ").joinToString("") { it.toLowerCase() }
    var str2 = readLine()!!.split(" ").joinToString("") { it.toLowerCase() }
//    if (str1.length != str2.length) {
//        return false
//    }
    for (i in str1) {
        var cnt1: Int = 0
        var cnt2: Int = 0
        for (j in str1) {
            if (i == j) {
                cnt1++
            }
        }
        for (j in str2) {
            if (i == j) {
                cnt2++
            }
        }
        if (cnt1 != cnt2) {
            println("No")
        }
    }
    println("Yes")
}