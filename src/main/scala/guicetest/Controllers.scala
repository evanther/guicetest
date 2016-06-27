package guicetest

import java.util.Date
import javax.inject.{Inject, Named, Singleton}

trait SearchController {
  def search(provider: String): List[String]
}

trait BookingController {
  def book(provider: String, checkoutId: Long)
  def specialBook(provider: String, checkoutId: Long)
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

  @Inject
  @Named("special")
  var specialBookingService: BookingService = null

  override def book(provider: String, checkoutId: Long): Unit = {
    println("Booking Controller")
    bookingService.book(provider, checkoutId, new Date())
  }

  override def specialBook(provider: String, checkoutId: Long): Unit = {
    println("Special Booking Controller")
    specialBookingService.book(provider, checkoutId, new Date())
  }

}