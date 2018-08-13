package sg.edu.rp.c346.practicalquizp13;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class WallpaperReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        String rbs = prefs.getString("radiobutton","None");
        Toast.makeText(context, rbs, Toast.LENGTH_LONG).show();
    }
}
