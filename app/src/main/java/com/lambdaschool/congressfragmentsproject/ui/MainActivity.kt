package com.lambdaschool.congressfragmentsproject.ui

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lambdaschool.congressfragmentsproject.R
import com.lambdaschool.congressfragmentsproject.api.CongressDao
import com.lambdaschool.congressfragmentsproject.api.CongresspersonDetails
import com.lambdaschool.congressfragmentsproject.api.CongresspersonOverview
import com.lambdaschool.congressfragmentsproject.fragment.CongresspersonOverviewFragment
import kotlinx.android.synthetic.main.fragment_congresspersonoverview_list.*
import java.util.ArrayList

class MainActivity : AppCompatActivity(), CongresspersonOverviewFragment.OnListFragmentInteractionListener {
    override fun onListFragmentInteraction(item: CongresspersonOverview) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get an overview list for all members of congress
        //val allMembers: ArrayList<CongresspersonOverview> = CongressDao.allMembers

        // get details for a single member of congress
        //val singleMemberDetails: CongresspersonDetails? = allMembers[0].id?.let { CongressDao.getMemberDetails(it) }

        // get congressperson portrait
        //val image: Bitmap? = allMembers[0].id?.let { CongressDao.getImage(it) }
    }
}
