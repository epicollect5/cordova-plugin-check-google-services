package com.checkGoogleServices;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/**
 * This class echoes a string called from JavaScript.
 */
public class checkGoogleServices extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("checkGoogleServicesAvailability")) {
            Context context = this.cordova.getActivity().getApplicationContext();
            this.checkGoogleServicesAvailability(context, callbackContext);
            return true;
        }
        return false;
    }

    private void checkGoogleServicesAvailability(Context context, CallbackContext callbackContext) {
        try {
            JSONObject json = new JSONObject();
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == com.google.android.gms.common.ConnectionResult.SUCCESS) {
              json.put("status", true);
            }
            else{
                json.put("status", false);
            }

            callbackContext.success(json);
            return;

            
        } catch (Exception error) {
            callbackContext.error("Error validating huawei services availability");
        }
    }
}
