package com.elfeky.cryptocurrencyapp.domain.repository

import com.elfeky.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.elfeky.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}