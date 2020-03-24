

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import businesslogic.WebappBean;
import dao.TrSellItemsEntity;
import value.WebappValue;

public class LoginAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) {

		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		WebappBean bean = new WebappBean();
		ArrayList<TrSellItemsEntity> enList = new ArrayList<TrSellItemsEntity>();
		enList = bean.fetchAllItemData();

		ArrayList<WebappValue> values = new ArrayList<WebappValue>();

		for (int i = 0; i < enList.size(); i++) {
			WebappValue value = new WebappValue();
			value.setItemName(enList.get(i).getItemName());
			value.setNum(enList.get(i).getNum());
			value.setPrice(enList.get(i).getPrice());
			value.setDescription(enList.get(i).getDescription());

			values.add(value);
		}

		req.setAttribute("value", values);

		return (mapping.findForward("success"));
	}
}
