package camp.nextstep.edu.github.di

import camp.nextstep.edu.github.MainActivity
import camp.nextstep.edu.github.data.di.RepositoryModule
import camp.nextstep.edu.github.data.di.RetrofitModule
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * android-github
 * @author jaesung
 * @created 2023/04/24
 */
@Singleton
@Subcomponent(modules = [ViewModelModule::class, ViewModelFactoryModule::class, RepositoryModule::class, RetrofitModule::class])
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(mainActivity: MainActivity)
}