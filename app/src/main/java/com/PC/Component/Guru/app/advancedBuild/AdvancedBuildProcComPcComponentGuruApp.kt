package com.PC.Component.Guru.app.advancedBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentAdvancedBuildMBComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentAdvancedBuildProcComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentBasicBuildGpuComPcComponentGuruAppBinding


class AdvancedBuildProcComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentAdvancedBuildProcComPcComponentGuruAppBinding? = null
    private val binding: FragmentAdvancedBuildProcComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentAdvancedBuildProcComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAdvancedBuildProcComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildProcComPcComponentGuruApp_to_advancedBuildMBComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildProcComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildProcComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}