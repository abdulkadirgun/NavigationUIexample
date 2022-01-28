package com.example.navigationuiexample.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.navigationuiexample.R
import com.example.navigationuiexample.databinding.ActivityMainBinding
import com.example.navigationuiexample.fragments.HomeFragment
import com.example.navigationuiexample.fragments.HomeFragmentDirections

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(navController.graph)

        binding.mainToolbar.setupWithNavController(navController, appBarConfiguration)

        binding.mainToolbar.setOnMenuItemClickListener {
            val currentDest= navController.currentDestination?.id

            if(currentDest == R.id.homeFragment)
                when(it.itemId) {
                    R.id.item_1 -> navController.navigate(HomeFragmentDirections.actionHomeFragmentToCategories())
                    R.id.item_2 -> navController.navigate(HomeFragmentDirections.actionHomeFragmentToBookmarks())
                    R.id.item_3 -> navController.navigate(HomeFragmentDirections.actionHomeFragmentToSettings())
                }
            true
        }

       /* binding.mainToolbar.setNavigationOnClickListener {
            navController.navigate(HomeFragmentDirections.actionHomeFragmentToCategories())

        }*/

    }
}