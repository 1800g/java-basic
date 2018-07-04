package guice.org.demo.guicedemo;

import com.google.inject.Guice;

public class App {

    /**
     * bootstrap:
     * parse command line
     * set up environment
     * kick off main logic
     * @param args
     */
    public static void main(String[] args) {
        MyApplet mainApplet = Guice.createInjector(
                new MainModule(),new CommandLineModule(args))
                .getInstance(MyApplet.class);
        mainApplet.run();
    }




}
