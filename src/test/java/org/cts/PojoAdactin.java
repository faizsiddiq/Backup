package org.cts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoAdactin extends FrameWork {
	
	
	public PojoAdactin() {
		
		
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(id="username")
	private WebElement txtname;
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	@FindBy(id="login")
	private WebElement btnlogin;
	
	@FindBy(id="location")
	private WebElement droplocation;
	
	@FindBy(id="hotels")
	private WebElement drophotel;
	
	@FindBy(id="room_type")
	private WebElement droptype;
	
	@FindBy(id="room_nos")
	private WebElement droprooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement dropadult;
	
	@FindBy(id="child_room")
	private WebElement dropchild;
	
	@FindBy(id="Submit")
	private WebElement clicksubmit;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement btnclick;
	
	@FindBy(id="first_name")
	private WebElement txtfirstname;
	
	@FindBy(id="last_name")
	private WebElement txtlastname;
	
	@FindBy(id="address")
	private WebElement txtaddress;
	
	@FindBy(id="cc_num")
	private WebElement txtcard;
	
	@FindBy(id="cc_type")
	private WebElement dropcardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement dropexpmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dropexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtcvvno;

	@FindBy(id="book_now")
	private WebElement btnbook;
	
	@FindBy(id="order_no")
	private WebElement txtorderno;

	public WebElement getTxtname() {
		return txtname;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getDroplocation() {
		return droplocation;
	}

	public WebElement getDrophotel() {
		return drophotel;
	}

	public WebElement getDroptype() {
		return droptype;
	}

	public WebElement getDroprooms() {
		return droprooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getDropadult() {
		return dropadult;
	}

	public WebElement getDropchild() {
		return dropchild;
	}

	public WebElement getClicksubmit() {
		return clicksubmit;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}

	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtcard() {
		return txtcard;
	}

	public WebElement getDropcardtype() {
		return dropcardtype;
	}

	public WebElement getDropexpmonth() {
		return dropexpmonth;
	}

	public WebElement getDropexpyear() {
		return dropexpyear;
	}

	public WebElement getTxtcvvno() {
		return txtcvvno;
	}

	public WebElement getBtnbook() {
		return btnbook;
	}

	public WebElement getTxtorderno() {
		return txtorderno;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
