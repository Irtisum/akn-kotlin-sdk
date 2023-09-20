package com.akaun.kt.sdk.models.aggregates.erp.stock

import com.akaun.kt.sdk.models.dbschema.bl_inv_stock_take_session_ext
import com.akaun.kt.sdk.models.dbschema.bl_inv_stock_take_session_hdr

data class StockTakeSessionHeaderModel(
    val bl_inv_stock_take_session_hdr: bl_inv_stock_take_session_hdr = bl_inv_stock_take_session_hdr(),
    val bl_inv_stock_take_session_exts: List<bl_inv_stock_take_session_ext> = emptyList()
)