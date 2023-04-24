package camp.nextstep.edu.github.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import camp.nextstep.edu.github.databinding.ItemRepoBinding
import camp.nextstep.edu.github.domain.model.Repository

class RepositorySearchViewHolder(
    private val binding: ItemRepoBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(repository: Repository) {
        binding.repository = repository
    }

    companion object {
        operator fun invoke(parent: ViewGroup): RepositorySearchViewHolder {
            return RepositorySearchViewHolder(
                ItemRepoBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false,
                ),
            )
        }
    }
}
