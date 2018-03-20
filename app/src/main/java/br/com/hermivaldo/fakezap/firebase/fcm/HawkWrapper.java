package br.com.hermivaldo.fakezap.firebase.fcm;

import android.content.Context;

import com.orhanobut.hawk.Hawk;
import com.orhanobut.hawk.NoEncryption;

/**
 * Created by logonrm on 19/03/2018.
 */

public class HawkWrapper {

    public static void init(Context context) {
        NoEncryption encryption = new NoEncryption();
        Hawk.init(context).setEncryption(encryption).build();
    }

}
