package camp.nextstep.edu.github.di

import camp.nextstep.edu.github.main.MainComponent
import dagger.Module

@Module(
    subcomponents = [MainComponent::class]
)
class AppSubcomponents
