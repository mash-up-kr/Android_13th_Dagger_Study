package camp.nextstep.edu.github.di

import android.content.Context
import camp.nextstep.edu.github.data.di.NetworkModule
import camp.nextstep.edu.github.data.di.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules =[RepositoryModule::class, NetworkModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}
