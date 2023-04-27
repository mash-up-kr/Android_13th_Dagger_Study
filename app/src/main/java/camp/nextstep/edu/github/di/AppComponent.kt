package camp.nextstep.edu.github.di

import dagger.Component

/**
 * android-github
 * @author jaesung
 * @created 2023/04/24
 */
@Component(modules = [ActivityModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }

    fun mainComponent(): MainComponent.Factory
}