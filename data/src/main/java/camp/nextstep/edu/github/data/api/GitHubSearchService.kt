package camp.nextstep.edu.github.data.api

import camp.nextstep.edu.github.data.model.RepositoryEntity
import retrofit2.http.GET

internal interface GitHubSearchService {
    @GET("repositories")
    suspend fun searchGithub(): List<RepositoryEntity>

}
