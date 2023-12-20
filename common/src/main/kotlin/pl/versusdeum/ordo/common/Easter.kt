package pl.versusdeum.ordo.common

import java.time.LocalDate
import java.time.Year

data class Easter(val year: Year) {
    val date: LocalDate

    init {
        val yearNumber = year.value
        val a = yearNumber % 19
        val b = yearNumber % 4
        val c = yearNumber % 7
        val k = yearNumber / 100
        val p = (13 + 8 * k) / 25
        val q = k / 4
        val m = (15 - p + k - q) % 30
        val n = (4 + k - q) % 7
        val d = (19 * a + m) % 30
        val e = (2 * b + 4 * c + 6 * d + n) % 7
        val day = 22 + d + e
        date = if (d == 28 && e == 6 && (11 * m + 11) % 30 < 19) {
            LocalDate.of(yearNumber, 4, 18)
        } else if (d == 29 && e == 6) {
            LocalDate.of(yearNumber, 4, 19)
        } else if (day > 31) {
            LocalDate.of(yearNumber, 4, day - 31)
        } else {
            LocalDate.of(yearNumber, 3, day)
        }
    }
}
