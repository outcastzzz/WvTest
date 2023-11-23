package com.PC.Component.Guru.app.advancedBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentAdvancedBuildCaseComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentAdvancedBuildGpuComPcComponentGuruAppBinding


class AdvancedBuildCaseComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentAdvancedBuildCaseComPcComponentGuruAppBinding? = null
    private val binding: FragmentAdvancedBuildCaseComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentAdvancedBuildCaseComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAdvancedBuildCaseComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildCaseComPcComponentGuruApp_to_advancedBuildGpuComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_advancedBuildCaseComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}