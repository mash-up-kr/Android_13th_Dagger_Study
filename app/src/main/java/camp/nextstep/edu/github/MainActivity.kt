package camp.nextstep.edu.github

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import camp.nextstep.edu.github.databinding.ActivityMainBinding
import camp.nextstep.edu.github.di.viewmodel.ViewModelFactory
import camp.nextstep.edu.github.domain.GithubSearchRepository
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var searchAdapter: RepositoriesSearchAdapter

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: MainViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MainApplication).mainComponent.inject(this)

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
