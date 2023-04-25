package camp.nextstep.edu.github

import android.app.Application
import camp.nextstep.edu.github.di.AppComponent
import camp.nextstep.edu.github.di.DaggerAppComponent
import camp.nextstep.edu.github.presentation.PresentationComponent

/**
 * @Created by 김현국 2023/04/24
 * @Time 1:39 AM
 */
class GitHubApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create()
    }

    val presentationComponent: PresentationComponent by lazy {
        appComponent.presentationComponent().create()
    }
}
