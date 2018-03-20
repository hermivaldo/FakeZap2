package br.com.hermivaldo.fakezap

import android.app.Application
import br.com.hermivaldo.fakezap.firebase.fcm.HawkWrapper
import com.facebook.stetho.Stetho
import com.orhanobut.hawk.Hawk
import com.orhanobut.hawk.NoEncryption

/**
 * Created by logonrm on 19/03/2018.
 */
class MeuApp : Application(){

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)

        var halk = HawkWrapper.init(this)

    }

}