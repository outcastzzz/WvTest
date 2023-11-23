package com.PC.Component.Guru.app.starterBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentStarterBuildCaseComPCComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentStarterBuildGpuComPCComponentGuruAppBinding

class CaseStarterBuildComPCComponentGuruApp : Fragment() {
    private var _binding: FragmentStarterBuildCaseComPCComponentGuruAppBinding? = null
    private val binding: FragmentStarterBuildCaseComPCComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentStarterBuildCaseComPCComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStarterBuildCaseComPCComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_caseStarterBuildComPCComponentGuruApp_to_gpuStarterBuildComPCComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_caseStarterBuildComPCComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}