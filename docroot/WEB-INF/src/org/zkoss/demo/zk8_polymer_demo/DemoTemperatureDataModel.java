package org.zkoss.demo.zk8_polymer_demo;

import java.util.HashMap;
import java.util.Map;

/*import org.zkoss.chart.model.CategoryModel;
import org.zkoss.chart.model.DefaultCategoryModel;*/

public class DemoTemperatureDataModel {
	/*private static final Map<String, CategoryModel> models = new HashMap<String, CategoryModel>();
	private static final CategoryModel model2015222 = new DefaultCategoryModel();
	private static final CategoryModel model2015223 = new DefaultCategoryModel();
	private static final CategoryModel model2015224 = new DefaultCategoryModel();
	private static final CategoryModel model2015225 = new DefaultCategoryModel();
	private static final CategoryModel model2015226 = new DefaultCategoryModel();
	private static final CategoryModel model2015227 = new DefaultCategoryModel();
	private static final CategoryModel model2015228 = new DefaultCategoryModel();*/
	
	static {
		/*model2015222.setValue("New York", "1:00", 1.0);
		model2015222.setValue("New York", "3:00", 1.0);
		model2015222.setValue("New York", "5:00", 0.0);
		model2015222.setValue("New York", "7:00", 0.0);
		model2015222.setValue("New York", "9:00", 1.0);;
		model2015222.setValue("New York", "11:00", 1.0);
		model2015222.setValue("New York", "13:00", 3.0);
		model2015222.setValue("New York", "15:00", 6.0);
		model2015222.setValue("New York", "17:00", 5.0);
		model2015222.setValue("New York", "19:00", 4.0);
		model2015222.setValue("New York", "21:00", 4.0);
		model2015222.setValue("New York", "23:00", 4.0);
		
		model2015223.setValue("New York", "1:00", 3.0);
		model2015223.setValue("New York", "3:00", 1.0);
		model2015223.setValue("New York", "5:00", 1.0);
		model2015223.setValue("New York", "7:00", -2.0);
		model2015223.setValue("New York", "9:00", -6.0);;
		model2015223.setValue("New York", "11:00", -7.0);
		model2015223.setValue("New York", "13:00", -6.0);
		model2015223.setValue("New York", "15:00", -5.0);
		model2015223.setValue("New York", "17:00", -7.0);
		model2015223.setValue("New York", "19:00", -9.0);
		model2015223.setValue("New York", "21:00", -12.0);
		model2015223.setValue("New York", "23:00", -13.0);
		
		model2015224.setValue("New York", "1:00", -14.0);
		model2015224.setValue("New York", "3:00", -14.0);
		model2015224.setValue("New York", "5:00", -15.0);
		model2015224.setValue("New York", "7:00", -14.0);
		model2015224.setValue("New York", "9:00", -12.0);
		model2015224.setValue("New York", "11:00", -8.0);
		model2015224.setValue("New York", "13:00", -7.0);
		model2015224.setValue("New York", "15:00", -6.0);
		model2015224.setValue("New York", "17:00", -6.0);
		model2015224.setValue("New York", "19:00", -4.0);
		model2015224.setValue("New York", "21:00", -4.0);
		model2015224.setValue("New York", "23:00", -5.0);
		
		model2015225.setValue("New York", "1:00", -5.0);
		model2015225.setValue("New York", "3:00", -6.0);
		model2015225.setValue("New York", "5:00", -6.0);
		model2015225.setValue("New York", "7:00", -6.0);
		model2015225.setValue("New York", "9:00", -2.0);
		model2015225.setValue("New York", "11:00", 1.0);
		model2015225.setValue("New York", "13:00", 2.0);
		model2015225.setValue("New York", "15:00", 3.0);
		model2015225.setValue("New York", "17:00", 2.0);
		model2015225.setValue("New York", "19:00", 1.0);
		model2015225.setValue("New York", "21:00", 1.0);
		model2015225.setValue("New York", "23:00", 0.0);
		
		model2015226.setValue("New York", "1:00", -2.0);
		model2015226.setValue("New York", "3:00", -4.0);
		model2015226.setValue("New York", "5:00", -6.0);
		model2015226.setValue("New York", "7:00", -6.0);
		model2015226.setValue("New York", "9:00", -5.0);
		model2015226.setValue("New York", "11:00", -4.0);
		model2015226.setValue("New York", "13:00", -4.0);
		model2015226.setValue("New York", "15:00", -3.0);
		model2015226.setValue("New York", "17:00", -3.0);
		model2015226.setValue("New York", "19:00", -4.0);
		model2015226.setValue("New York", "21:00", -5.0);
		model2015226.setValue("New York", "23:00", -6.0);
		
		model2015227.setValue("New York", "1:00", -6.0);
		model2015227.setValue("New York", "3:00", -7.0);
		model2015227.setValue("New York", "5:00", -7.0);
		model2015227.setValue("New York", "7:00", -8.0);
		model2015227.setValue("New York", "9:00", -7.0);
		model2015227.setValue("New York", "11:00", -2.0);
		model2015227.setValue("New York", "13:00", -3.0);
		model2015227.setValue("New York", "15:00", -1.0);
		model2015227.setValue("New York", "17:00", -2.0);
		model2015227.setValue("New York", "19:00", -3.0);
		model2015227.setValue("New York", "21:00", -4.0);
		model2015227.setValue("New York", "23:00", -6.0);
		
		model2015228.setValue("New York", "1:00", -7.0);
		model2015228.setValue("New York", "3:00", -9.0);
		model2015228.setValue("New York", "5:00", -10.0);
		model2015228.setValue("New York", "7:00", -10.0);
		model2015228.setValue("New York", "9:00", -8.0);
		model2015228.setValue("New York", "11:00", -5.0);
		model2015228.setValue("New York", "13:00", -4.0);
		model2015228.setValue("New York", "15:00", -2.0);
		model2015228.setValue("New York", "17:00", -2.0);
		model2015228.setValue("New York", "19:00", -2.0);
		model2015228.setValue("New York", "21:00", -2.0);
		model2015228.setValue("New York", "23:00", -3.0);
		
		models.put("2015222", model2015222);
		models.put("2015223", model2015223);
		models.put("2015224", model2015224);
		models.put("2015225", model2015225);
		models.put("2015226", model2015226);
		models.put("2015227", model2015227);
		models.put("2015228", model2015228);*/
	}
	
	/*public static CategoryModel getModelByDate(String date) {
		CategoryModel result = models.get(date);
		return result == null ? new DefaultCategoryModel() : result;
	}*/
}
