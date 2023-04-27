package camp.nextstep.edu.github

import android.app.Application
import camp.nextstep.edu.github.di.AppComponent
import camp.nextstep.edu.github.di.DaggerAppComponent

/**
 * android-github
 * @author jaesung
 * @created 2023/04/24
 */
class MyApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create()
    }
}