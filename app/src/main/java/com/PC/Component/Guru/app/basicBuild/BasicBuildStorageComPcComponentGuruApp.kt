package com.PC.Component.Guru.app.basicBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentBasicBuildGpuComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentBasicBuildStorageComPcComponentGuruAppBinding

class BasicBuildStorageComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentBasicBuildStorageComPcComponentGuruAppBinding? = null
    private val binding: FragmentBasicBuildStorageComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentBasicBuildStorageComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBasicBuildStorageComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildStorageComPcComponentGuruApp_to_basicBuildCaseComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildStorageComPcComponentGuruApp_to_basicBuildGpuComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildStorageComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}