package camp.nextstep.edu.github.di

import camp.nextstep.edu.github.data.di.NetworkModule
import dagger.Component

@Component(modules = [ViewModelModule::class, NetworkModule::class])
interface ApplicationComponent {
}