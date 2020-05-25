fun main(args: Array<String>){
    val languages = arrayOf("Kotlin", "Java", "JavaScript", "C#")
    for (language in languages){
        println(language)
    }
    println(languages.size)
    val squares = Array(10) { k -> k * k}
    for (square in squares){
        println(square)
    }
}