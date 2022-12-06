package org.example.mapper;

import org.example.model.EmployeeModel;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import java.util.List;

public class ChartDataMapper {

    public static PieDataset createPlayerByTeamsDataset(List<EmployeeModel> employee) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        // todo пиши тут
        return dataset;
    }

    public static CategoryDataset createFollowersDataset(List<EmployeeModel> employee) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // todo пиши тут
        return dataset;
    }
}
