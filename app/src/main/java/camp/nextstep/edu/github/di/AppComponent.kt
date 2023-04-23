package camp.nextstep.edu.github.di

import camp.nextstep.edu.github.MainActivity
import camp.nextstep.edu.github.data.di.NetworkModule
import camp.nextstep.edu.github.data.di.RepositoryModule
import dagger.Component

@Component(modules = [ViewModelModule::class, NetworkModule::class, RepositoryModule::class])
interface AppComponent {

    // fun inject(mainActivity: MainActivity)
}
