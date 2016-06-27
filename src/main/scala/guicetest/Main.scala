package guicetest

import com.google.inject.Guice
import net.codingwell.scalaguice.InjectorExtensions._

object Main {
  def main(args: Array[String]) {

    val injector = Guice.createInjector(new Module)

    println("Getting searchController ref")
    val searchCtrl = injector.instance[SearchController]

    println("Getting bookingController ref")
    val bookingCtrl = injector.instance[BookingController]

    println("First search...")
    searchCtrl.search("H")

    println("Then book standar...")
    bookingCtrl.book("Standar Book", 4545454L)

    println("Then book special...")
    bookingCtrl.specialBook("Special Book", 123123L)
  }
}