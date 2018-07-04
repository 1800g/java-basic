package guice.org.demo.guicedemo.helloworlddemo;

import javax.inject.Inject;
import java.io.PrintStream;

public class PrintStreamWriter implements MyDestination {

    private PrintStream destination;

    @Inject
    public PrintStreamWriter(PrintStream destination) {
        this.destination = destination;
    }

    @Override
    public void write(String s) {
        destination.println(s);
    }
}
