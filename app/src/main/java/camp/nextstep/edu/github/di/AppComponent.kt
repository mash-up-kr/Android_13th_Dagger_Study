package camp.nextstep.edu.github.di

import camp.nextstep.edu.github.MainActivity
import dagger.Component

@Component(modules = [ViewModelModule::class])
interface AppComponent {

    // fun inject(mainActivity: MainActivity)
}
