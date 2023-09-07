package pl.versusdeum.ordo.model

import pl.versusdeum.ordo.model.common.*
import pl.versusdeum.ordo.model.ordo.BeforeGospelText
import pl.versusdeum.ordo.model.ordo.Ordo
import pl.versusdeum.ordo.model.proper.Calendar
import pl.versusdeum.ordo.model.proper.CalendarScope
import pl.versusdeum.ordo.model.proper.LiturgicalDay
import pl.versusdeum.ordo.model.proper.Proper
import java.time.LocalDate
import java.time.MonthDay
import java.time.Year

val properExample = Proper(
    Calendar(
        Year.of(1954),
        Year.of(2023),
        Rite.DivinoAfflatu,
        CalendarScope.General
    ),
    LiturgicalDay.FixedDay(LiturgicalMonthDay(MonthDay.of(9, 8))),
    "Nativitatis BMV",
    Patron.OurLady,
    MissalPosition.Sanctoral(LiturgicalMonthDay(MonthDay.of(9, 8)), MissalPosition.DayPosition.ON),
    DivinoAfflatuClass.DUPLEX_MAJOR,
    Color.WHITE,
    "Salve, sancta Parens",
    true,
    true,
    1,
    false,
    false,
    null,
    null,
    "de BMV",
    null,
    null,
    null,
    Dismissal.ITE_MISSA_EST,
    LastGospel.ProperLastGospel.InPrincipio,
    BreviaryHour.TERCE,
    true,
    null
)

val ordoExample = Ordo(
    LocalDate.of(2023, 9, 8),
    "Nativitatis BMV",
    Patron.OurLady,
    MissalPosition.Sanctoral(LiturgicalMonthDay(MonthDay.of(9, 8)), MissalPosition.DayPosition.ON),
    DivinoAfflatuClass.DUPLEX_MAJOR,
    Color.WHITE,
    "Salve, sancta Parens",
    true,
    true,
    1,
    false,
    listOf(),
    false,
    null,
    null,
    "de BMV",
    null,
    "per Annum",
    "per Annum",
    Dismissal.ITE_MISSA_EST,
    LastGospel.ProperLastGospel.InPrincipio,
    BreviaryHour.TERCE,
    true,
    BeforeGospelText.GRADUAL_ALLELUJA,
    null
)
