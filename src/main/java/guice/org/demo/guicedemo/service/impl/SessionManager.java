package guice.org.demo.guicedemo.service.impl;

import javax.inject.Inject;
import javax.inject.Provider;

public class SessionManager {
    private final Provider<Long> sessionIdProvider;

    @Inject
    public SessionManager(@SessionId Provider<Long> sessionIdProvider) {
        this.sessionIdProvider = sessionIdProvider;
    }

    public Long getSessionId() {
        return sessionIdProvider.get();
    }

}
