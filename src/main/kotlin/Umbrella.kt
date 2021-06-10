class Umbrella(private val weather: IWeather) {
    fun totalPrice(quantity: Int, price: Int): Int {
        val totalPrice = quantity * price
        if (weather.isSunny()) {
            return (totalPrice * 0.9).toInt()
        }
        return totalPrice
    }

}
