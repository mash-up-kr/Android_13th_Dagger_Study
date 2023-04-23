package camp.nextstep.edu.github

import android.app.Application
import camp.nextstep.edu.github.di.AppComponent
import camp.nextstep.edu.github.di.DaggerAppComponent


open class MyApplication : Application(){
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}
