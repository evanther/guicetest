package guicetest

import com.google.inject.Guice
import net.codingwell.scalaguice.InjectorExtensions._

object Main {
  def main(args: Array[String]) {

    val injector = Guice.createInjector(new Module)

    val searchCtrl = injector.instance[SearchController]
    val bookingCtrl = injector.instance[BookingController]

    println("First search...")
    searchCtrl.search("H")

    println("Then book...")
    bookingCtrl.book("PEPE", 4545454L)

  }
}