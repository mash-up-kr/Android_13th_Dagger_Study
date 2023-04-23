//package camp.nextstep.edu.github.data
//
//import camp.nextstep.edu.github.data.api.GitHubSearchApi
//import camp.nextstep.edu.github.data.model.RepositoryEntity
//import com.google.common.truth.Truth.assertThat
//import com.squareup.moshi.Moshi
//import kotlinx.coroutines.runBlocking
//import okhttp3.mockwebserver.MockResponse
//import okhttp3.mockwebserver.MockWebServer
////import org.junit.Test
//import java.io.File
//
//class GitHubSearchApiTest {
//    private lateinit var server: MockWebServer
//    private lateinit var api: GitHubSearchApi
//
//
//    @Test
//    fun `repositories 요청`() {
//        // given
//        val response = MockResponse()
//            .setBody(File("src/test/resources/search_response.json").readText())
//        server.enqueue(response)
//
//        // when
//        val actual: List<RepositoryEntity>? = runBlocking {
//            api.searchGithub()
//        }
//
//        // then
//        val repositories = listOf(
//            RepositoryEntity(
//                "mojombo/grit",
//                "**Grit is no longer maintained. Check out libgit2/rugged.** Grit gives you object oriented read/write access to Git repositories via Ruby."
//            ),
//            RepositoryEntity(
//                "wycats/merb-core",
//                "Merb Core: All you need. None you don't."
//            )
//        )
//        assertThat(actual?.slice(0..1)).isEqualTo(repositories)
//    }
//}
