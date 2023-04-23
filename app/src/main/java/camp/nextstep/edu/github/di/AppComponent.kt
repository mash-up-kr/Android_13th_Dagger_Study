package camp.nextstep.edu.github.di

import android.content.Context
import camp.nextstep.edu.github.data.di.NetworkModule
import camp.nextstep.edu.github.data.di.RepositoryModule
import camp.nextstep.edu.github.main.MainComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [RepositoryModule::class, NetworkModule::class, AppSubcomponents::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun mainComponent(): MainComponent.Factory
}
