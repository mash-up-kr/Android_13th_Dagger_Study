package camp.nextstep.edu.github.di

import androidx.lifecycle.ViewModelProvider
import camp.nextstep.edu.github.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module

/**
 * android-github
 * @author jaesung
 * @created 2023/04/24
 */
@Module
interface ViewModelFactoryModule {

    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}