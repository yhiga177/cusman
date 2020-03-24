package ConfirmRegistration.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ConfirmRegistration.form.ConfirmRegistrationForm;
import value.WebappValue;

public class ConfirmRegistrationAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) {

		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
		System.out.println("ConfirmRegistrationAction");

		ConfirmRegistrationForm rf = (ConfirmRegistrationForm)form;

		WebappValue value = new WebappValue();
		//String stItemName = null;
		//String stDescription = null;

//		try {
//			stItemName = new String(rf.getItemName().getBytes("ISO-8859-1"),"UTF-8");
//			stDescription = new String(rf.getDescription().getBytes("ISO-8859-1"),"UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}

		//value.setItemName(stItemName);
		value.setItemName(rf.getItemName());
		value.setNum(rf.getNum());
		value.setPrice(rf.getPrice());
		value.setDescription(rf.getDescription());
		//value.setDescription(stDescription);

		//入力値チェック
		String message = rf.getMessage();
		boolean check = true;

		//商品名1〜32文字
		int itemNameLength = rf.getItemName().length();
		if(itemNameLength < 1 || 32 < itemNameLength) {
			message += "商品名は1〜32文字で登録してください。　";
			check = false;
		}

		//商品名数字NG
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("^[0-9]*$");
		java.util.regex.Matcher matcher = pattern.matcher(rf.getItemName());
		if(matcher.matches()) {
			message += "商品名は数字以外で登録してください。　";
			check = false;
		}

		//price 7けた かつ0円以上
		int priceLength = String.valueOf(rf.getPrice()).length();
		if(7 < priceLength || rf.getPrice() < 0) {
			message += "価格は0〜9,999,999円で登録してください。　";
			check = false;
		}

		//価格数字以外NG
//		matcher = pattern.matcher(rf.getPrice());
//		if(matcher.matches() == false) {
//			message += "価格は半角数字で登録してください。　";
//			check = false;
//		}

		//description 0~128
		int descriptionLength = rf.getDescription().length();
		if(128 < descriptionLength) {
			message += "説明は128文字以内で登録してください。　";
			check = false;
		}

		value.setMessage(message);

		req.setAttribute("value", value);

//		req.setAttribute("message", message);

		if(check == false) {
			return mapping.findForward("fail");
		}

		return mapping.findForward("success");

	}

}
