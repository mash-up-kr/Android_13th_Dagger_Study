package camp.nextstep.edu.github.di.main

import camp.nextstep.edu.github.MainActivity
import camp.nextstep.edu.github.di.viewmodel.ViewModelFactoryModule
import camp.nextstep.edu.github.di.viewmodel.ViewModelModules
import dagger.Component
import javax.inject.Singleton

@Component(modules = [MainModules::class, ViewModelFactoryModule::class, ViewModelModules::class])
@Singleton
interface MainComponent {
    fun inject(activity: MainActivity)
}