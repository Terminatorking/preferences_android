package ghazimoradi.soheil.preferences;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(
            @Nullable Bundle savedInstanceState,
            @Nullable String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
        findPreference("USER_FIRST_NAME").setOnPreferenceChangeListener(
                (preference, newValue) -> {
                    if (newValue.toString().length() < 3) {
                        return false;
                    }else {
                        Toast.makeText(G.context, "Value changed " + newValue, Toast.LENGTH_LONG).show();
                        return true;
                    }
                }
        );
    }
}