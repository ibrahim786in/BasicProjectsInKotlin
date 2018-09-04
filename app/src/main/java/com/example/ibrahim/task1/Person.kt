package com.example.ibrahim.task1

interface Person {
    val name: String
    val age: Int
    val email: String
    val phone: Int
    fun hasResposibilities(): Boolean
}

data class Adult(override val name: String, override val age: Int, override val email: String, override val phone: Int) : Person {
    val isMarried: Boolean = false
    val hasKids: Boolean = false
    override fun hasResposibilities(): Boolean = true

}

data class Child(override val name: String, override val age: Int, override val email: String="", override val phone: Int) : Person {
    override fun hasResposibilities(): Boolean = false

}
