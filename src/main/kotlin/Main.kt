fun main() {
    val weather: IWeather = Weather()
    val umbrella = Umbrella(weather)
    val totalPrice = umbrella.totalPrice(3, 100)
    println(totalPrice)
}