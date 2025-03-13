package camp.nextstep.edu.github.di.main

import camp.nextstep.edu.github.data.api.GitHubSearchApi
import camp.nextstep.edu.github.data.repository.GitHubSearchRepositoryImpl
import camp.nextstep.edu.github.domain.GithubSearchRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
abstract class MainModules {

    @Binds
    abstract fun bindsRepository(repository: GitHubSearchRepositoryImpl): GithubSearchRepository

    companion object {
        private const val BASE_URL = "https://api.github.com/"

        @Provides
        @Singleton
        fun providesHttpsLoggingInterceptor() = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        @Provides
        @Singleton
        fun providesOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor) = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

        @Provides
        @Singleton
        fun provideRetrofit(okHttpClient: OkHttpClient) = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .build()

        @Provides
        fun provideApi(retrofit: Retrofit): GitHubSearchApi = retrofit.create()
    }

}