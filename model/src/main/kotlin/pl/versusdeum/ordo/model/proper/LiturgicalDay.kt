package pl.versusdeum.ordo.model.proper

import pl.versusdeum.ordo.model.common.LiturgicalMonthDay
import java.time.DayOfWeek

sealed interface LiturgicalDay {
    data class FixedDay(val value: LiturgicalMonthDay) : LiturgicalDay

    data class MovableDay(
        val baseDay: BaseDay,
        val sundaysAway: Int,
        val dayOfWeek: DayOfWeek
    ) : LiturgicalDay

    data class RelativeDay(
        val baseDate: LiturgicalMonthDay,
        val dayOfWeek: DayOfWeek
    ) : LiturgicalDay

    sealed interface ComplexDay : LiturgicalDay {
        data object SundayBetween1And6JanuaryOr2January : ComplexDay
    }

    enum class BaseDay {
        EASTER,
        FIRST_SUNDAY_OF_ADVENT
    }
}
