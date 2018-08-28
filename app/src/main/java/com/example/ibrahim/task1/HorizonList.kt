package com.example.ibrahim.task1

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_horizon_scroll.*

class HorizonList : AppCompatActivity() {
    val textList: ArrayList<DataModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horizon_scroll)

             addDataOnRecyc()
        Log.d("HorizontalList", "${textList.size} total")
            recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

            val dividerItemDecoration = DividerItemDecoration(recyclerView2.getContext(),
                    (recyclerView2.layoutManager as LinearLayoutManager).getOrientation())
            recyclerView2.addItemDecoration(dividerItemDecoration)
            recyclerView2.adapter = AdapterItems(textList , this)


        }


        @SuppressLint("PrivateResource")
        private fun addDataOnRecyc() {
            with(textList){
                add(DataModel("Hey",R.drawable.abc_list_focused_holo))
                add(DataModel("Mirza",R.drawable.abc_menu_hardkey_panel_mtrl_mult))
                add(DataModel("Hello",R.drawable.abc_ic_arrow_drop_right_black_24dp))
                add(DataModel("Bala",R.drawable.notification_bg_normal))
                add(DataModel("My",R.drawable.abc_ic_menu_paste_mtrl_am_alpha))
                add(DataModel("Gurujis",R.drawable.abc_ic_menu_cut_mtrl_alpha))
                add(DataModel(";-)",R.drawable.abc_popup_background_mtrl_mult))
                add(DataModel("This",R.drawable.abc_ic_go_search_api_material))
                add(DataModel("Is",R.drawable.abc_textfield_default_mtrl_alpha))
                add(DataModel("Just",R.drawable.notification_bg_normal))
                add(DataModel("For",R.drawable.abc_ic_menu_overflow_material))
                add(DataModel("Testing",R.drawable.abc_ic_star_black_48dp))
                add(DataModel("Purpose",R.drawable.abc_ic_star_half_black_36dp))
            }


        }
    }
