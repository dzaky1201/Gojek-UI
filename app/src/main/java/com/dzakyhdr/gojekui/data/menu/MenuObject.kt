package com.dzakyhdr.gojekui.data.menu

import com.dzakyhdr.gojekui.R


object MenuObject {
    private val title = arrayOf(
        "GoRide",
        "GoMart",
        "GoCar",
        "GoPulsa",
        "GoFood",
        "Check In",
        "GoSend",
        "More",
    )

    private val logo = intArrayOf(
        R.drawable.goride_icon,
        R.drawable.gomart_icon,
        R.drawable.gocar_icon,
        R.drawable.gopulsa_icon,
        R.drawable.gofood_icon,
        R.drawable.checkin_icon,
        R.drawable.gosend_icon,
        R.drawable.more_icon

    )

    val list: ArrayList<Menu>
        get() {
            val list = arrayListOf<Menu>()
            for (position in title.indices) {
                val menu = Menu()
                menu.title = title[position]
                menu.logo = logo[position]
                list.add(menu)
            }
            return list
        }
}