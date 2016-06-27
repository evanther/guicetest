package guicetest

import java.util.Date
import javax.inject.{Singleton, Inject}

trait SearchController {
  def search(provider: String): List[String]
}

trait BookingController {
  def book(provider: String, checkoutId: Long)
}

// Ejemplo inyeccion por constructor
@Singleton
class SearchControllerImpl @Inject() (searchService: SearchService) extends SearchController {

  println("Initialazing SearchControllerImpl")

  override def search(provider: String): List[String] = {
    println("Search Controller")
    searchService.search(provider, new Date())
  }

}

// Ejemplo inyeccion por Setter
@Singleton
class BookingControllerImpl extends BookingController {

  println("Initialazing BookingControllerImpl")

  @Inject
  var bookingService: BookingService = null

  override def book(provider: String, checkoutId: Long): Unit = {
    println("Booking Controller")
    bookingService.book(provider, checkoutId, new Date())
  }

}