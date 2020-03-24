package dataaccess;

public class TrSellItemsEntity {

	int num;
	String itemName;
	int price;
	String description;

	public TrSellItemsEntity() {

		num = 0;
		itemName = "";
		price = 0;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
