package com.example.springframework.scope;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {
}
