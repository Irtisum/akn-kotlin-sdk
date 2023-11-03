package com.akaun.kt.sdk.models.dbschema

import com.akaun.kt.sdk.models.dbschema.intermediate.BatchNo
import com.akaun.kt.sdk.models.dbschema.intermediate.BinNo
import com.akaun.kt.sdk.models.dbschema.intermediate.DeliveryOption
import com.akaun.kt.sdk.models.dbschema.intermediate.EntityJson
import com.akaun.kt.sdk.models.dbschema.intermediate.LogJson
import com.akaun.kt.sdk.models.dbschema.intermediate.ItemPropertyJson
import com.akaun.kt.sdk.models.dbschema.intermediate.LinePropertyJson
import com.akaun.kt.sdk.models.dbschema.intermediate.SerialNo

data class bl_fi_generic_doc_line(
    var acl_config: Any? = null,
    var acl_policy: Any? = null,
    var amount_cogs: Any? = null,
    var amount_discount: Int? = null,
    var amount_json: Any? = null,
    var amount_net: Double? = null,
    var amount_open_balance: Any? = null,
    var amount_signum: Int? = null,
    var amount_std: Double? = null,
    var amount_tax_gst: Double? = null,
    var amount_tax_wht: Double? = null,
    var amount_txn: Double? = null,
    var applet_guid: Any? = null,
    var apt_amount_txn: Any? = null,
    var apt_amt_discount: Any? = null,
    var apt_weight_disc: Any? = null,
    var arap_pns_amount: Int? = null,
    var arap_stlm_amount: Int? = null,
    var base_doc_line_ccy: Any? = null,
    var base_doc_line_guid: Any? = null,
    var base_doc_line_xrate: Any? = null,
    var batch_no: BatchNo? = null,
    var bin_no: BinNo? = null,
    var cfg_delivery: Any? = null,
    var cfg_production: Any? = null,
    var client_data_source: Any? = null,
    var client_doc_status_01: Any? = null,
    var client_doc_status_02: Any? = null,
    var client_doc_status_03: Any? = null,
    var client_doc_status_04: Any? = null,
    var client_doc_status_05: Any? = null,
    var client_doc_type: String? = null,
    var client_hashed_value: Any? = null,
    var client_item_code: Any? = null,
    var client_item_guid: Any? = null,
    var client_key: String? = null,
    var client_so_item_pkid: Any? = null,
    var client_source: String? = null,
    var client_value: Any? = null,
    var consignment_logic: Any? = null,
    var cost_fifo_amount: Any? = null,
    var cost_fifo_price: Any? = null,
    var cost_last_purchase_company: Any? = null,
    var cost_last_purchase_location: Any? = null,
    var cost_lifo_amount: Any? = null,
    var cost_lifo_price: Any? = null,
    var cost_ma_amount: Double? = null,
    var cost_ma_price: Double? = null,
    var cost_manual_amount: Any? = null,
    var cost_manual_price: Any? = null,
    var cost_replacement_amount: Any? = null,
    var cost_replacement_price: Any? = null,
    var cost_wa_amount: Any? = null,
    var cost_wa_price: Any? = null,
    var coupon_hdr_guid: Any? = null,
    var coupon_line_guid: Any? = null,
    var coupon_line_guid_json: Any? = null,
    var created_by_subject_guid: String? = null,
    var created_date: String? = null,
    var date_txn: String? = null,
    var del_region_hdr_guid: Any? = null,
    var del_region_hdr_reg_code: Any? = null,
    var del_region_hdr_state: Any? = null,
    var delivery_branch_code: Any? = null,
    var delivery_branch_guid: Any? = null,
    var delivery_location_code: Any? = null,
    var delivery_location_guid: Any? = null,
    var delivery_option: DeliveryOption? = null,
    var delivery_process_hdr_guid: Any? = null,
    var delivery_process_resolution_code: Any? = null,
    var delivery_process_resolution_guid: Any? = null,
    var delivery_process_status_guid: Any? = null,
    var delivery_process_status_name: Any? = null,
    var delivery_required: Any? = null,
    var delta_price1_excl_tax: Int? = null,
    var delta_price2_excl_tax: Int? = null,
    var delta_price3_excl_tax: Int? = null,
    var discount_detail_method: Any? = null,
    var discount_detail_promo_code: Any? = null,
    var discount_detail_value: Int? = null,
    var display_option: Any? = null,
    var doc_ccy: Any? = null,
    var entity_branch_hdr_guid: Any? = null,
    var entity_fi_item_link_guid: Any? = null,
    var entity_hdr_guid: Any? = null,
    var entity_inv_item_link_guid: Any? = null,
    var entity_json: EntityJson? = null,
    var entity_line_guid: Any? = null,
    var far_hdr_guid: Any? = null,
    var finance_charge_amount: Int? = null,
    var foreign_ccy: Any? = null,
    var generic_doc_hdr_guid: String? = null,
    var guid: String? = null,
    var guid_branch: String? = null,
    var guid_comp: String? = null,
    var guid_dimension: Any? = null,
    var guid_glcode: Any? = null,
    var guid_parent: Any? = null,
    var guid_profit_center: Any? = null,
    var guid_project: Any? = null,
    var guid_segment: Any? = null,
    var guid_store: String? = null,
    var guid_store_2: String? = null,
    var intercompany_hdr_guid: Any? = null,
    var intercompany_line_guid: Any? = null,
    var is_synced: Boolean? = null,
    var item_child_json: Any? = null,
    var item_code: String? = null,
    var item_custom_data_json: Any? = null,
    var item_custom_template_json: Any? = null,
    var item_desc: Any? = null,
    var item_guid: String? = null,
    var item_machine_code: Any? = null,
    var item_name: String? = null,
    var item_property_json: ItemPropertyJson? = null,
    var item_reference_no: Any? = null,
    var item_remarks: String? = null,
    var item_sub_type: String? = null,
    var item_to_item_link_json: Any? = null,
    var item_txn_type: String? = null,
    var label_json: Any? = null,
    var landed_cost_fifo_amount: Any? = null,
    var landed_cost_fifo_price: Any? = null,
    var landed_cost_lifo_amount: Any? = null,
    var landed_cost_lifo_price: Any? = null,
    var landed_cost_ma_amount: String? = null,
    var landed_cost_ma_price: String? = null,
    var landed_cost_wa_amount: Any? = null,
    var landed_cost_wa_price: Any? = null,
    var landed_txn_amount: Any? = null,
    var landed_txn_price: Any? = null,
    var line_bundle_guid: Any? = null,
    var line_option_json: Any? = null,
    var line_property_json: LinePropertyJson? = null,
    var log_json: LogJson? = null,
    var membership_ext_start_date: Any? = null,
    var module_guid: Any? = null,
    var multi_level_disc_json: Any? = null,
    var namespace: Any? = null,
    var parent_fi_item_guid: Any? = null,
    var payment_channel_name: Any? = null,
    var pick_pack_queue: Boolean? = null,
    var pickup_branch_guid: Any? = null,
    var point_amount: Any? = null,
    var point_currency: Any? = null,
    var point_end_date: Any? = null,
    var point_start_date: Any? = null,
    var point_type: Any? = null,
    var position_id: Any? = null,
    var posting_bundle: Any? = null,
    var posting_fulfillment: Any? = null,
    var posting_mto: Any? = null,
    var pricing_scheme_link_guid: Any? = null,
    var purchase_max_price_excl_tax: Int? = null,
    var purchase_min_price_excl_tax: Int? = null,
    var purchase_selling_list_price_incl_tax: Any? = null,
    var qty_by_uom: Double? = null,
    var qty_open: Any? = null,
    var qty_reserve_adj: Any? = null,
    var quantity_base: Double? = null,
    var quantity_signum: Double? = null,
    var ready_to_ship: Any? = null,
    var rebate_price1_excl_tax: Int? = null,
    var rebate_price2_excl_tax: Int? = null,
    var rebate_price3_excl_tax: Int? = null,
    var ref_price1_excl_tax: Int? = null,
    var ref_price2_excl_tax: Int? = null,
    var ref_price3_excl_tax: Int? = null,
    var reference_no: Any? = null,
    var replacement_unit_price_excl_tax: Int? = null,
    var revision: String? = null,
    var sales_max_price_excl_tax: Int? = null,
    var sales_min_price_excl_tax: Int? = null,
    var serial_no: SerialNo? = null,
    var server_doc_type: String? = null,
    var sort_code: Any? = null,
    var status: String? = null,
    var t2t_doc_hdr_guid: Any? = null,
    var t2t_doc_line_guid: Any? = null,
    var t2t_other_fi_item_code: Any? = null,
    var t2t_other_fi_item_guid: Any? = null,
    var t2t_tenant_guid: Any? = null,
    var tax_gst_code: String? = null,
    var tax_gst_rate: Double? = null,
    var tax_gst_type: Any? = null,
    var tax_industry_code: Any? = null,
    var tax_tariff_code: Any? = null,
    var tax_wht_code: String? = null,
    var tax_wht_rate: Double? = null,
    var tax_wht_type: Any? = null,
    var track_delivery_date_requested: Any? = null,
    var track_delivery_guid: Any? = null,
    var track_delivery_id: Any? = null,
    var track_delivery_logic: Any? = null,
    var track_delivery_pic_contact: Any? = null,
    var track_delivery_pic_name: Any? = null,
    var track_delivery_remarks: Any? = null,
    var track_delivery_status: Any? = null,
    var track_delivery_table: Any? = null,
    var track_delivery_time_actual: Any? = null,
    var track_delivery_time_estimated: Any? = null,
    var track_delivery_time_planned: Any? = null,
    var track_production_guid: Any? = null,
    var track_production_id: Any? = null,
    var track_production_logic: Any? = null,
    var track_production_pic_contact: Any? = null,
    var track_production_pic_name: Any? = null,
    var track_production_remarks: Any? = null,
    var track_production_status: Any? = null,
    var track_production_table: Any? = null,
    var track_production_time_actual: Any? = null,
    var track_production_time_estimated: Any? = null,
    var track_production_time_planned: Any? = null,
    var tracking_id: String? = null,
    var txn_code: Any? = null,
    var txn_type: String? = null,
    var unit_disc_by_uom: Int? = null,
    var unit_discount: Any? = null,
    var unit_discount_with_tax: Any? = null,
    var unit_price_by_uom: Any? = null,
    var unit_price_net: Double? = null,
    var unit_price_std: Double? = null,
    var unit_price_std_by_uom: Double? = null,
    var unit_price_std_by_uom_with_tax: Any? = null,
    var unit_price_std_with_tax: Any? = null,
    var unit_price_txn: Double? = null,
    var unit_price_txn_by_uom: Double? = null,
    var uom: String? = null,
    var uom_json: Any? = null,
    var uom_to_base_ratio: Double? = null,
    var updated_by_subject_guid: String? = null,
    var updated_date: String? = null,
    var vrsn: Any? = null,
    var wf_process_hdr_guid: Any? = null,
    var wf_process_status_code: Any? = null,
    var wf_process_status_guid: Any? = null,
    var wf_resolution_code: Any? = null,
    var wf_resolution_guid: Any? = null
)