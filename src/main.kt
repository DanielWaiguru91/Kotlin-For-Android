import classes.User

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
    val secondOperator : String = "23"
    firstOperator ?: secondOperator

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
}