package camp.nextstep.edu.github.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import camp.nextstep.edu.github.domain.model.Repository

class RepositoriesSearchAdapter :
    ListAdapter<Repository, RepositorySearchViewHolder>(RepositoryDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        RepositorySearchViewHolder(parent)

    override fun onBindViewHolder(holder: RepositorySearchViewHolder, position: Int) {
        val repository = currentList[position]
        holder.bind(repository)
    }

    companion object {
        private val RepositoryDiffCallback = object : DiffUtil.ItemCallback<Repository>() {
            override fun areItemsTheSame(oldItem: Repository, newItem: Repository): Boolean {
                return oldItem.fullName == newItem.fullName
            }

            override fun areContentsTheSame(oldItem: Repository, newItem: Repository): Boolean {
                return oldItem == newItem
            }
        }
    }
}
