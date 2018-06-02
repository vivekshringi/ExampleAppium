package com.appium.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;



public class LoginPage {
	public String activity=".app.LoginSignUpEmailActivity";
	
	@AndroidFindBy(id = "de.komoot.android:id/jka_v2_proceed_with_email_fragment")
	public MobileElement selectEmail;

    @AndroidFindBy(id = "de.komoot.android:id/jka_v2_tos_text_ttv")
    public MobileElement termsAndConditions;
    
    @AndroidFindBy(id = "com.google.android.gms:id/cancel")
    public MobileElement noneOfAbove;
    
    @AndroidFindBy(id = "de.komoot.android:id/lsea_input_field_tet")
    public MobileElement enterEmail;
    
    @AndroidFindBy(id = "de.komoot.android:id/lsea_next_button_tb")
    public MobileElement nextButton;

	@AndroidFindBy(id = "de.komoot.android:id/lpa_input_field_tet")
	public MobileElement enterPassword;

	@AndroidFindBy(id = "de.komoot.android:id/lpa_login_cta_tb")
	public MobileElement loginButton;
	

	
	

}
