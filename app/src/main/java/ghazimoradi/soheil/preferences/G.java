package ghazimoradi.soheil.preferences;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;

public class G extends Application {
    public static Context context;
    public static SharedPreferences preferences;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }
}
