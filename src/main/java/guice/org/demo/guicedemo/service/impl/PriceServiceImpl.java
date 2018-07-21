package guice.org.demo.guicedemo.service.impl;

import com.google.common.cache.Cache;
import guice.org.demo.guicedemo.service.PriceService;

import javax.inject.Inject;
import java.util.Set;

public class PriceServiceImpl implements PriceService {
    private final Set<String> supportedCurrencies;
    private final Cache<String,String> cache;


    @Inject
    public PriceServiceImpl(Set<String> supportedCurrencies,Cache<String,String> cache) {
        this.supportedCurrencies = supportedCurrencies;
        this.cache = cache;
    }

    @Override
    public long getPrice(long orderId) {
        return 456L;
    }

    @Override
    public Set<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    String getCachedValue(String key){
        return cache.getIfPresent(key);
    }
}
