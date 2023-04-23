package camp.nextstep.edu.github.di.viewmodel

import androidx.lifecycle.ViewModel
import camp.nextstep.edu.github.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
interface ViewModelModules {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindsMainViewModel(viewModel: MainViewModel): ViewModel
}