package camp.nextstep.edu.github.main

import camp.nextstep.edu.github.common.ViewModelFactoryModule
import camp.nextstep.edu.github.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ViewModelsModule::class, ViewModelFactoryModule::class])
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(activity: MainActivity)
}
