package pl.versusdeum.ordo.model.common

sealed interface ProperSource {
    data object Unprovided : ProperSource
}
