open class Person{
    open val name = "Danny"
    open fun aboutMe(){
        println("I am a fullstack developer")
    }
}
class friend : Person(){
    override
    val name = "Alec"
    override
    fun aboutMe(){
        println("He is a DevOps engineer")
    }
}
fun main(args: Array<String>){

}