package com.fullStructure.Rest_API_by_tarun.controller;

import com.fullStructure.Rest_API_by_tarun.model.cloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class cloudVendorAPIService {

    cloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public cloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody cloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Create Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody cloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Update Successfully";
    }

    @DeleteMapping("{vendorId}")  // id dekar delete krna
    public String DeleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor = null;
        return "Cloud Vendor Delete Successfully";
    }

}
