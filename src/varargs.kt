fun main(args: Array<String>) {
    fun multiprint(vararg strings: String){
        for (string in strings){
            println(string)
        }
    }
    multiprint("a", "b", "c", "d")

    /**
     * varargs with prefix and suffix
     */
    fun multiPrint(prefix: String, vararg str: String, suffix: String){
        println(prefix)
        for (st in str)
            println(st)
        println(suffix)

    }
    multiPrint("starting", "a", "b", "c", "d", "e", suffix = "end")
    /**
     * pass array as values to vararg variable using spread operator
     */
    val arr = arrayOf("dan", "eric", "mary", "virg")
    multiPrint("Start list", *arr, suffix = "end of names list")
}