package pl.versusdeum.ordo.model.proper

sealed interface CalendarScope {
    data object General : CalendarScope

    data class Local(val name: String, val level: LocalCalendarLevel) : CalendarScope
}
