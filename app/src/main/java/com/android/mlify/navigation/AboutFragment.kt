package com.android.mlify.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.mlify.R
import com.android.mlify.adapter.AboutAdapter
import com.android.mlify.databinding.FragmentAboutBinding


class AboutFragment : Fragment(R.layout.fragment_about) {

    var devList = ArrayList<String>()
    var devEmailList = ArrayList<String>()
    var devRoll = ArrayList<String>()
    var devReg = ArrayList<String>()

    lateinit var useradapter: AboutAdapter
    lateinit var recyclerView: RecyclerView


    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAboutBinding.bind(view)

        devList.add(0,"Avinash Kumar")
        devList.add(1,"Aditya Kumar Sinha")
        devList.add(2,"Aman Raj")
        devList.add(3,"Srijan Sourav")
        devList.add(4,"Abhishek Kumar Singh")
        devList.add(5,"Shivam Kumar")

        devRoll.add(0,"Roll No : 191041")
        devRoll.add(1,"Roll No : 191042")
        devRoll.add(2,"Roll No : 191038")
        devRoll.add(3,"Roll No : 191020")
        devRoll.add(4,"Roll No : 191012")
        devRoll.add(5,"Roll No : 191018")

        devReg.add(0,"Reg No : 19105103001")
        devReg.add(1,"Reg No : 19105103049")
        devReg.add(2,"Reg No : 19105103038")
        devReg.add(3,"Reg No : 19105103044")
        devReg.add(4,"Reg No : 19105103037")
        devReg.add(5,"Reg No : 19105103029")

        devEmailList.add(0,"avinashbest3@gmail.com")
        devEmailList.add(1,"adityakumarsinha0000@gmail.com")
        devEmailList.add(2,"jemescollin1@gmail.com")
        devEmailList.add(3,"souravsrijan@gmail.com")
        devEmailList.add(4,"rajputabhisheksingh53@gmail.com")
        devEmailList.add(5,"shivam09082000@gmail.com")



        binding.aboutRV.layoutManager = LinearLayoutManager(context)


        recyclerView= binding.aboutRV
        recyclerView.layoutManager= LinearLayoutManager(context)
        useradapter = AboutAdapter()
        binding.aboutRV.adapter = useradapter

        showlist()

        setupListener()
        inflateViews()
    }

    private fun showlist() {
        useradapter.updateDevList(devList,devRoll,devReg,devEmailList)
    }


    private fun inflateViews() {
//        TODO("Not yet implemented")
    }

    private fun setupListener() {
//        TODO("Not yet implemented")
    }

}