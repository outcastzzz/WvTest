package com.PC.Component.Guru.app.optimalBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentOptimalBuildProcComPcComponentGuruBinding


class OptimalBuildProcComPcComponentGuru : Fragment() {
    private var _binding: FragmentOptimalBuildProcComPcComponentGuruBinding? = null
    private val binding: FragmentOptimalBuildProcComPcComponentGuruBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentStarerBuildMBComPCComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOptimalBuildProcComPcComponentGuruBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildProcComPcComponentGuru_to_optimalBuildMBComPcComponentGuru)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildProcComPcComponentGuru_to_menuFragmentComPCComponentGuruApp4)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_optimalBuildProcComPcComponentGuru_to_menuFragmentComPCComponentGuruApp4)
        }
    }
}