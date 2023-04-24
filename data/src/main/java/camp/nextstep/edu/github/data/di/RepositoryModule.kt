package camp.nextstep.edu.github.data.di

import camp.nextstep.edu.github.data.repository.GitHubSearchRepositoryImpl
import camp.nextstep.edu.github.domain.GithubSearchRepository
import dagger.Binds

@dagger.Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindGithubSearchRepository(repositoryImpl: GitHubSearchRepositoryImpl): GithubSearchRepository
}
