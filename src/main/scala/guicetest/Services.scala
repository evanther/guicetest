package guicetest

import java.util.Date
import javax.inject.Singleton

trait SearchService {
  def search(provider: String, today: Date): List[String]
}

trait BookingService {
  def book(provider: String, checkoutId: Long, today: Date)
}

@Singleton
class SearchServiceImpl extends SearchService {

  override def search(provider: String, today: Date): List[String] = {
    println("Search Service")
    Nil
  }

}

@Singleton
class BookingServiceImpl extends BookingService {
  override def book(provider: String, checkoutId: Long, today: Date): Unit ={
    println("Booking Service")
  }
}