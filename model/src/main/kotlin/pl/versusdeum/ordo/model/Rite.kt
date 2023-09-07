package pl.versusdeum.ordo.model

sealed interface Rite {
    data object DivinoAfflatu : Rite
    data object RubricarumInstructum : Rite
}