package guicetest

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule


class Module extends AbstractModule with ScalaModule {

  override def configure(): Unit = {
    bind[SearchController].to[SearchControllerImpl].asEagerSingleton()
    bind[BookingController].to[BookingControllerImpl].asEagerSingleton()
    bind[SearchService].to[SearchServiceImpl].asEagerSingleton()
    bind[BookingService].to[BookingServiceImpl].asEagerSingleton()
  }

}

