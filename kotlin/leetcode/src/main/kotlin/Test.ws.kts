fun abbrevName(name:String): String {
    return name.split(" ").map {it -> it[0].uppercaseChar() }.joinToString(".")
}
println(abbrevName("Harry Truman"))




