package ghazimoradi.soheil.preferences;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(
            @Nullable Bundle savedInstanceState,
            @Nullable String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
        Preference userFirstName = findPreference("USER_FIRST_NAME");
        if (userFirstName != null) {
            userFirstName.setOnPreferenceChangeListener(
                    (preference, newValue) -> {
                        if (newValue.toString().length() < 3) {
                            Toast.makeText(G.context, "name is short and must be at least 3 characters", Toast.LENGTH_LONG).show();
                            return false;
                        } else {
                            Toast.makeText(G.context, "Value changed " + newValue, Toast.LENGTH_LONG).show();
                            return true;
                        }
                    }
            );
        }
    }
}