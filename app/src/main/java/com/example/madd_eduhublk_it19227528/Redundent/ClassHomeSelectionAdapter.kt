//package com.example.madd_eduhublk_it19011844.adapter
//
//import android.support.v4.app.Fragment
//import android.support.v4.app.FragmentManager
//import android.support.v4.app.FragmentPagerAdapter
//import com.example.madd_eduhublk_it19011844.assignment.AssignmentActivity
//import com.example.madd_eduhublk_it19011844.fragment.AssignmentFragment
//import com.example.madd_eduhublk_it19011844.slide.SlideActivity
//
//class ClassHomeSelectionAdapter(fm:FragmentManager) :FragmentPagerAdapter(fm) {
//
//
//
//    override fun getCount(): Int {
//        return 3
//    }
//
//    override fun getItem(p0: Int): Fragment? {
//        return when(p0){
//            0 -> SlideActivity() as Fragment
//            1 -> AssignmentActivity()
//            2 -> ()
//            else -> null
//        }
//    }
//
//    override fun getPageTitle(position: Int): CharSequence? {
//        return when(position){
//            0 -> "Slides"
//            1 -> "Assignments"
//            2 -> "Peoples"
//            else -> null
//        }
//    }
//
//}