package camp.nextstep.edu.github.data.repository

import camp.nextstep.edu.github.data.api.GitHubSearchApi
import camp.nextstep.edu.github.domain.GithubSearchRepository
import camp.nextstep.edu.github.domain.model.Repository
import javax.inject.Inject

class GitHubSearchRepositoryImpl @Inject constructor(
    private val searchApi: GitHubSearchApi,
) : GithubSearchRepository {
    override suspend fun searchGitHubs(): List<Repository> {
        return searchApi.searchGithub().map { it.toDomain() }
    }
}
