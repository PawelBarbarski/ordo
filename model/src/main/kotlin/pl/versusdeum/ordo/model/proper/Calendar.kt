package pl.versusdeum.ordo.model.proper

import pl.versusdeum.ordo.model.Rite
import java.time.Year

data class Calendar<T : Rite>(
    val baseYear: Year,
    val extensionYear: Year,
    val rite: T,
    val scope: CalendarScope
)
