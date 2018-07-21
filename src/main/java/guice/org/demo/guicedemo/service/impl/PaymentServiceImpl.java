package guice.org.demo.guicedemo.service.impl;

import com.google.common.cache.Cache;
import guice.org.demo.guicedemo.service.PaymentService;

import javax.inject.Inject;

public class PaymentServiceImpl implements PaymentService {
    private final Cache<String,String> cache;

    @Inject
    public PaymentServiceImpl(Cache<String, String> cache) {
        this.cache = cache;
    }

    @Override @Logged
    public void pay(long orderId, long price, long sessionId) {

    }

    void  putCache(String key,String value){
        cache.put(key,value);
    }
}
