package com.freshworks.modular.crs.services;

import org.springframework.stereotype.Component;

@Component
class CRSService2 {

    String getService() {
        return "Welcome to CRS..!! Inside Service Package (Approach-4)";
    }

}

/* In this approach if child packages created, then it cannot be accessed using the private modifier
 */