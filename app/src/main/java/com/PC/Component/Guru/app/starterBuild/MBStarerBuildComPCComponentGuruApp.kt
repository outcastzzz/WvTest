package com.PC.Component.Guru.app.starterBuild

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.PC.Component.Guru.app.R
import com.PC.Component.Guru.app.databinding.FragmentStarerBuildMBComPCComponentGuruAppBinding
import com.PC.Component.Guru.app.databinding.FragmentStarterBuildProcComPCComponentGuruAppBinding

class MBStarerBuildComPCComponentGuruApp : Fragment() {

    private var _binding: FragmentStarerBuildMBComPCComponentGuruAppBinding? = null
    private val binding: FragmentStarerBuildMBComPCComponentGuruAppBinding
        get() = _binding ?: throw RuntimeException(
            "FragmentStarerBuildMBComPCComponentGuruAppBinding == null"
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStarerBuildMBComPCComponentGuruAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_MBStarerBuildComPCComponentGuruApp_to_gpuStarterBuildComPCComponentGuruApp)
        }
        binding.backComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_MBStarerBuildComPCComponentGuruApp_to_starterBuildFragmentMenuComPCComponentGuruAppBinding2)
        }
        binding.menuComPcComponentGuruApp.setOnClickListener {
            findNavController().navigate(R.id.action_MBStarerBuildComPCComponentGuruApp_to_menuFragmentComPCComponentGuruApp4)
        }
    }


}