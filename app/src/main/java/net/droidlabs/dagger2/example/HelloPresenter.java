package net.droidlabs.dagger2.example;

import javax.inject.Inject;

public class HelloPresenter implements IHelloPresenter
{
    private final HelloView view;
    private final IGreetingsProvider messageSupplier;

    @Inject
    public HelloPresenter(HelloView view, IGreetingsProvider messageSupplier)
    {
        this.view = view;
        this.messageSupplier = messageSupplier;
    }

    public void requestMessage()
    {
        view.onMessageUpdated(messageSupplier.getMessage());
    }
}
