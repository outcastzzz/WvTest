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

class AdvancedBuildMBComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentAdvancedBuildMBComPcComponentGuruAppBinding? = null
    private val binding: FragmentAdvancedBuildMBComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentAdvancedBuildMBComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAdvancedBuildMBComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildMBComPcComponentGuruApp_to_advancedBuildRamComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildMBComPcComponentGuruApp_to_advancedBuildProcComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildMBComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}