package guicetest

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule


class Module extends AbstractModule with ScalaModule {

  override def configure(): Unit = {
    bind[SearchController].to[SearchControllerImpl]
    bind[BookingController].to[BookingControllerImpl]
    bind[SearchService].to[SearchServiceImpl]
    bind[BookingService].to[BookingServiceImpl]
  }

}

