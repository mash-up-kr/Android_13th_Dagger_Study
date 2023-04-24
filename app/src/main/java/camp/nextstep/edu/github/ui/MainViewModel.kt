package camp.nextstep.edu.github.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import camp.nextstep.edu.github.domain.GithubSearchRepository
import camp.nextstep.edu.github.domain.model.Repository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val githubSearchRepository: GithubSearchRepository,
) : ViewModel() {
    private val _repositories = MutableLiveData<List<Repository>>()
    val repositories: LiveData<List<Repository>>
        get() = _repositories

    init {
        viewModelScope.launch {
            val repositories = githubSearchRepository.searchGitHubs()
            _repositories.postValue(repositories)
        }
    }
}
