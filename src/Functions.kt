/*class Utility{
    //infix functions = functions woth a single parameter
    infix fun String.onto(other: String) = Pair(this, other)
}*/
fun main(args: Array<String>){
    fun getFullName(firstName: String, lastName: String): String{
        return "$firstName $lastName"
    }
    println(getFullName("Danny", "Waiguru"))
    val fullName = getFullName(firstName = "Danny", lastName = "Irungu")
    println(fullName)
    infix fun String.onto(other: String) = Pair(this, other)
    val blueShoes = "blue" onto ("shoes")
    println(blueShoes)
    infix fun Int.onto(a: Int) = this + a
    val sum = 3.onto(3)
    println(sum)
    //functions with varargs parameters
    fun varargExample(vararg names: Int){
        println("Argument has ${names.size} elements")
    }
    println(varargExample(1, 2, 3, 5, 6, 9))
    /**
     * explicitly unpacking varargs functions
     */
    fun <Int> asList(vararg values: Int): List<Int>{
        val result = ArrayList<Int>()
        for (t in values){
            result.add(t)
        }
        return result
    }
    val a = arrayOf(2, 4, 6, 7, 8,8, 78, 89)
    val list = asList(5, 7, 0, *a)
    println(list)
    /**
     * higher oder functions =
     * function with function or function that returns a fun
     */
    fun add(a: Int, b: Int): Int{
        return a + b
    }
    fun returnAddFunction():((Int, Int) ->Int){
        return ::add
    }
    val b = add(2, 3)
//    println(returnAddFunction())

    /**
     * Extension functions = member function of a class that is defined outside the class
     */
    fun String.removeFirstLastChar(): String =
        this.substring(1)

    println("kotlin" .removeFirstLastChar())
}
