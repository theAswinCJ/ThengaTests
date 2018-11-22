/**
 *  Created by Aswin CJ.
 */

package com.example.thengapal3.activity;

import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.content.Intent;
import android.text.SpannableString;
import android.support.constraint.ConstraintLayout;
import android.os.Bundle;
import android.widget.ImageView;
import android.text.style.RelativeSizeSpan;
import android.widget.EditText;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.example.thengapal3.R;


public class SignInActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, SignInActivity.class);
	}
	
	private Button donThaveAnAccounButton;
	private Button buttonButton;
	private TextView forgotPasswordTextView;
	private TextView passwordTextView;
	private TextView emailTextView;
	private TextView logInTextView;
	private TextView thengapalTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.sign_in_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Don’t have an accoun component
		donThaveAnAccounButton = this.findViewById(R.id.don_thave_an_accoun_button);
		donThaveAnAccounButton.setOnClickListener((view) -> {
	this.onDonTHaveAnAccounPressed();
});
		
		// Configure Button component
		buttonButton = this.findViewById(R.id.button_button);
		buttonButton.setOnClickListener((view) -> {
	this.onButtonPressed();
});
		
		// Configure Forgot Password component
		forgotPasswordTextView = this.findViewById(R.id.forgot_password_text_view);
		SpannableString forgotPasswordTextViewText = new SpannableString(this.getString(R.string.sign_in_activity_forgot_password_text_view_text));
		forgotPasswordTextView.setText(forgotPasswordTextViewText);
		
		// Configure Password component
		passwordTextView = this.findViewById(R.id.password_text_view);
		SpannableString passwordTextViewText = new SpannableString(this.getString(R.string.sign_in_activity_password_text_view_text));
		passwordTextView.setText(passwordTextViewText);
		
		// Configure Email component
		emailTextView = this.findViewById(R.id.email_text_view);
		SpannableString emailTextViewText = new SpannableString(this.getString(R.string.sign_in_activity_email_text_view_text));
		emailTextView.setText(emailTextViewText);
		
		// Configure Log In component
		logInTextView = this.findViewById(R.id.log_in_text_view);
		SpannableString logInTextViewText = new SpannableString(this.getString(R.string.sign_in_activity_log_in_text_view_text));
		logInTextView.setText(logInTextViewText);
		
		// Configure ThengaPal component
		thengapalTextView = this.findViewById(R.id.thengapal_text_view);
		SpannableString thengapalTextViewText = new SpannableString(this.getString(R.string.sign_in_activity_thengapal_text_view_text));
		thengapalTextView.setText(thengapalTextViewText);
	}
	
	public void onDonTHaveAnAccounPressed() {
	
		startSignUpActivity();
	}
	
	public void onButtonPressed() {
	
		startWalkthrough1BuyActivity();
	}
	
	private void startWalkthrough1BuyActivity() {
	
		this.startActivity(Walkthrough1BuyActivity.newIntent(this));
	}
	
	private void startSignUpActivity() {
	
		this.startActivity(SignUpActivity.newIntent(this));
	}
}
