package com.PC.Component.Guru.app.basicBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentBasicBuildProcComPcComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentMaxBuildCaseComPcComponentGuruAppBinding

class BasicBuildProcComPcComponentGuruApp : Fragment() {
    private var _binding: FragmentBasicBuildProcComPcComponentGuruAppBinding? = null
    private val binding: FragmentBasicBuildProcComPcComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentBasicBuildProcComPcComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBasicBuildProcComPcComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildProcComPcComponentGuruApp_to_basicBuildMBComPcComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildProcComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_basicBuildProcComPcComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}