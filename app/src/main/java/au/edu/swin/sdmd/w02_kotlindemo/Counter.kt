package au.edu.swin.sdmd.w02_kotlindemo

fun main(args: Array<String>) {
    val c = Counter("counterZero")
    val c1 = Counter("counterOne")

    val counters = listOf(c, c1, c)
    printCounters(counters)

    for (x in 1..4) {
        counters[1].increment()
    }
    printCounters(counters)

    for (x in 1 until 7) {
        counters[0].increment()
    }
    printCounters(counters)


}

fun printCounters(counters: List<Counter>) {
    for (c in counters) {
        println("${c.name} is ${c.count}")
    }
    println("------")
}

class Counter(val name: String) {
    var count = 0

    fun increment() {
        count += 1
    }
}