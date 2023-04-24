package camp.nextstep.edu.github.di

import camp.nextstep.edu.github.data.di.ApiModule
import camp.nextstep.edu.github.data.di.NetWorkModule
import camp.nextstep.edu.github.data.di.RepositoryModule
import camp.nextstep.edu.github.presentation.PresentationComponent
import dagger.Component
import javax.inject.Singleton

/**
 * @Created by 김현국 2023/04/24
 * @Time 1:36 AM
 */
@Singleton
@Component(modules = [ SubComponents::class, NetWorkModule::class, ApiModule::class, RepositoryModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }

    fun presentationComponent(): PresentationComponent.Factory
}
