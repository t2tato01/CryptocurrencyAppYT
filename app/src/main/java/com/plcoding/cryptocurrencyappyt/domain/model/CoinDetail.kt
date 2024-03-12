package com.plcoding.cryptocurrencyappyt.domain.model

import android.service.notification.NotificationListenerService.Ranking
import com.plcoding.cryptocurrencyappyt.data.remote.dto.Team

data class CoinDetail(
    val coinId :String,
    val name : String,
    val description : String,
    val symbol : String,
    val rank : Int,
    val isActive : Boolean,
    val tags : List<String>,
    val team: List<Team>

)
