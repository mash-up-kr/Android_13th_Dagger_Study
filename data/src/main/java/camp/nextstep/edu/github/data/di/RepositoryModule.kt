package camp.nextstep.edu.github.data.di

import camp.nextstep.edu.github.data.repository.GitHubSearchRepositoryImpl
import camp.nextstep.edu.github.domain.GithubSearchRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * android-github
 * @author jaesung
 * @created 2023/04/24
 */
@Module
internal interface RepositoryModule {

    @Singleton
    @Binds
    fun bindGithubSearchRepository(gitHubSearchRepositoryImpl: GitHubSearchRepositoryImpl): GithubSearchRepository
}