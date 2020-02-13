# Kotlin-For-Android
learning android apps development with kotlin

Kotlin is a modern statically typed android compatible language 
## Features of Kotlin
* Being a statically typed language kotlin offers nullability safety features causing our program to fail at compile time rather than crashing during runtime.
  ![Crash at Runtime](C:\Users\DanielWaiguru\OneDrive\Documents\Screenshot_20200213-093757.png "prgram crash)
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
