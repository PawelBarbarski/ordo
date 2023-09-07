package pl.versusdeum.ordo.model.common

import java.time.DayOfWeek

sealed interface MissalPosition : ProperSource {

    data class Sanctoral(val value: LiturgicalMonthDay, val dayPosition: DayPosition = DayPosition.ON) : MissalPosition

    data object Temporal : MissalPosition

    data class Communal(val type: CommunalType, val number: Int) : MissalPosition

    sealed interface Votive : MissalPosition {
        data class WeekdayVotive(val weekDay: DayOfWeek) : Votive
        data class EnumeratedVotive(val number: Int) : Votive
    }

    data class VariousPlaces(val day: LiturgicalMonthDay, val dayPosition: DayPosition = DayPosition.ON) :
        MissalPosition

    data class LocalPropers(
        val bookName: String,
        val day: LiturgicalMonthDay,
        val dayPosition: DayPosition = DayPosition.ON
    ) : MissalPosition

    enum class DayPosition {
        ON,
        BEFORE,
        AFTER
    }
}
