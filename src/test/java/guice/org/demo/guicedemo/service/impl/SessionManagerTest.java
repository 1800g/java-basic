package guice.org.demo.guicedemo.service.impl;

import com.google.inject.Guice;
import guice.org.demo.guicedemo.service.impl.ServerModule;
import guice.org.demo.guicedemo.service.impl.SessionManager;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import javax.inject.Inject;

import static org.junit.Assert.assertNotEquals;

/**
 * SessionManager Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>07/01/2018</pre>
 */
public class SessionManagerTest {
    @Inject SessionManager sessionManager;

    @Before public void setUp(){
        sessionManager = Guice.createInjector(new ServerModule()).getInstance(SessionManager.class);
    }

    @Test
    public void testGetSessionId() throws Exception {
        Long sessionId1 = sessionManager.getSessionId();
        Thread.sleep(1000);
        Long sessionId2 = sessionManager.getSessionId();
        System.out.println(sessionId1+"--VS--"+sessionId2);
        assertNotEquals(sessionId1.longValue(),sessionId2.longValue());
    }


} 
