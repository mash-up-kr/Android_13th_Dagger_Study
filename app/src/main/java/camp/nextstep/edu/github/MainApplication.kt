package camp.nextstep.edu.github

import android.app.Application
import camp.nextstep.edu.github.di.ApplicationComponent
import camp.nextstep.edu.github.di.DaggerApplicationComponent

class MainApplication: Application() {
    val mainComponent: ApplicationComponent = DaggerApplicationComponent.create()
}