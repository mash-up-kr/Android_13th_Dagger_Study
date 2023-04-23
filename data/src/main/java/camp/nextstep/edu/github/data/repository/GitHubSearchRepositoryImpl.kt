package camp.nextstep.edu.github.data.repository

import camp.nextstep.edu.github.data.api.GitHubSearchApi
import camp.nextstep.edu.github.domain.GithubSearchRepository
import camp.nextstep.edu.github.domain.model.Repository

internal class GitHubSearchRepositoryImpl(
    private val gitHubSearchApi: GitHubSearchApi
): GithubSearchRepository {
    override suspend fun searchGitHubs(): List<Repository> {
        return gitHubSearchApi.searchGithub().map { it.toDomain() }
    }
}
