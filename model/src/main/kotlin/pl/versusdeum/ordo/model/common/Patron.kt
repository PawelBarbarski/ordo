package pl.versusdeum.ordo.model.common

sealed interface Patron {
    data object OurLord : Patron

    data object OurLady : Patron

    data class Saint(val name: String) : Patron
}
