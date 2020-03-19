package BusinessLogic;

import java.util.ArrayList;

import dataaccess.TrSellItemsEntity;

public class WebappBean {


	public ArrayList<TrSellItemsEntity> fetchAllItemData() {


		WebappBC bc = new WebappBC();
		return bc.fetchAllItemData();

	}
	
	public Boolean InsertItemData(TrSellItemsEntity item) {
		
		WebappBC bc = new WebappBC();
		return bc.InsertItemData(item);
	}
	
	

}
