package waiyan.eventregistration;

import android.app.Application;
import android.content.Context;

/**
 * Created by Coolz on 6/19/2016.
 */
public class EventRegistrationApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        EventRegistrationApp.context = context;
    }
}
