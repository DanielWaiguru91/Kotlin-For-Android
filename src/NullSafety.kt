fun main(args: Array<String>){
    var myName: String? = "Daniel "
    if (myName != null && myName.isNotEmpty()){
        println("Length of my name is ${myName.length}")
    }
    else{
        println("Empty string")
    }

    val platform: String? = "kt"
    val language = "Kotlin"
    println(platform?.length) //safe call
    println(language.length)

    val lengthOfWord: Int? = platform?.length

    val numOfLetters: Int? = lengthOfWord as? Int //safe cast
    println(numOfLetters)

    var name: String? = "null"
    val lengthOfMyName = name?.length ?: 2
    println(lengthOfMyName)
}