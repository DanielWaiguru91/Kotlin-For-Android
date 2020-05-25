fun main(args: Array<String>) {
    var firstWord = "Learn "
    var secondWord = "Kotlin"
    var bothWords = "$firstWord" +
            "$secondWord"
    println("$bothWords has" +
            "${bothWords.length}")
    println(""""$bothWords" has
        ${bothWords.length}
    """)
}