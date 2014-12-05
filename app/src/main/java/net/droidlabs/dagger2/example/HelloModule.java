package net.droidlabs.dagger2.example;

import dagger.Module;
import dagger.Provides;

@Module
public class HelloModule
{
    private final HelloView view;

    public HelloModule(HelloView view)
    {
        this.view = view;
    }

    @Provides
    HelloView helloView()
    {
        return this.view;
    }

    @Provides
    IGreetingsProvider messageSupplier(GreetingsProvider messageSupplier)
    {
        return messageSupplier;
    }

    @Provides
    ITimeService timeService(TimeService timeService)
    {
        return timeService;
    }

    @Provides
    IHelloPresenter helloPresenter(HelloPresenter helloPresenter)
    {
        return helloPresenter;
    }
}
