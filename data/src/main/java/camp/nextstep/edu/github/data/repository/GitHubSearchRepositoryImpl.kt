package camp.nextstep.edu.github.data.repository

import camp.nextstep.edu.github.data.api.GitHubSearchService
import camp.nextstep.edu.github.domain.GithubSearchRepository
import camp.nextstep.edu.github.domain.model.Repository
import javax.inject.Inject

internal class GitHubSearchRepositoryImpl @Inject constructor(
    private val gitHubSearchService: GitHubSearchService
) : GithubSearchRepository {
    override suspend fun searchGitHubs(): List<Repository> {
        return gitHubSearchService.searchGithub().map { it.toDomain() }
    }
}
