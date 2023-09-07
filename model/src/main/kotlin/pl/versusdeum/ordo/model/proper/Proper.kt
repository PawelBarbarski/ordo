package pl.versusdeum.ordo.model.proper

import pl.versusdeum.ordo.model.Rite
import pl.versusdeum.ordo.model.common.*
import pl.versusdeum.ordo.model.common.LastGospel

data class Proper<T : Rite>(
    val calendar: Calendar<T>,
    val liturgicalDay: LiturgicalDay,
    val name: String,
    val patron: Patron,
    val properSource: ProperSource,
    val liturgicalClass: LiturgicalClass<T>,
    val color: Color,
    val introit: String,
    val hasGloria: Boolean,
    val hasCredo: Boolean,
    val lessonsCount: Int,
    val hasPassion: Boolean,
    val hasSuperPopulumPrayer: Boolean,
    val properSequence: String?,
    val optionalProperSequence: String?,
    val properPreface: String?,
    val optionalProperPreface: String?,
    val properCommunicantes: String?,
    val properHancIgitur: String?,
    val properDismissal: Dismissal,
    val properLastGospel: LastGospel.ProperLastGospel,
    val breviaryHourBefore: BreviaryHour,
    val hasJudicaMePsalm: Boolean,
    val notes: String?
)
