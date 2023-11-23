package com.PC.Component.Guru.app.maximumBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentMaxBuildCaseComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentMaxBuildGpuComPcComponentGuruAppBinding

class MaxBuildCaseComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentMaxBuildCaseComPcComponentGuruAppBinding? = null
    private val binding: FragmentMaxBuildCaseComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentMaxBuildCaseComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMaxBuildCaseComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildCaseComPcComponentGuruApp_to_maxBuildGpuComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_maxBuildCaseComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}