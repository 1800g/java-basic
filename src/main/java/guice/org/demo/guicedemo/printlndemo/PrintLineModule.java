package guice.org.demo.guicedemo.printlndemo;

import com.google.inject.AbstractModule;
import guice.org.demo.guicedemo.Applets;

public class PrintLineModule extends AbstractModule {
    @Override
    protected void configure() {
        Applets.register(binder()).named("println").to(PrintlnLineApplet.class);
    }
}
