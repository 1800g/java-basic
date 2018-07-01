package guice.org.demo.guicedemo.service;

public interface PaymentService {
    void pay(long orderId,long price,long sessionId);
}
