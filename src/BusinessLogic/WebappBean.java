package BusinessLogic;

import java.util.ArrayList;

import dataaccess.WebappEntity;

public class WebappBean {


	public ArrayList<WebappEntity> fetchAllItemData() {


		WebappBC bc = new WebappBC();
		return bc.fetchAllItemData();

	}

}
