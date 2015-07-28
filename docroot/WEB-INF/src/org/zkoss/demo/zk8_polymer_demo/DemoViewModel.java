package org.zkoss.demo.zk8_polymer_demo;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
/*import org.zkoss.chart.model.CategoryModel;*/

public class DemoViewModel {
	
	//private CategoryModel _chartModel;
	private String _chartTitle;
	
	@Command
	@NotifyChange("chartModel")
	public void doDateSelected(@BindingParam("date") String date, 
		@BindingParam("month") String month, @BindingParam("year") String year) {
		String selDate = year + month + date;
		/*_chartModel = DemoTemperatureDataModel.getModelByDate(selDate);*/
	}
	
	/*public CategoryModel getChartModel() {
		return _chartModel;
	}*/
	
	public String getChartTitle() {
		return _chartTitle;
	}
}
