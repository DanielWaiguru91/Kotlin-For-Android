import classes.User
import java.util.*

fun main() {
    /**
     * Kotlin Variables:
    There are two ways we can declare variables in kotlin
    1. using val keyboard to declare variables that can not be reassigned new values once initialized
    2. using var keyword to declare variables whose values can change
     */
    val name : String = "Daniel"
    //name = "john" prints error

    var my : Int? = 20
    my = null
    println(my) //prints null
    /**
     * Elvis operator:returns first operand if it is not null else the second operator will be returned
     */
    val firstOperator : String? = null
    val secondOperator = "23"
    //Thread safe null check
    firstOperator?.let {
        println(it)
    } ?: run {
        println("Firs operator is null")
    }

    /**
     * null Not null assertion operator: explicitly casts nullable variables to non-nullable variables
     */
    val lang : String? = "Kotlin"
    var size : Int = lang!!.length
    /**
     * Data classes
     */
    val user = User("Daniel", "Waiguru", "password")
    val newUser = user.newUser("Daniel", "Waiguru", "newPassword")
    println(user)
    println(newUser)
    println(user.component1())
    println(user.component2())
    println(user.component3())
    println(user.toString())
    /**
     * Extensions functions
     */
    val fullName = "Daniel".joinTo("Waiguru")
    "Daniel" joinTo "Waiguru"
    println(fullName)
    println("lol".isPalindrome())
    println("yes".isPalindrome())
    println("Daniel Waiguru".toLowerCase().replace("\\s".toRegex(), ""))
    println(decodeCharacters("Ik5ldmVyIHRydXN0IGEgY29tcHV0ZXIgeW91IGNhbid0IHRocm93IG91dCBhIHdpbmRvdyIgLSBTdGV2ZSBXb3puaWFr"))

    /**
     * Kotlin ranges
     */
    for (i in 0..5) {
        println(i) //Inclusive
    }

    for (i in 0 until 5) {
        println(i) // 5 is excluded
    }
    for (i in 5 downTo 0) {
        println(i)
    }
    /**
     * Quick filling of lists
     */
    val list1 = DoubleArray(5) { 1.5 }.toList()
    println(list1)
    val list2 = (0..5).toList()
    println(list2)
}
infix fun String.joinTo(secondName: String): String  = "$this $secondName"

//Check if a string is palindrome using extensions functions
fun String.isPalindrome() = this == reversed()

fun decodeCharacters(encodedStr: String): String {
    val decodedBytes = Base64.getDecoder().decode(encodedStr)
    return String(decodedBytes)
}