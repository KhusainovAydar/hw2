fun findSubstrings(text: String, substring: String) : MutableList<Int> {
    var answer: MutableList<Int> = mutableListOf()
    var helpval = -1
    for (i in text.indices) {
        if (helpval >= i)
            continue
        if (i + substring.length - 1 >= text.length) {
            break
        }
        if (text.substring(i, i + substring.length).equals(substring)) {
            helpval = i + substring.length - 1
            answer.add(i.toInt())
        }
    }
    return answer
}

fun main(args: Array<String>) {
    var list = readLine()!!.split(" ").toTypedArray()
    var ans = findSubstrings(list[0], list[1])
    println("KEK")
    println(ans.joinToString(" "))
}