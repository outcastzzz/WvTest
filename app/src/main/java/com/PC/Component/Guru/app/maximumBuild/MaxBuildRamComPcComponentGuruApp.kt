package com.PC.Component.Guru.app.maximumBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentMaxBuildMotherComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentMaxBuildRamComPcComponentGuruAppBinding


class MaxBuildRamComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentMaxBuildRamComPcComponentGuruAppBinding? = null
    private val binding: FragmentMaxBuildRamComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentMaxBuildRamComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMaxBuildRamComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildRamComPcComponentGuruApp_to_maxBuildGpuComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildRamComPcComponentGuruApp_to_maxBuildMotherComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildRamComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}