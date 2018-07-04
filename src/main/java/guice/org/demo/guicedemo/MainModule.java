package guice.org.demo.guicedemo;

import com.google.inject.AbstractModule;
import guice.org.demo.guicedemo.helloworlddemo.HelloWorldModule;
import guice.org.demo.guicedemo.printlndemo.PrintLineModule;

public class MainModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new HelloWorldModule());
        install(new PrintLineModule());
    }
}
