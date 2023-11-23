package com.PC.Component.Guru.app.basicBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentBasicBuildMBComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentBasicBuildProcComPcComponentGuruAppBinding

class BasicBuildMBComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentBasicBuildMBComPcComponentGuruAppBinding? = null
    private val binding: FragmentBasicBuildMBComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentBasicBuildMBComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBasicBuildMBComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildMBComPcComponentGuruApp_to_basicBuildGpuComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildMBComPcComponentGuruApp_to_basicBuildProcComPcComponentGuruApp)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildMBComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}