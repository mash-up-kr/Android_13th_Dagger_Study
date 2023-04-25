package camp.nextstep.edu.github.presentation.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import camp.nextstep.edu.github.GitHubApplication
import camp.nextstep.edu.github.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var searchAdapter: RepositoriesSearchAdapter

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    private val viewModel: MainViewModel by viewModels {
        factory
    }

    lateinit var mainComponent: MainComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        mainComponent = (application as GitHubApplication).presentationComponent.mainComponent().create()
        mainComponent.inject(this)

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
