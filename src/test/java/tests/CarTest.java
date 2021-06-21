package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class CarTest {

    @Test
    public void carComparison(){
        Car car1 = Car.builder()
                .make("bmw")
                .model("3")
                .build();

      //  Car car2 = new Car("bmw", "5");
        Car car3 = new Car();
        car3.setMake("audi");
        car3.setModel("100");
       // Assert.assertEquals(car1, car2);  //false
    }

    @Test
    public void loggerTest(){
        log.fatal("fatal");
        log.error("error");
        log.warn("warning");
        log.info("info");
        log.debug("debug");
        log.trace("trace");
    }
}
