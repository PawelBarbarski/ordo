package pl.versusdeum.ordo.model.common

sealed interface LastGospel {
    sealed interface ProperLastGospel : LastGospel {
        data object InPrincipio : ProperLastGospel
        data object EpiphanyInChristmas : ProperLastGospel
        data object PalmSundayProcession : ProperLastGospel
    }

    data class CommemoratedGospel(
        val name: String,
        val patron: Patron,
        val missalPosition: MissalPosition
    ) : LastGospel
}
