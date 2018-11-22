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


public class Walkthrough1BuyActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, Walkthrough1BuyActivity.class);
	}
	
	private Button walkthroughNextButtonButton;
	private TextView descriptionTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.walkthrough1_buy_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Walkthrough Next Button component
		walkthroughNextButtonButton = this.findViewById(R.id.walkthrough_next_button_button);
		walkthroughNextButtonButton.setOnClickListener((view) -> {
	this.onWalkthroughNextButtonPressed();
});
		
		// Configure Description component
		descriptionTextView = this.findViewById(R.id.description_text_view);
		SpannableString descriptionTextViewText = new SpannableString(this.getString(R.string.walkthrough1_buy_activity_description_text_view_text));
		descriptionTextView.setText(descriptionTextViewText);
	}
	
	public void onWalkthroughNextButtonPressed() {
	
		startWalkthrough2SellActivity();
	}
	
	private void startWalkthrough2SellActivity() {
	
		this.startActivity(Walkthrough2SellActivity.newIntent(this));
	}
}
