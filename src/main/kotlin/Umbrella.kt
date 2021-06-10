class Umbrella(val weather: IWeather) {
    fun totalPrice(quantity: Int, price: Int): Int {
        if (weather.isSunny()) {
            return (quantity * price * 0.9).toInt()
        }
        return quantity * price
    }

}
