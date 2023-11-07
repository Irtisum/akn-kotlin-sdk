package com.akaun.kt.sdk.models.dbschema


data class bl_del_job_docline_link(
    val guid: String? = null,
    val guid_doc_hdr: String? = null,
    val namespace: String? = null,
    val module_guid: String? = null,
    val applet_guid: String? = null,
    val guid_generic_doc_line: String? = null,
    val guid_job_hdr: String? = null,
    val guid_dochdr_link: String? = null,
    val guid_inv_item_hdr: String? = null,
    val guid_fi_item_hdr: String? = null,
    val item_code: String? = null,
    val item_name: String? = null,
    val recipient_name: String? = null,
    val id_recipient: String? = null,
    val recipient_contact: String? = null,
    val proof_of_received: String? = null,
    val quantity: String? = null,
    val qty_to_deliver: String? = null,
    val qty_delivered: String? = null,
    val installation_duration_minute: Integer? = null,
    val delivery_status: String? = null,
    val delivery_logic: String? = null,
    val process_hdr_guid: String? = null,
    val process_status_guid: String? = null,
    val process_status_name: String? = null,
    val process_resolution_guid: String? = null,
    val process_resolution_code: String? = null,
    val obj_type: String? = null,
    val status: String? = null,
    val revision: String? = null,
    val vrsn: String? = null,
    val created_date: String? = null,
    val updated_date: String? = null,
    val created_by_subject_guid: String? = null,
    val updated_by_subject_guid: String? = null,
    val pkg_no_of_parts: String? = null,
    val proof_rct_name: String? = null,
    val proof_rct_id: String? = null,
    val proof_rct_phone: String? = null,
    val proof_rct_remarks: String? = null,
    val collection_amount: String? = null,
    val reason: String? = null,
    val item_type: String? = null,
    val item_subtype: String? = null,
    val sales_invoice_hdr_guid: String? = null,
    val sales_invoice_line_guid: String? = null,
    val sales_invoice_process_status: String? = null,
    val serial_no_json: String? = null,
    val batch_no_json: String? = null,
    val bin_no_json: String? = null
)