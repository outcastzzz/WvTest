package com.PC.Component.Guru.app.basicBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentBasicBuildCaseComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentBasicBuildGpuComPcComponentGuruAppBinding

class BasicBuildCaseComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentBasicBuildCaseComPcComponentGuruAppBinding? = null
    private val binding: FragmentBasicBuildCaseComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentBasicBuildCaseComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBasicBuildCaseComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildCaseComPcComponentGuruApp_to_basicBuildStorageComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildCaseComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}