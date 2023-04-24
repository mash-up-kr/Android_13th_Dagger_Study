package camp.nextstep.edu.github.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import camp.nextstep.edu.github.domain.model.Repository
import camp.nextstep.edu.github.ui.RepositoriesSearchAdapter

@BindingAdapter("bind:repoList")
fun RecyclerView.setRepositoryList(repoList: List<Repository>?) {
    (adapter as? RepositoriesSearchAdapter)?.submitList(repoList ?: emptyList())
}
