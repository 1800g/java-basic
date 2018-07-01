package guice.org.demo.guicedemo.service.impl;

import guice.org.demo.guicedemo.service.OrderService;
import guice.org.demo.guicedemo.service.PaymentService;
import guice.org.demo.guicedemo.service.PriceService;

import javax.inject.Inject;
import javax.inject.Provider;

public class OrderServiceImpl implements OrderService {
    private final Provider<PriceService> priceServiceProvider;
    //@Inject private PaymentService paymentService;
    private final PaymentService paymentService;
    private final SessionManager sessionManager;

    private Long ordersPaid = 0L;

    @Inject
    public OrderServiceImpl(Provider<PriceService> priceServiceProvider, PaymentService paymentService, SessionManager sessionManager) {
        this.priceServiceProvider = priceServiceProvider;
        this.paymentService = paymentService;
        this.sessionManager = sessionManager;
    }

    @Override
    public void sendToPayment(long orderId){
        //TODO:send to payment
        long price = priceServiceProvider.get().getPrice(orderId);
        paymentService.pay(orderId,price,sessionManager.getSessionId());
        ordersPaid = ordersPaid + 1;
        throw new RuntimeException("Price="+price
                +". SessionId="+sessionManager.getSessionId()
                +". ordersPaid="+ ordersPaid);
    }
}
