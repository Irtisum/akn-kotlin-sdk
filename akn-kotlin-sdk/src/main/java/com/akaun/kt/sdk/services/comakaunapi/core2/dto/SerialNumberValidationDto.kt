package com.akaun.kt.sdk.services.comakaunapi.core2.dto

import com.akaun.kt.sdk.models.aggregates.erp.serialnumber.SerialNumberStatus

data class SerialNumberValidationDto(
    var txn_type: String? = null,
    var location_guid: String? = null,
    var company_guid: String? = null,
    var inv_item_guid: String? = null,
    var serialNumbers: Set<SerialNumberStatus>? = null,
    var serialNumberList: Set<String>? = null,
    var fi_item_guid: String? = null,
    var server_doc_type: String? = null,
    var checkDraftLock: Boolean? = null,
    var editMode: Boolean? = null,
    var generic_doc_hdr_guid: String? = null,
)