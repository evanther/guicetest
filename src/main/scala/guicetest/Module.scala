package guicetest

import com.google.inject.{Guice, AbstractModule}
import net.codingwell.scalaguice.ScalaModule
import net.codingwell.scalaguice.InjectorExtensions._

class Module extends AbstractModule with ScalaModule {

  override def configure(): Unit = {

    bind[SearchController].to[SearchControllerImpl]
    bind[BookingController].to[BookingControllerImpl]
    bind[SearchService].to[SearchServiceImpl]
    bind[BookingService].to[BookingServiceImpl]

  }

}

object Main {
  def main(args: Array[String]) {

    val injector = Guice.createInjector(new Module)

    val controller = injector.instance[SearchController]

    controller.search("H")

  }
}