fun main(args: Array<String>){
    val sum:(Int, Int) -> Int = {a, b -> a+b}
    println(sum(3, 1))

    /**
     * Returning from a lambda
     */
    val getGrade = {grade: Int ->
        when(grade){
            in 0..39 -> "E"
            in 40..49 -> "D"
            in 50..59 -> "C"
            in 60 ..69 -> "B"
            in 70..100 -> "A"
            else -> "Invalid Grade"
        }
    }
    println(getGrade(60))
}