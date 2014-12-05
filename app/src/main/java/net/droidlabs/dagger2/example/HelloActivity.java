package net.droidlabs.dagger2.example;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import javax.inject.Inject;

public class HelloActivity extends ActionBarActivity implements HelloView
{
    @Inject
    IHelloPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Dagger_HelloComponent.builder()
                .helloModule(new HelloModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected void onPostResume()
    {
        super.onPostResume();
        presenter.requestMessage();
    }

    @Override
    public void onMessageUpdated(final String message)
    {
        ((TextView) findViewById(R.id.message)).setText(message);
    }
}
