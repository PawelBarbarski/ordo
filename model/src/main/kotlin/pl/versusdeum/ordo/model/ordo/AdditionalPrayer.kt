package pl.versusdeum.ordo.model.ordo

import pl.versusdeum.ordo.model.common.MissalPosition
import pl.versusdeum.ordo.model.common.Patron

data class AdditionalPrayer(
    val name: String,
    val patron: Patron,
    val missalPosition: MissalPosition,
    val conclusion: Conclusion,
    val prayerNumber: Int,
    val isReadOnly: Boolean
)
