package guice.org.demo.guicedemo.service.impl;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.google.inject.util.Modules;
import guice.org.demo.guicedemo.service.OrderService;
import guice.org.demo.guicedemo.service.PriceService;
import guice.org.demo.guicedemo.service.impl.ServerModule;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import javax.inject.Named;
import java.util.List;
import java.util.Set;

/**
 * OrderServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>07/01/2018</pre>
 */

class PriceServiceMock extends PriceServiceImpl {

    @Inject
    public PriceServiceMock(Set<String> supportedCurrencies) {
        super(supportedCurrencies);
    }

    @Override
    public long getPrice(long orderId) {
        return 567L;
    }
}

public class OrderServiceTest {
    @Inject
    private OrderService orderService;
    @Inject
    private PriceService priceService;

    @Before
    public void setUp() {
        Guice.createInjector(Modules.override(new ServerModule()).with(new AbstractModule() {
            @Override
            protected void configure() {
                bind(PriceService.class).to(PriceServiceMock.class);
            }
        })).injectMembers(this);
    }

    @Test
    public void testSendToPayment() {
        orderService.sendToPayment(789L);
    }

    @Test
    public void testSupportedCurrencies() {
        throw new RuntimeException(priceService.getSupportedCurrencies().toString());
    }
} 
