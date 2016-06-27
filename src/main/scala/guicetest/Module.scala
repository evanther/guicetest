package guicetest

import com.google.inject.AbstractModule
import com.google.inject.name.Names
import net.codingwell.scalaguice.ScalaModule


class Module extends AbstractModule with ScalaModule {

  override def configure(): Unit = {
    bind[SearchController].to[SearchControllerImpl].asEagerSingleton()
    bind[BookingController].to[BookingControllerImpl].asEagerSingleton()
    bind[SearchService].to[SearchServiceImpl].asEagerSingleton()
    bind[BookingService].to[BookingServiceImpl].asEagerSingleton()
    bind[BookingService].annotatedWith(Names.named("special")).to[SpecialBookingServiceImpl].asEagerSingleton()
  }

}

