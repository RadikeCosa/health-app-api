package com.chinatown.healthAPI.Service;

import com.chinatown.healthAPI.Model.Report;

import java.util.List;

public interface IReportService {

    public List<Report> getReports ();

    public void saveReport (Report report);

    public void deleteReport(Long id);

    public Report findReport (Long id);
}
