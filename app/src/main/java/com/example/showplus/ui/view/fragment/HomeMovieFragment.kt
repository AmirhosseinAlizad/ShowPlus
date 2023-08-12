package com.example.showplus.ui.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.showplus.R
import com.example.showplus.databinding.FragmentHomeMovieBinding
import com.example.showplus.ui.adapter.TvShowsAdapter
import com.example.showplus.ui.viewmodel.TvShowsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeMovieFragment : Fragment() {
    private lateinit var binding: FragmentHomeMovieBinding
    private val viewModel: TvShowsViewModel by viewModels()
    private lateinit var showsAdapter: TvShowsAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeMovieBinding.inflate(inflater, container, false)
        //bindViews()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        showsAdapter = TvShowsAdapter()
        viewModel.responseTvShows.observe(this) { response ->
            showsAdapter.tvShowsModel = response
        }
        binding.recycler.apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            setHasFixedSize(true)
            adapter = showsAdapter
        }
    }

//    private fun bindViews() {
//        showsAdapter = TvShowsAdapter()
//        viewModel.responseTvShows.observe(this) { response ->
//            showsAdapter.tvShowsModel = response
//        }
//        binding.recycler.apply {
//            adapter = showsAdapter
//            layoutManager = GridLayoutManager(
//                this@HomeMovieFragment.context,
//                2,
//                GridLayoutManager.VERTICAL,
//                false
//            )
//            setHasFixedSize(true)
//        }
//    }
}