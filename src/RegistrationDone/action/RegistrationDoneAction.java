package RegistrationDone.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import BusinessLogic.WebappBean;
import RegistrationDone.form.RegistrationDoneForm;
import dataaccess.TrSellItemsEntity;


public class RegistrationDoneAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) {

		//DBに保存する
		WebappBean bean = new WebappBean();
		TrSellItemsEntity item = new TrSellItemsEntity();
		RegistrationDoneForm rf = (RegistrationDoneForm)form;
		item.setItemName(rf.getItemName());
		item.setPrice(rf.getPrice());
		item.setDescription(rf.getDescription());
		bean.InsertItemData(item);

//		ArrayList<WebappValue> values = new ArrayList<WebappValue>();
//
//		for(int i = 0;i < enList.size();i++)
//		{
//			WebappValue value = new WebappValue();
//			value.setItemName(enList.get(i).getItemName());
//			value.setNum(enList.get(i).getNum());
//			value.setPrice(enList.get(i).getPrice());
//			value.setDescription(enList.get(i).getDescription());
//
//			values.add(value);
//		}

		//req.setAttribute("value", values);

		return (mapping.findForward("registration_done"));

	}
}
