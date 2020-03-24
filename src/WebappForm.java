
import org.apache.struts.action.ActionForm;

/**
 * 商品情報格納用Formクラス
 * @author yhiga
 */
public class WebappForm extends ActionForm {

	/**
	 * 商品ID
	 */
	private int num;

	/**
	 * 商品名
	 */
	private String itemName;

	/**
	 * 価格
	 */
	private String price;

	/**
	 * 商品の説明
	 */
	private String description;

	/**
	 * エラーメッセージ
	 */
	private String message;

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
