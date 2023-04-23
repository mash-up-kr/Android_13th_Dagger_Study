package camp.nextstep.edu.github.data.di

import camp.nextstep.edu.github.data.repository.GitHubSearchRepositoryImpl
import camp.nextstep.edu.github.domain.GithubSearchRepository
import dagger.Binds
import dagger.Module

/**
 * @Created by 김현국 2023/04/24
 * @Time 2:43 AM
 */

@Module
abstract class RepositoryModule {

    @Binds
    internal abstract fun provideGitHubSearchRepository(gitHubSearchRepositoryImpl: GitHubSearchRepositoryImpl): GithubSearchRepository
}
