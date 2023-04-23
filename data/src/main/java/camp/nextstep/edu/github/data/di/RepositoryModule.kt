package camp.nextstep.edu.github.data.di

import camp.nextstep.edu.github.data.api.GitHubSearchApi
import camp.nextstep.edu.github.data.repository.GitHubSearchRepositoryImpl
import camp.nextstep.edu.github.domain.GithubSearchRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideGithubSearchRepository(
        retrofit: Retrofit
    ) : GithubSearchRepository {
        return GitHubSearchRepositoryImpl(
            gitHubSearchApi = retrofit.create(GitHubSearchApi::class.java)
        )
    }
}