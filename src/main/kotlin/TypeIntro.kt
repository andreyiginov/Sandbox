const val MAX_EXPERIENCE: Int = 5000

fun main(args: Array<String>) {
    val playerName = "Estragon"
    var experiencePoints = 5
    experiencePoints += 5
    var hasSteed = false
    val tavernName = "Unicorn Horn"
    val theInnkeeper = "Svetozar"
    var wallet = 50
    var menu = mutableListOf("Honey", "Wine")

    val reversedName = playerName.reversed()

    println(experiencePoints)
    println(playerName)
    println(reversedName)
    println(hasSteed)
    println(tavernName)
    println(theInnkeeper)
    println(wallet)
    println(menu.isEmpty())
    println(menu)
    menu.add("Beer")
    println(menu)
}