import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

fun main(args: Array<String>) {

   /* *//**
     * a function to read a file
     *//*
    fun readFile(){
        val file = Files.newInputStream(Paths.get("/input.txt"))
        try {
            var readText = file.read()
            while (readText != -1){
                print(readText)
                readText = file.read()
            }
        }
        catch (e: IOException){
            println("Error ${e.message} while reading the file")
        }
        finally {
            file.close()
        }
    }
    //val path = Path("./files.input.txt")
    //println(readFile())*/
    fun smartCast(any: Any){
        if (any is String){
            println(any.length)
        }
    }
    println(smartCast("Daniel"))
}