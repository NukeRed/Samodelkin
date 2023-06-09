package com.derkun.samodelkin

private fun <T> List<T>.rand() = shuffled().first()

private fun Int.roll() = (0 until this).map {
    (1..6).toList().rand()
}
    .sum()
    .toString()

private val firstName = listOf("Alex", "Elena", "Sophia", "Sindo", "Abrul")
private val lastName = listOf("GreatLength", "Washsiss", "Goosmooz", "Trapfield")


object CharacterGeneratorVersion {
    data class CharacterDataVersion(
        val name: String,
        val race: String,
        val dex: String,
        val wis: String,
        val str: String
    )

    private fun name() = "${firstName.rand()} ${lastName.rand()}"

    private fun race(): String = listOf(
        "dwarf", "elf", "human", "halfing", "ork", "troll", "demon", "seaman",
        "mutant", "elemental", "artificial creature", "creature", "nature", "demon", "undead",
        "chimera", "dream", "horror", "dead", "green", "red", "blue",
    ).rand()

    private fun dex() = 4.roll()

    private fun wis() = 3.roll()

    private fun str() = 5.roll()

    fun generate() = CharacterDataVersion(
        name = name(),
        race = race(),
        dex = dex(),
        wis = wis(),
        str = str()
    )
}