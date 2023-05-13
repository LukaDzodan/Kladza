package com.example.kladza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import com.example.kladza.AddFragment
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selectedTab: Int = 1

        val homeLayout = findViewById<LinearLayout>(R.id.homeLayout)
        val addLayout = findViewById<LinearLayout>(R.id.addLayout)
        val accountLayout = findViewById<LinearLayout>(R.id.accountLayout)

        val homeImage = findViewById<ImageView>(R.id.homeImage)
        val addImage = findViewById<ImageView>(R.id.addImage)
        val accountImage = findViewById<ImageView>(R.id.accountImage)

        val homeTxt = findViewById<TextView>(R.id.homeTxt)
        val addTxt = findViewById<TextView>(R.id.addTxt)
        val accountTxt = findViewById<TextView>(R.id.accountTxt)

        val match1Txt = findViewById<TextView>(R.id.match1Txt)
        val match2Txt = findViewById<TextView>(R.id.match2Txt)
        val match3Txt = findViewById<TextView>(R.id.match3Txt)
        val match4Txt = findViewById<TextView>(R.id.match4Txt)
        val match5Txt = findViewById<TextView>(R.id.match5Txt)
        val match6Txt = findViewById<TextView>(R.id.match6Txt)
        val match7Txt = findViewById<TextView>(R.id.match7Txt)
        val match8Txt = findViewById<TextView>(R.id.match8Txt)

        match1Txt.text  = "${Random.nextInt(0, 6)} : ${Random.nextInt(0, 6)}"
        match2Txt.text  = "${Random.nextInt(0, 6)} : ${Random.nextInt(0, 6)}"
        match3Txt.text  = "${Random.nextInt(0, 6)} : ${Random.nextInt(0, 6)}"
        match4Txt.text  = "${Random.nextInt(0, 100)}:${Random.nextInt(0, 100)}"
        match5Txt.text  = "${Random.nextInt(0, 100)}:${Random.nextInt(0, 100)}"
        match6Txt.text  = "${Random.nextInt(0, 6)} : ${Random.nextInt(0, 6)}"
        match7Txt.text  = "${Random.nextInt(0, 6)} : ${Random.nextInt(0, 6)}"
        match8Txt.text  = "${Random.nextInt(0, 6)} : ${Random.nextInt(0, 6)}"

        //supportFragmentManager.beginTransaction().setReorderingAllowed(true).replace(R.id.addFragment,AddFragment(),"AddFragment").commit()

        homeLayout.setOnClickListener() {
            if (selectedTab != 1) {
                addTxt.visibility = View.GONE
                accountTxt.visibility = View.GONE

                addImage.setImageResource(R.drawable.add)
                accountImage.setImageResource(R.drawable.account)

                addLayout.setBackgroundColor(getColor(android.R.color.transparent))
                accountLayout.setBackgroundColor(getColor(android.R.color.transparent))

                homeTxt.visibility = View.VISIBLE
                homeImage.setImageResource(R.drawable.home_selected)
                homeLayout.setBackgroundResource(R.drawable.back_home_button)

                val ScaleAnimation = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                )
                ScaleAnimation.duration = 200
                ScaleAnimation.fillAfter = true
                homeLayout.startAnimation(ScaleAnimation)

                selectedTab = 1
            }
        }
        addLayout.setOnClickListener() {
            if (selectedTab != 2) {
                homeTxt.visibility = View.GONE
                accountTxt.visibility = View.GONE

                homeImage.setImageResource(R.drawable.home)
                accountImage.setImageResource(R.drawable.account)

                homeLayout.setBackgroundColor(getColor(android.R.color.transparent))
                accountLayout.setBackgroundColor(getColor(android.R.color.transparent))

                addTxt.visibility = View.VISIBLE
                addImage.setImageResource(R.drawable.add_selected)
                addLayout.setBackgroundResource(R.drawable.back_home_button)

                //supportFragmentManager.beginTransaction().setReorderingAllowed(true).replace(R.id.addFragment,AddFragment(),"AddFragment").commit()

                val ScaleAnimation = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                )
                ScaleAnimation.duration = 200
                ScaleAnimation.fillAfter = true
                addLayout.startAnimation(ScaleAnimation)

                selectedTab = 2
            }
        }
        accountLayout.setOnClickListener() {
            if (selectedTab != 3) {
                addTxt.visibility = View.GONE
                homeTxt.visibility = View.GONE

                addImage.setImageResource(R.drawable.add)
                homeImage.setImageResource(R.drawable.home)

                addLayout.setBackgroundColor(getColor(android.R.color.transparent))
                homeLayout.setBackgroundColor(getColor(android.R.color.transparent))

                accountTxt.visibility = View.VISIBLE
                accountImage.setImageResource(R.drawable.account_selected)
                accountLayout.setBackgroundResource(R.drawable.back_home_button)

                val ScaleAnimation = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                )
                ScaleAnimation.duration = 200
                ScaleAnimation.fillAfter = true
                accountLayout.startAnimation(ScaleAnimation)

                selectedTab = 3
            }

        }
    }
}
