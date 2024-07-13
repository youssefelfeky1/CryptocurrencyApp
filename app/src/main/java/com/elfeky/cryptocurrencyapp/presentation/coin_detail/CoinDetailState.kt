package com.elfeky.cryptocurrencyapp.presentation.coin_detail


import com.elfeky.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading:Boolean = false,
    val coin: CoinDetail? = null ,
    val error: String = ""
)
