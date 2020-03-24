package businesslogic;


import java.util.ArrayList;

import dao.TrSellItemsEntity;
import dao.TrSellItemsManager;

public class WebappBC {

	public WebappBC(){}

	public ArrayList<TrSellItemsEntity> fetchAllItemData() {

		TrSellItemsManager man = new TrSellItemsManager();
		return man.fetchAllItemData();

	}

	public Boolean InsertItemData(TrSellItemsEntity item) {

		TrSellItemsManager man = new TrSellItemsManager();
		return man.InsertItemData(item);
	}

}
