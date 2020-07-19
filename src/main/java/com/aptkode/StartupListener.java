package com.aptkode;

import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.interceptor.Interceptor;

@ApplicationScoped
public class StartupListener {
    public void onInit(@Observes
                       @Initialized(ApplicationScoped.class)
                       @Priority(Interceptor.Priority.APPLICATION) Object initContext) {
        System.out.println("#######################");
        System.out.println("application initialized");
        System.out.println("#######################");
    }
}
