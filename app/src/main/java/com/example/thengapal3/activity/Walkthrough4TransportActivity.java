/**
 *  Created by Aswin CJ.
 */

package com.example.thengapal3.activity;

import com.example.thengapal3.R;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.content.Intent;
import android.text.SpannableString;
import android.support.constraint.ConstraintLayout;
import android.os.Bundle;
import android.widget.ImageView;
import android.text.style.RelativeSizeSpan;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class Walkthrough4TransportActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, Walkthrough4TransportActivity.class);
	}
	
	private Button buttonImageButton;
	private TextView descriptionTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.walkthrough4_transport_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Button Image component
		buttonImageButton = this.findViewById(R.id.button_image_button);
		buttonImageButton.setOnClickListener((view) -> {
	this.onButtonImagePressed();
});
		
		// Configure Description component
		descriptionTextView = this.findViewById(R.id.description_text_view);
		SpannableString descriptionTextViewText = new SpannableString(this.getString(R.string.walkthrough4_transport_activity_description_text_view_text));
		descriptionTextView.setText(descriptionTextViewText);
	}
	
	public void onButtonImagePressed() {
	
		startHomeActivity();
	}
	
	private void startHomeActivity() {
	
		this.startActivity(HomeActivity.newIntent(this));
	}
}
