package camp.nextstep.edu.github.data.di

import camp.nextstep.edu.github.data.api.GitHubSearchApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * @Created by 김현국 2023/04/24
 * @Time 2:16 AM
 */
@Module
class ApiModule {

    @Provides
    @Singleton
    fun providesGitSearchApi(retrofit: Retrofit): GitHubSearchApi {
        return retrofit.create(GitHubSearchApi::class.java)
    }
}
