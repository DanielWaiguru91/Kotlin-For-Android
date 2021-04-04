# Kotlin-For-Android
learning android apps development with kotlin

Kotlin is a modern statically typed android compatible language 
## Features of Kotlin
* Being a statically typed language kotlin offers nullability safety features causing our program to fail at compile time rather than crashing during runtime.
  ![Crash at Runtime](C:\Users\DanielWaiguru\OneDrive\Documents\Screenshot_20200213-093757.png "prgram crash")
* Kotlin is 100% interoperable with java
* Kotlin can be used in many platform eg Mobile development, server side development(backend) and even build systems such as gradle
for more kotlin features refer to kotlin [Official Documentation](https://kotlinlang.org/docs/reference/android-overview.html)

### Here are some awesome code snippets of kotlin features in find very interesting
##### kotlin compiler deduces an adequate type for a variable
```kotlin
var name = "Daniel"
    name = 3 // Error because inferred name type is String
```
##### use of string template
```kotlin
var String: name = "Daniel"
println("My name is ${name}") // output: My name is Daniel
```
##### declaring nullable variables
```kotlin
var myAge: Int? = 20
myAge = null 
println(myAge) //output null
```
##### kotlin extensions
Extentions in kotlin enables us to define custom classes, Android Framework Classes or even third party libraries.
Here is an example where we can add loadImage extension to load images using Picasso(an image loading libarry for Android) to ImageView
```kotlin
fun ImageView.loadUrl(url: String)
{
  Picasso.with(context).load(url).into(this)
}
//usage
ImageView.loadUrl("<path to the image>")
```
To follow along install [IntelliJ IDE](https://www.jetbrains.com/idea/download/#section=windows)
### Kotlin under the hood
>Note that kotlin can be compiled to multiple platforms but in this article we will focus nmainly on Android

    *.kt - > kotlin compiler - > *.class plus kotlin standard library - >*.dex - > app.apk
  
When kotlin and java are used in the same Android project both(kotlin and java compiler) are used to compile the application and the results merged  at the class level.
