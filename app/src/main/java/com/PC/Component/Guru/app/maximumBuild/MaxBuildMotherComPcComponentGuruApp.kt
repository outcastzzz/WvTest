package com.PC.Component.Guru.app.maximumBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentMaxBuildMotherComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentMaxBuildProcComPcComponentGuruAppBinding

class MaxBuildMotherComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentMaxBuildMotherComPcComponentGuruAppBinding? = null
    private val binding: FragmentMaxBuildMotherComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentMaxBuildMotherComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMaxBuildMotherComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildMotherComPcComponentGuruApp_to_maxBuildRamComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildMotherComPcComponentGuruApp_to_maxBuildProcComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildMotherComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}