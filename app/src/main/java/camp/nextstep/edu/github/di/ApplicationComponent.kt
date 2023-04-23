package camp.nextstep.edu.github.di

import camp.nextstep.edu.github.MainActivity
import camp.nextstep.edu.github.data.di.NetworkModule
import camp.nextstep.edu.github.data.di.RepositoryModule
import camp.nextstep.edu.github.di.viewmodel.ViewModelFactoryModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ViewModelModule::class, NetworkModule::class, RepositoryModule::class, ViewModelFactoryModule::class
])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}