package camp.nextstep.edu.github.di

import androidx.lifecycle.ViewModel
import camp.nextstep.edu.github.MainViewModel
import camp.nextstep.edu.github.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * android-github
 * @author jaesung
 * @created 2023/04/24
 */
@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindsMainViewModel(mainViewModel: MainViewModel): ViewModel
}