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

  println("Initialazing SearchServiceImpl")

  override def search(provider: String, today: Date): List[String] = {
    println(s"Search Service -> Date: $today")
    Nil
  }

}

@Singleton
class BookingServiceImpl extends BookingService {

  println("Initialazing BookingServiceImpl")

  override def book(provider: String, checkoutId: Long, today: Date): Unit ={
    println(s"Booking Service -> CheckoutId: $checkoutId")
  }
}