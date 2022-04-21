val regex: Regex = Regex("""(\d) years old""")
val matchResult = regex.find("8 years old")
matchResult?.groups?.get(1)

15.0/2