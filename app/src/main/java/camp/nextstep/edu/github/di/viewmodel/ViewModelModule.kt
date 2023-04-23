package camp.nextstep.edu.github.di.viewmodel

import androidx.lifecycle.ViewModel
import camp.nextstep.edu.github.presentation.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * @Created by 김현국 2023/04/24
 * @Time 1:48 AM
 */

@Module
interface ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindsMainViewModel(mainViewModel: MainViewModel): ViewModel
}
