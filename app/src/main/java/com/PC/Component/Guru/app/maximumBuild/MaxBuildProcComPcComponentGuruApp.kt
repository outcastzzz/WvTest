package com.PC.Component.Guru.app.maximumBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentMaxBuildProcComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentOptimalBuildGpuComPcComponentGuruBinding

class MaxBuildProcComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentMaxBuildProcComPcComponentGuruAppBinding? = null
    private val binding: FragmentMaxBuildProcComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentMaxBuildProcComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMaxBuildProcComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildProcComPcComponentGuruApp_to_maxBuildMotherComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildProcComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildProcComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}