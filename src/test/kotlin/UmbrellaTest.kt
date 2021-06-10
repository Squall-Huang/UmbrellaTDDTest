import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class UmbrellaTest {
    @Test
    fun totalPrice() {
        val stubWeather = mockk<IWeather>()
        every { stubWeather.isSunny() } returns false
        val umbrella = Umbrella(stubWeather)
        val totalPrice = umbrella.totalPrice(3, 100)
        Assertions.assertEquals(300,totalPrice)
    }

    @Test
    fun totalPrice_sunny() {
        val stubWeather = mockk<IWeather>()
        every { stubWeather.isSunny() } returns true
        val umbrella = Umbrella(stubWeather)
        val totalPrice = umbrella.totalPrice(3, 100)
        Assertions.assertEquals(270,totalPrice)
    }
}