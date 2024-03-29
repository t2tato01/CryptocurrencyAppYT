package com.plcoding.cryptocurrencyappyt.data.remote
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET( "/v1/coins")
    suspend fun getCoins() : List<CoinDto>

    @GET("/v1/coins/{coinID}")
    suspend fun getCoinById(@Path("coinId") coinID : String):CoinDetailDto

}