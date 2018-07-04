package guice.org.demo.guicedemo.helloworlddemo;

import guice.org.demo.guicedemo.MyApplet;

import javax.inject.Inject;
import javax.inject.Provider;

public class StringWritingApplet implements MyApplet {

    private MyDestination destination;
    private Provider<String> stringProvider;

    @Inject
    public StringWritingApplet(MyDestination destination, @Output Provider<String> stringProvider) {
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void printHelloWorld() {
        destination.write(stringProvider.get());
    }

    public void run() {
        printHelloWorld();
    }
}
