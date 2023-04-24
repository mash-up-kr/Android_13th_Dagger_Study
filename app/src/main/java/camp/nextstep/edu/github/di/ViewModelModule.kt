package camp.nextstep.edu.github.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import camp.nextstep.edu.github.MainViewModel
import camp.nextstep.edu.github.di.viewmodel.ViewModelFactory
import camp.nextstep.edu.github.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}
