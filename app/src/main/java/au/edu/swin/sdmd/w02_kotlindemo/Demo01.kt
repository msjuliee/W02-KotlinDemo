package au.edu.swin.sdmd.w02_kotlindemo

// Inspired by Nate Ebel's Mastering Kotlin (2019)
// https://www.packtpub.com/au/application-development/mastering-kotlin

fun main() {
    greetStudent( "Hello", "mate")
}


fun greetStudent(greeting: String = "Welcome", name: String?) {
    println("$greeting ${formatName(name)}")
}


fun formatName(name: String?) = name ?: "random student"