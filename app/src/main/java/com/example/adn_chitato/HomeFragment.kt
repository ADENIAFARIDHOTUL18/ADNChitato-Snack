package com.example.adn_chitato

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomNav = requireActivity().findViewById<BottomNavigationView>(R.id.bottomNav)

        view.findViewById<Button>(R.id.btnMyProject).setOnClickListener {
            bottomNav.selectedItemId = R.id.nav_snack
        }
        view.findViewById<Button>(R.id.btnProfile).setOnClickListener {
            bottomNav.selectedItemId = R.id.nav_profile
        }
        view.findViewById<Button>(R.id.btnLogout).setOnClickListener {
            SessionManager(requireContext()).logout()
            startActivity(Intent(requireContext(), LoginActivity::class.java))
            requireActivity().finish()
        }
    }
}