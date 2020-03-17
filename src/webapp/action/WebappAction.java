package webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class WebappAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
									HttpServletRequest req,
									HttpServletResponse res) {

//		WebappForm waf = (WebappForm)form;
//		int num = waf.getNum();
		String name = "test";
//		int price = waf.getPrice();
//		String description = waf.getDescription();

		//req.setAttribute("num", num);
		req.setAttribute("name", name);
		//req.setAttribute("price", price);
		//req.setAttribute("description", description);

		return mapping.findForward("success");

	}


}
