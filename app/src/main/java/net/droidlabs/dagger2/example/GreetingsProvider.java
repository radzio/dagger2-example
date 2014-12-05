package net.droidlabs.dagger2.example;

import javax.inject.Inject;

public class GreetingsProvider implements IGreetingsProvider
{
    private final ITimeService timeService;

    @Inject
    public GreetingsProvider(ITimeService timeService)
    {
        this.timeService = timeService;
    }

    @Override
    public String getMessage()
    {
        int hour = timeService.currentHour();
        String partOfDay;
        if (hour < 12)
        {
            partOfDay = "morning";
        }
        else if (hour >= 17)
        {
            partOfDay = "evening";
        }
        else
        {
            partOfDay = "afternoon";
        }
        return "Good " + partOfDay + ", Droidcon Krakow!";
    }
}
