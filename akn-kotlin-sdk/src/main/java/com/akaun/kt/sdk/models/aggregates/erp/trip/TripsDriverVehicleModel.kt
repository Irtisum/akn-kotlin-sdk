
package com.akaun.kt.sdk.models.aggregates.erp.trip

import com.akaun.kt.sdk.models.dbschema.bl_del_driver_hdr
import com.akaun.kt.app.delivery.driverapp.model.trip.bl_del_driver_vehicle_link
import com.akaun.kt.sdk.models.dbschema.bl_del_region_hdr
import com.akaun.kt.sdk.models.dbschema.bl_del_trip_ext
import com.akaun.kt.sdk.models.dbschema.bl_del_trip_hdr
import com.akaun.kt.sdk.models.dbschema.bl_del_vehicle_hdr

data class TripsDriverVehicleModel(
    val bl_del_driver_hdr: List<bl_del_driver_hdr>,
    val bl_del_driver_vehicle_link: List<bl_del_driver_vehicle_link>,
    val bl_del_region_hdr: bl_del_region_hdr,
    val bl_del_trip_ext: List<bl_del_trip_ext>,
    val bl_del_trip_hdr: bl_del_trip_hdr,
    val bl_del_vehicle_hdr: bl_del_vehicle_hdr
)