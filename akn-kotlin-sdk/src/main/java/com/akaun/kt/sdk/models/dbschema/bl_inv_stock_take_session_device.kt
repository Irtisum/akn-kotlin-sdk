package com.akaun.kt.sdk.models.dbschema

data class bl_inv_stock_take_session_device(
    var guid: String? = null,
    var session_guid: String? = null,
    var login_guid: String? = null,
    var status: String? = null,
    var revision: String? = null,
    var vrsn: String? = null,
    var device_guid: String? = null,
    var created_date: String? = null,
    var updated_date: String? = null,
    var created_by_subject_guid: String? = null,
    var updated_by_subject_guid: String? = null,
    var lastupdated_date: String? = null
)