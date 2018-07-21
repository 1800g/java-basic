package guice.org.demo.guicedemo.service.impl;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

public class CacheTest {
    @Inject PaymentServiceImpl paymentService;
    @Inject PriceServiceImpl priceService;


    @Before
    public void setUp(){
        Guice.createInjector(new ServerModule()).injectMembers(this);
    }

    @Test
    public void test(){
        paymentService.putCache("testKey","testValue");
        String cachedValue = priceService.getCachedValue("testKey");
        assertEquals("testValue",cachedValue);
    }
}
