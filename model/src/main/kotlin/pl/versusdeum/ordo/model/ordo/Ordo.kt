package pl.versusdeum.ordo.model.ordo

import pl.versusdeum.ordo.model.Rite
import pl.versusdeum.ordo.model.common.*
import java.time.LocalDate

data class Ordo<T : Rite>(
    val date: LocalDate,
    val name: String,
    val patron: Patron,
    val missalPosition: MissalPosition,
    val liturgicalClass: LiturgicalClass<T>,
    val color: Color,
    val introit: String,
    val sayGloria: Boolean,
    val sayCredo: Boolean,
    val lessonsCount: Int,
    val sayPassion: Boolean,
    val additionalPrayers: List<AdditionalPrayer>,
    val saySuperPopulumPrayer: Boolean,
    val sequence: String?,
    val optionalSequence: String?,
    val preface: String,
    val optionalPreface: String?,
    val communicantes: String,
    val hancIgitur: String,
    val dismissal: Dismissal,
    val lastGospel: LastGospel,
    val breviaryHourBefore: BreviaryHour,
    val sayJudicaMePsalm: Boolean,
    val beforeGospelText: BeforeGospelText,
    val notes: String?
)
