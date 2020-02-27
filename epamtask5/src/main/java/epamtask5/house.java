package epamtask5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class house {
	private static final Logger LOGGER=LogManager.getLogger(house.class);
	public static double standardmaterials(String Standardmaterial,double area) {
		LOGGER.info("entered into The area of construction");
		if(Standardmaterial=="Standardmaterial")
		return area*1200;
		return 0;
	}
	public static double abovestandardmaterial(String Standardmaterial,double area) {
		LOGGER.info("entered into The area of construction");
		if(Standardmaterial=="abovestandardmaterial") {
			return area*1500;
		}
		return 0;
	}
	public static double highstandardmaterial(String Standardmaterial,double area) {
		LOGGER.info("entered into The area of construction");
		if(Standardmaterial=="highstandardmaterial")
			return area*1800;
		return 0;

	}
	public static double standard_material_and_fullyautomated_home(String Standard_material,double area) {
		LOGGER.info("entered into The area of construction");
		return area*2500;
	}
}
