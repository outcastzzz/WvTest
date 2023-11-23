package com.PC.Component.Guru.app.optimalBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentOptimalBuildGpuComPcComponentGuruBinding
import com.PC.Component.Guru.app.databinding.FragmentOptimalBuildRamComPcComponentGuruBinding


class OptimalBuildGpuComPcComponentGuru : Fragment() {
    private var _binding: FragmentOptimalBuildGpuComPcComponentGuruBinding? = null
    private val binding: FragmentOptimalBuildGpuComPcComponentGuruBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentOptimalBuildGpuComPcComponentGuruBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOptimalBuildGpuComPcComponentGuruBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildGpuComPcComponentGuru_to_optimalBuildCaseComPcComponentGuru)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildGpuComPcComponentGuru_to_optimalBuildRamComPcComponentGuru)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildGpuComPcComponentGuru_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}