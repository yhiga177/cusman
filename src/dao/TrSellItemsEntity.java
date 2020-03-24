package dao;


public class TrSellItemsEntity {

	int num;
	String itemName;
	String price;
	String description;

	public TrSellItemsEntity() {

		num = 0;
		itemName = "";
		price = "";
		description = "";

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
