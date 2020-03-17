package BusinessLogic;

import java.util.ArrayList;

import dataaccess.WebappEntity;
import dataaccess.WebappManager;

public class WebappBC {


	public ArrayList<WebappEntity> fetchAllItemData() {

		WebappManager man = new WebappManager();
		return man.fetchAllItemData();

	}

}
