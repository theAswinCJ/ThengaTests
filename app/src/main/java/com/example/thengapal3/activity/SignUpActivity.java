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


public class SignUpActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, SignUpActivity.class);
	}
	
	private Button loginInsteadButton;
	private TextView emailTextView;
	private TextView passwordTextView;
	private TextView nameTextView;
	private Button buttonButton;
	private TextView signUpTextView;
	private TextView thengapalTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.sign_up_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Login Instead? component
		loginInsteadButton = this.findViewById(R.id.login_instead_button);
		loginInsteadButton.setOnClickListener((view) -> {
	this.onLoginInsteadPressed();
});
		
		// Configure Email component
		emailTextView = this.findViewById(R.id.email_text_view);
		SpannableString emailTextViewText = new SpannableString(this.getString(R.string.sign_up_activity_email_text_view_text));
		emailTextView.setText(emailTextViewText);
		
		// Configure Password component
		passwordTextView = this.findViewById(R.id.password_text_view);
		SpannableString passwordTextViewText = new SpannableString(this.getString(R.string.sign_up_activity_password_text_view_text));
		passwordTextView.setText(passwordTextViewText);
		
		// Configure Name component
		nameTextView = this.findViewById(R.id.name_text_view);
		SpannableString nameTextViewText = new SpannableString(this.getString(R.string.sign_up_activity_name_text_view_text));
		nameTextView.setText(nameTextViewText);
		
		// Configure Button component
		buttonButton = this.findViewById(R.id.button_button);
		buttonButton.setOnClickListener((view) -> {
	this.onButtonPressed();
});
		
		// Configure Sign Up component
		signUpTextView = this.findViewById(R.id.sign_up_text_view);
		SpannableString signUpTextViewText = new SpannableString(this.getString(R.string.sign_up_activity_sign_up_text_view_text));
		signUpTextView.setText(signUpTextViewText);
		
		// Configure ThengaPal component
		thengapalTextView = this.findViewById(R.id.thengapal_text_view);
		SpannableString thengapalTextViewText = new SpannableString(this.getString(R.string.sign_up_activity_thengapal_text_view_text));
		thengapalTextView.setText(thengapalTextViewText);
	}
	
	public void onLoginInsteadPressed() {
	
		startSignInActivity();
	}
	
	public void onButtonPressed() {
	
		startWalkthrough1BuyActivity();
	}
	
	private void startWalkthrough1BuyActivity() {
	
		this.startActivity(Walkthrough1BuyActivity.newIntent(this));
	}
	
	private void startSignInActivity() {
	
		this.startActivity(SignInActivity.newIntent(this));
	}
}
