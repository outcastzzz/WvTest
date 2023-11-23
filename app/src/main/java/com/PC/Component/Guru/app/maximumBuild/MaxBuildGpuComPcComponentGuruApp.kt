package com.PC.Component.Guru.app.maximumBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentMaxBuildGpuComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentMaxBuildRamComPcComponentGuruAppBinding

class MaxBuildGpuComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentMaxBuildGpuComPcComponentGuruAppBinding? = null
    private val binding: FragmentMaxBuildGpuComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentMaxBuildGpuComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMaxBuildGpuComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildGpuComPcComponentGuruApp_to_maxBuildCaseComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildGpuComPcComponentGuruApp_to_maxBuildRamComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildGpuComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}