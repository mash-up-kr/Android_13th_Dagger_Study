package camp.nextstep.edu.github

import android.app.Application
import camp.nextstep.edu.github.di.AppComponent
import camp.nextstep.edu.github.di.DaggerAppComponent

class MyApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}
