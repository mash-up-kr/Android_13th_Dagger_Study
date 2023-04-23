package camp.nextstep.edu.github.di

import androidx.lifecycle.ViewModel
import camp.nextstep.edu.github.MainViewModel
import camp.nextstep.edu.github.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel
}