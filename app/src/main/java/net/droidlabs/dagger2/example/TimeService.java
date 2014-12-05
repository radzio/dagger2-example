package net.droidlabs.dagger2.example;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.inject.Inject;

public class TimeService implements ITimeService
{
    @Inject
    public TimeService()
    {
    }

    @Override
    public int currentHour()
    {
        return new GregorianCalendar().get(Calendar.HOUR_OF_DAY);
    }
}
