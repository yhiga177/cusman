package businesslogic;

import java.util.ArrayList;

import dao.TrSellItemsEntity;

public class WebappBean {

	public WebappBean(){}

	/**
	 * 商品一覧抽出用データ
	 * @author yhiga
	 * @return ArrayList<TrSellItemsEntity>
	 */
	public ArrayList<TrSellItemsEntity> fetchAllItemData() {

		WebappBC bc = new WebappBC();
		return bc.fetchAllItemData();
	}

	public Boolean InsertItemData(TrSellItemsEntity item) {

		WebappBC bc = new WebappBC();
		return bc.InsertItemData(item);
	}



}
