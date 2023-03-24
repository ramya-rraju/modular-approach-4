package com.freshworks.modular.crs;

import org.springframework.stereotype.Component;

@Component
class CRSService {

    String getService() {
        return "Welcome to CRS..!! (Approach-4)";
    }

}

/* In this approach if child packages created, then it cannot be accessed using the private modifier
 */