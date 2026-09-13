//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите текст: ")
    val str = readln().uppercase()
    var str2 = ""
    for (i in str) {
        if (!str2.contains(i)) {
            str2 += i
        }
    }
    str2 = str2.toCharArray().sorted().joinToString("")
    for (i in str2) {
        var count = 0
        for (j in str) {
            if (i == j) {
                count++
            }
        }
        println("$i - $count")
    }
}