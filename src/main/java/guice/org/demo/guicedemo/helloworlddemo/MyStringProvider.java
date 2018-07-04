package guice.org.demo.guicedemo.helloworlddemo;

import com.google.inject.Provider;

public class MyStringProvider implements Provider<String> {
    @Override
    public String get() {
        return "Hello World!";
    }
}
