package net.droidlabs.dagger2.example;

import dagger.Component;

@ActivityScope
@Component(modules = HelloModule.class)
public interface HelloComponent
{
    void inject(HelloActivity helloActivity);
}
