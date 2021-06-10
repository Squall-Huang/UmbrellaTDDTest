import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UmbrellaTest {
    @Test
    fun totalPrice() {
        val umbrella = Umbrella()
        val totalPrice = umbrella.totalPrice(3, 100)
        Assertions.assertEquals(300,totalPrice)
    }
}