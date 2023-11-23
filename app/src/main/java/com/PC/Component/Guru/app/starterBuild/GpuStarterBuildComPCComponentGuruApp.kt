package com.PC.Component.Guru.app.starterBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentStarerBuildMBComPCComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentStarterBuildGpuComPCComponentGuruAppBinding


class GpuStarterBuildComPCComponentGuruApp : Fragment() {
    private var _binding: FragmentStarterBuildGpuComPCComponentGuruAppBinding? = null
    private val binding: FragmentStarterBuildGpuComPCComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentStarterBuildGpuComPCComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStarterBuildGpuComPCComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_gpuStarterBuildComPCComponentGuruApp_to_caseStarterBuildComPCComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_gpuStarterBuildComPCComponentGuruApp_to_MBStarerBuildComPCComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_gpuStarterBuildComPCComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}