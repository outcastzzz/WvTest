package com.PC.Component.Guru.app.basicBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentBasicBuildGpuComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentBasicBuildMBComPcComponentGuruAppBinding

class BasicBuildGpuComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentBasicBuildGpuComPcComponentGuruAppBinding? = null
    private val binding: FragmentBasicBuildGpuComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentBasicBuildGpuComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBasicBuildGpuComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildGpuComPcComponentGuruApp_to_basicBuildStorageComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildGpuComPcComponentGuruApp_to_basicBuildMBComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildGpuComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}