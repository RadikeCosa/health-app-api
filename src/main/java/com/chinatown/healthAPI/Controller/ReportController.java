package com.chinatown.healthAPI.Controller;

import com.chinatown.healthAPI.Model.Report;
import com.chinatown.healthAPI.Service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })
public class ReportController {

    @Autowired
    private IReportService iReportService;

    @GetMapping("api/v1/reports")
    public List<Report> getReports() {
        return iReportService.getReports();
    }

    @PostMapping("api/v1/reports")
    public String createReport(@RequestBody Report report){
        iReportService.saveReport(report);
        return  "el reporte fue debidamente registrado";
    }

    @DeleteMapping("api/v1/reports/{id}")
    public String deleteReport (@PathVariable Long id){
        iReportService.deleteReport(id);
        return "el reporte fue eliminado para siempre";
    }
}
