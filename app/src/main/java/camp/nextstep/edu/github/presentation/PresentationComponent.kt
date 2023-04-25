package camp.nextstep.edu.github.presentation

import camp.nextstep.edu.github.di.viewmodel.ViewModelFactoryModule
import camp.nextstep.edu.github.di.viewmodel.ViewModelModule
import camp.nextstep.edu.github.presentation.main.MainComponent
import dagger.Subcomponent

/**
 * @Created by 김현국 2023/04/24
 * @Time 2:28 AM
 */

@Subcomponent(modules = [ViewModelFactoryModule::class, ViewModelModule::class])
interface PresentationComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): PresentationComponent
    }

    fun mainComponent(): MainComponent.Factory
    // presetation 안에 Component추가
}
