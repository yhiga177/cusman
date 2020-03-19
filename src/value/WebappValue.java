package value;

public class WebappValue {

	int			num;
	String 		itemName;
	int  		price;
	String 		description;

	String		message;


	public WebappValue(){

		num = 0;
		itemName = "";
		price = 0;
		description = "";
		message = "";
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


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}






}
