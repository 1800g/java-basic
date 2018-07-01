package guice.org.demo.guicedemo;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import guice.org.demo.helloworlddemo.HelloWorldModule;
import guice.org.demo.helloworlddemo.MyDestination;
import guice.org.demo.helloworlddemo.PrintStreamWriter;
import guice.org.demo.helloworlddemo.StringWritingApplet;

import java.io.PrintStream;

public class MainModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new HelloWorldModule());
    }
}
