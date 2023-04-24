package camp.nextstep.edu.github.data.di

import camp.nextstep.edu.github.data.repository.GitHubSearchRepositoryImpl
import camp.nextstep.edu.github.domain.GithubSearchRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun bindGithubGithubSearchRepository(gitHubSearchRepositoryImpl: GitHubSearchRepositoryImpl): GithubSearchRepository
}
