package camp.nextstep.edu.github

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import camp.nextstep.edu.github.data.Injector
import camp.nextstep.edu.github.databinding.ActivityMainBinding
import camp.nextstep.edu.github.domain.GithubSearchRepository

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var searchAdapter: RepositoriesSearchAdapter

    private val viewModel: MainViewModel by viewModels {
        val repository: GithubSearchRepository = Injector.provideGithubSearchRepository()
        MainViewModelFactory(repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lifecycleOwner = this
        binding.vm = viewModel
        setupRecyclerView()
        observerLiveData()
        viewModel.searchRepositories()
    }

    private fun setupRecyclerView() {
        searchAdapter = RepositoriesSearchAdapter()
        binding.rvSearchResult.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            adapter = searchAdapter
        }
    }

    private fun observerLiveData() {
        viewModel.repositories.observe(this) {
            searchAdapter.submitList(it.toList())
        }
    }
}
