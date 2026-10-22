package com.example.adn_chitato

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class SnackFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_snack, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Tombol back di toolbar: kembali ke tab Home
        view.findViewById<MaterialToolbar>(R.id.toolbar).setNavigationOnClickListener {
            requireActivity().findViewById<BottomNavigationView>(R.id.bottomNav)
                .selectedItemId = R.id.nav_home
        }

        // Tombol web: tetap membuka WebInfoActivity
        view.findViewById<Button>(R.id.btnWebInfo).setOnClickListener {
            startActivity(Intent(requireContext(), WebInfoActivity::class.java))
        }
    }
}