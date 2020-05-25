fun main(args: Array<String>) {
    var range: IntRange = 1..50
    for (item in range)
    {
        println(item)
    }
    /**
     * Count down to 80 jumping 5 steps each jump
     */
    val desc = 100.downTo(80) step 5
    for (d in desc){
        println(d)
    }
    val inc = 0.rangeTo(5)
    for (i in inc){
        println(i)
    }
}