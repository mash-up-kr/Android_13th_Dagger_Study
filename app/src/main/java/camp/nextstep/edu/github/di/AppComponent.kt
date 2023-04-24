package camp.nextstep.edu.github.di

import camp.nextstep.edu.github.data.di.NetworkModule
import camp.nextstep.edu.github.data.di.RepositoryModule
import camp.nextstep.edu.github.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppSubComponent::class,
        ViewModelModule::class,
        ViewModelFactoryModule::class,
        NetworkModule::class,
        RepositoryModule::class,
    ],
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }

    fun mainComponent(): MainComponent.Factory

    fun inject(activity: MainActivity)
}
