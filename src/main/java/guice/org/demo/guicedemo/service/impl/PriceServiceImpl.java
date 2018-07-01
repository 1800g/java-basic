package guice.org.demo.guicedemo.service.impl;

import guice.org.demo.guicedemo.service.PriceService;

import javax.inject.Inject;
import java.util.Set;

public class PriceServiceImpl implements PriceService {
    private final Set<String> supportedCurrencies;

    @Inject
    public PriceServiceImpl(Set<String> supportedCurrencies) {
        this.supportedCurrencies = supportedCurrencies;
    }

    @Override
    public long getPrice(long orderId) {
        return 456L;
    }

    @Override
    public Set<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }
}
