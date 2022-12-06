package org.example.drawer;

import org.example.model.EmployeeModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;

import javax.swing.*;
import java.util.List;


public class BarChartDrawer extends JFrame {
    public BarChartDrawer(String title, List<EmployeeModel> employeeList) {
        super(title);
    }

    public static JPanel createEmployeesByTeamsPanel(List<EmployeeModel> employeeList)
    {
        JFreeChart chart = createBarChart(...);
        return new ChartPanel(chart);
    }

    private static JFreeChart createBarChart(CategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(...);
        return chart;
    }
}