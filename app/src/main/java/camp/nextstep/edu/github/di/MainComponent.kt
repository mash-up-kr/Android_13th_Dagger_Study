package camp.nextstep.edu.github.di

import camp.nextstep.edu.github.ui.MainActivity
import dagger.Subcomponent

@Subcomponent
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(activity: MainActivity)
}
