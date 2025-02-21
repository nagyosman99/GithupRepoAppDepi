package com.nagy.githuprepoapp.ui.theme.Screens.RepoDetialsSc.Component

import androidx.annotation.DrawableRes

data class RepoData(
    @DrawableRes val logo:Int,
    val name:String,
    val owner:String,
    val description:String,
    val stars:Int


)
