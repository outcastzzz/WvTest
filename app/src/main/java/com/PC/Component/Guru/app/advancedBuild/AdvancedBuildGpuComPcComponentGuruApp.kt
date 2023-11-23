package com.PC.Component.Guru.app.advancedBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentAdvancedBuildGpuComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentAdvancedBuildMBComPcComponentGuruAppBinding

class AdvancedBuildGpuComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentAdvancedBuildGpuComPcComponentGuruAppBinding? = null
    private val binding: FragmentAdvancedBuildGpuComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentAdvancedBuildGpuComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAdvancedBuildGpuComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildGpuComPcComponentGuruApp_to_advancedBuildCaseComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildGpuComPcComponentGuruApp_to_advancedBuildRamComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildGpuComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}