package camp.nextstep.edu.github.di

import androidx.lifecycle.ViewModelProvider
import camp.nextstep.edu.github.ui.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}
