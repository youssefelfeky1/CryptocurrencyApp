package com.elfeky.cryptocurrencyapp.data.repository

import com.elfeky.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.elfeky.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.elfeky.cryptocurrencyapp.data.remote.dto.CoinDto
import com.elfeky.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}