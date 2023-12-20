package pl.versusdeum.ordo.common

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import java.time.LocalDate
import java.time.Year

class EasterTest {
    @ParameterizedTest
    @CsvFileSource(resources = ["/EasterDates.csv"])
    fun easters500Years(easterDate: LocalDate) {
        assertEquals(easterDate, Easter(Year.of(easterDate.year)).date)
    }
}
