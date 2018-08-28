package com.example.ibrahim.task1

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycle_view.*



class RecycleView : AppCompatActivity() {
    val textList: ArrayList<DataModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)
        addDataOnRecyc()
        recyclerView1.layoutManager = LinearLayoutManager(this)
        val dividerItemDecoration = DividerItemDecoration(recyclerView1.getContext(),
                (recyclerView1.layoutManager as LinearLayoutManager).getOrientation())
        recyclerView1.addItemDecoration(dividerItemDecoration)
        recyclerView1.adapter = AdapterItems(textList , this)
    }

    @SuppressLint("PrivateResource")
    private fun addDataOnRecyc() {
        textList.add(DataModel("Hey",R.drawable.abc_list_focused_holo))
        textList.add(DataModel("Mirza",R.drawable.abc_menu_hardkey_panel_mtrl_mult))
        textList.add(DataModel("Hello",R.drawable.abc_ic_arrow_drop_right_black_24dp))
        textList.add(DataModel("Bala",R.drawable.notification_bg_normal))
        textList.add(DataModel("My",R.drawable.abc_ic_menu_paste_mtrl_am_alpha))
        textList.add(DataModel("Gurujis",R.drawable.abc_ic_menu_cut_mtrl_alpha))
        textList.add(DataModel(";-)",R.drawable.abc_popup_background_mtrl_mult))
        textList.add(DataModel("This",R.drawable.abc_ic_go_search_api_material))
        textList.add(DataModel("Is",R.drawable.abc_textfield_default_mtrl_alpha))
        textList.add(DataModel("Just",R.drawable.notification_bg_normal))
        textList.add(DataModel("For",R.drawable.abc_ic_menu_overflow_material))
        textList.add(DataModel("Testing",R.drawable.abc_ic_star_black_48dp))
        textList.add(DataModel("Purpose",R.drawable.abc_ic_star_half_black_36dp))

    }
}
