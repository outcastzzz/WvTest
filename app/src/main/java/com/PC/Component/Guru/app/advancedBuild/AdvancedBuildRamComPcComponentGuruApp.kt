package com.PC.Component.Guru.app.advancedBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentAdvancedBuildMBComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentAdvancedBuildRamComPcComponentGuruAppBinding

class AdvancedBuildRamComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentAdvancedBuildRamComPcComponentGuruAppBinding? = null
    private val binding: FragmentAdvancedBuildRamComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentAdvancedBuildRamComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAdvancedBuildRamComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildRamComPcComponentGuruApp_to_advancedBuildGpuComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildRamComPcComponentGuruApp_to_advancedBuildMBComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildRamComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}