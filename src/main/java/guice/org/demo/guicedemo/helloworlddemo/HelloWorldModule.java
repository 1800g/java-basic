package guice.org.demo.guicedemo.helloworlddemo;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import guice.org.demo.guicedemo.Args;
import guice.org.demo.guicedemo.MyApplet;

import java.io.PrintStream;
import java.util.List;

public class HelloWorldModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyApplet.class).annotatedWith(Names.named("hello")).to(StringWritingApplet.class);
        bind(MyDestination.class).to(PrintStreamWriter.class);
        bind(PrintStream.class).toInstance(System.out);
        /*bind(String.class).annotatedWith(Output.class).toInstance("Hello World!");*/
        /*bind(String.class).toProvider(MyStringProvider.class);*/
    }

/*    @Provides private String getString(){
        return "Hello World!";
    }*/
    @Provides @Output String getOutPutString(@Args List<String> args){
        return args.get(0);
    }
}
