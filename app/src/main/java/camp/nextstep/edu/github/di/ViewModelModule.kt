package camp.nextstep.edu.github.di

import androidx.lifecycle.ViewModel
import camp.nextstep.edu.github.domain.GithubSearchRepository
import camp.nextstep.edu.github.ui.MainViewModel
import camp.nextstep.edu.github.ui.ViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
object ViewModelModule {

    @Provides
    @IntoMap
    @ViewModelFactory.ViewModelKey(MainViewModel::class)
    fun provideMainViewModel(githubSearchRepository: GithubSearchRepository): ViewModel {
        return MainViewModel(githubSearchRepository)
    }
}
