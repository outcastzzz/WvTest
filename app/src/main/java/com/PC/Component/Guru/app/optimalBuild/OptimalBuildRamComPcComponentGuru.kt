package com.PC.Component.Guru.app.optimalBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentOptimalBuildMBComPcComponentGuruBinding
import com.PC.Component.Guru.app.databinding.FragmentOptimalBuildRamComPcComponentGuruBinding


class OptimalBuildRamComPcComponentGuru : Fragment() {
    private var _binding: FragmentOptimalBuildRamComPcComponentGuruBinding? = null
    private val binding: FragmentOptimalBuildRamComPcComponentGuruBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentOptimalBuildRamComPcComponentGuruBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOptimalBuildRamComPcComponentGuruBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildRamComPcComponentGuru_to_optimalBuildGpuComPcComponentGuru)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildRamComPcComponentGuru_to_optimalBuildMBComPcComponentGuru)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildRamComPcComponentGuru_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}