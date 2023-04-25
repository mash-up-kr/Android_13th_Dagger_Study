package camp.nextstep.edu.github.presentation.main

import dagger.Subcomponent

/**
 * @Created by 김현국 2023/04/24
 * @Time 4:12 AM
 */

@Subcomponent
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(mainActivity: MainActivity)
}
