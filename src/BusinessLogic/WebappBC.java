package BusinessLogic;


import java.util.ArrayList;

import dataaccess.TrSellItemsEntity;
import dataaccess.TrSellItemsManager;

public class WebappBC {


	public ArrayList<TrSellItemsEntity> fetchAllItemData() {

		TrSellItemsManager man = new TrSellItemsManager();
		return man.fetchAllItemData();

	}

	public Boolean InsertItemData(TrSellItemsEntity item) {

		TrSellItemsManager man = new TrSellItemsManager();
		return man.InsertItemData(item);
	}

}
