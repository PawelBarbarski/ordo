package pl.versusdeum.ordo.model.common

import pl.versusdeum.ordo.model.Rite

enum class DivinoAfflatuClass : LiturgicalClass<Rite.DivinoAfflatu> {
    DUPLEX_1_CLASSIS,
    DUPLEX_2_CLASSIS,
    DUPLEX_MAJOR,
    DUPLEX_MINOR,
    SEMIDUPLEX,
    SIMPLEX,
    DOMINICA_1_CLASSIS,
    DOMINICA_2_CLASSIS,
    DOMINICA_MINOR,
    FERIA_PRIVILEGIATA,
    FERIA
}
