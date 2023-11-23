package com.PC.Component.Guru.app.optimalBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentOptimalBuildMBComPcComponentGuruBinding
import com.PC.Component.Guru.app.databinding.FragmentOptimalBuildProcComPcComponentGuruBinding


class OptimalBuildMBComPcComponentGuru : Fragment() {
    private var _binding: FragmentOptimalBuildMBComPcComponentGuruBinding? = null
    private val binding: FragmentOptimalBuildMBComPcComponentGuruBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentOptimalBuildMBComPcComponentGuruBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOptimalBuildMBComPcComponentGuruBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildMBComPcComponentGuru_to_optimalBuildRamComPcComponentGuru)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildMBComPcComponentGuru_to_optimalBuildProcComPcComponentGuru)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildMBComPcComponentGuru_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}