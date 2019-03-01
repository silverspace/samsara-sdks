package com.prokarma.pkmst.cucumber.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ExecuteReport {

  public static void main(String[] args) {
    generateReport();
  }

  private static void generateReport() {
    String buildNumber = "1";
    String projectName = "Spring-micro-sample";
    boolean runWithJenkins = false;
    boolean parallelTesting = false;

    File reportOutputDirectory = null;
    List<String> jsonFiles = null;
    Configuration configuration = null;
    ReportBuilder reportBuilder = null;
    reportOutputDirectory = new File("./report/Fleet-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Fleet-report-json/Fleet.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/Industrial-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Industrial-report-json/Industrial.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/Sensors-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Sensors-report-json/Sensors.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/Assets-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Assets-report-json/Assets.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/Safety-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Safety-report-json/Safety.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/Users-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Users-report-json/Users.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();

  }
}