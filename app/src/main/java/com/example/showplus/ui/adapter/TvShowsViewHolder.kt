package com.example.showplus.ui.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.showplus.data.model.TvShowsItem
import com.example.showplus.databinding.MovieItemBinding

class TvShowsViewHolder(private val binding: MovieItemBinding) : ViewHolder(binding.root) {
    fun bindViews(model: TvShowsItem) {
        binding.apply {
            image.load(model.image.original) {
                crossfade(true)
                crossfade(1000)
            }
            txtName.text = model.name
            txtRating.text = model.rating.toString()
        }
    }
}