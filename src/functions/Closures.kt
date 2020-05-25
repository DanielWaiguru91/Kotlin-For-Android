package functions

class Student(var firstName: String, var age: Int){
    fun student(firstName: String, age: Int, function: () -> Unit){
        this.firstName = firstName
        this.age = age
        fun matchStudent(ageLimit: Int) {
            return student(firstName, age){
                if (this.age <= 18){
                    
                }
            }
        }
    }
}