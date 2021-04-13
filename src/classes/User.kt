package classes

data class User(
    val firstName: String,
    val lastName: String,
    val password: String
) {
    fun newUser(firstName: String, lastName: String, newPassword: String) : User{
        return this.copy(firstName = firstName, lastName = lastName, password = newPassword);
    }
}
