

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import businesslogic.WebappBean;
import dao.TrSellItemsEntity;

public class RegistrationDoneAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) {

		WebappBean bean = new WebappBean();
		TrSellItemsEntity item = new TrSellItemsEntity();
		WebappForm rf = (WebappForm) form;
		item.setItemName(rf.getItemName());
		item.setPrice(rf.getPrice());
		item.setDescription(rf.getDescription());
		bean.InsertItemData(item);

		return (mapping.findForward("registration_done"));

	}
}
