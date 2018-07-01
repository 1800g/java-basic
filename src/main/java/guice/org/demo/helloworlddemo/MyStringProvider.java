package guice.org.demo.helloworlddemo;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Provides;

public class MyStringProvider implements Provider<String> {
    @Override
    public String get() {
        return "Hello World!";
    }
}
