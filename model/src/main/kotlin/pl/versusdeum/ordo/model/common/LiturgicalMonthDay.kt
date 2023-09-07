package pl.versusdeum.ordo.model.common

import java.time.MonthDay

data class LiturgicalMonthDay(
    private val monthDayAtNonLeapYear: MonthDay,
    private val monthDayAtLeapYear: MonthDay = monthDayAtNonLeapYear
)
