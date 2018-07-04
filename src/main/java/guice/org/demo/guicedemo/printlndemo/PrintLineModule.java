package guice.org.demo.guicedemo.printlndemo;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import guice.org.demo.guicedemo.MyApplet;

import javax.inject.Named;

public class PrintLineModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyApplet.class).annotatedWith(Names.named("println")).to(PrintlnLineApplet.class);
    }
}
