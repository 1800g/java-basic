package guice.org.demo.guicedemo.service.impl;

import com.google.common.base.Joiner;
import com.google.common.cache.Cache;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;
import guice.org.demo.guicedemo.service.OrderService;
import guice.org.demo.guicedemo.service.PaymentService;
import guice.org.demo.guicedemo.service.PriceService;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import javax.inject.Named;
import javax.inject.Singleton;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ServerModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new ChinaModule());
        install(new GlobalModule());
        bind(OrderService.class).to(OrderServiceImpl.class);
        bind(PaymentService.class).to(PaymentServiceImpl.class);
        bind(PriceService.class).to(PriceServiceImpl.class);

        bind(new TypeLiteral<Cache<String,String>>(){}).to(GuiceDemoCache.class)/*.in(Singleton.class)*/;
        LoggingInterceptor loggingInterceptor = new LoggingInterceptor();
        requestInjection(loggingInterceptor);
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(Logged.class), loggingInterceptor);
/*      值会相同，拿的值是运行到当前语句生成的值
        bind(Long.class).annotatedWith(SessionId.class).toInstance(System.currentTimeMillis());
        bind(Long.class).annotatedWith(Names.named("appId")).toInstance(456L);*/
        //泛型绑定
/*        bind(new TypeLiteral<List<String>>(){})
                .annotatedWith(Names.named("supportCurrencies"))
                .toInstance(Arrays.asList("CNY","EUR","USD"));*/
    }

    @Provides @SessionId Long generateSessionId(){
        return  System.currentTimeMillis();
    }

    @Provides
    @Named("supportCurrencies")
    Set<String> getSupportedCurrencies(PriceService priceService){
        return priceService.getSupportedCurrencies();
    }

/*    @Provides @Singleton Cache<String,String> getCache(){
        return new GuiceDemoCache();
    }*/
}
