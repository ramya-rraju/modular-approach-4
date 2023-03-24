package com.freshworks.modular.crs;

//import com.modular.freshworks.tfs.TFSService;
//import com.freshworks.modular.crs.services.CRSService2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
class CRSController {

    private CRSService crsService;
//    private CRSService2 crsService2;

    CRSController(CRSService crsService) {
        this.crsService = crsService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/crs")
    String crs() {
        return crsService.getService();
    }

}


//public class CRSController {
//
//    private CRSService crsService;
//    private TFSService tfsService;
//
//    CRSController(CRSService crsService, TFSService tfsService) {
//        this.crsService = crsService;
//        this.tfsService = tfsService;
//    }
//
//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping(value = "/crs")
//    public String crs() {
//        System.out.println(tfsService.getService());
//        return crsService.getService();
//    }
//
//}
