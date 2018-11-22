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


public class HomeActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, HomeActivity.class);
	}
	
	private TextView cardTitleTextView;
	private TextView neverBotherAnyoneTextView;
	private TextView cardTitleTwoTextView;
	private TextView neverBotherAnyoneTwoTextView;
	private TextView cardTitleThreeTextView;
	private TextView neverBotherAnyoneThreeTextView;
	private TextView cardTitleFourTextView;
	private TextView neverBotherAnyoneFourTextView;
	private TextView centerTextTextView;
	private Button navHeaderButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.home_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Card Title component
		cardTitleTextView = this.findViewById(R.id.card_title_text_view);
		SpannableString cardTitleTextViewText = new SpannableString(this.getString(R.string.home_activity_card_title_text_view_text));
		cardTitleTextView.setText(cardTitleTextViewText);
		
		// Configure Never bother anyone component
		neverBotherAnyoneTextView = this.findViewById(R.id.never_bother_anyone_text_view);
		SpannableString neverBotherAnyoneTextViewText = new SpannableString(this.getString(R.string.home_activity_never_bother_anyone_text_view_text));
		neverBotherAnyoneTextView.setText(neverBotherAnyoneTextViewText);
		
		// Configure Card Title component
		cardTitleTwoTextView = this.findViewById(R.id.card_title_two_text_view);
		SpannableString cardTitleTwoTextViewText = new SpannableString(this.getString(R.string.home_activity_card_title_two_text_view_text));
		cardTitleTwoTextView.setText(cardTitleTwoTextViewText);
		
		// Configure Never bother anyone component
		neverBotherAnyoneTwoTextView = this.findViewById(R.id.never_bother_anyone_two_text_view);
		SpannableString neverBotherAnyoneTwoTextViewText = new SpannableString(this.getString(R.string.home_activity_never_bother_anyone_two_text_view_text));
		neverBotherAnyoneTwoTextView.setText(neverBotherAnyoneTwoTextViewText);
		
		// Configure Card Title component
		cardTitleThreeTextView = this.findViewById(R.id.card_title_three_text_view);
		SpannableString cardTitleThreeTextViewText = new SpannableString(this.getString(R.string.home_activity_card_title_three_text_view_text));
		cardTitleThreeTextView.setText(cardTitleThreeTextViewText);
		
		// Configure Never bother anyone component
		neverBotherAnyoneThreeTextView = this.findViewById(R.id.never_bother_anyone_three_text_view);
		SpannableString neverBotherAnyoneThreeTextViewText = new SpannableString(this.getString(R.string.home_activity_never_bother_anyone_three_text_view_text));
		neverBotherAnyoneThreeTextView.setText(neverBotherAnyoneThreeTextViewText);
		
		// Configure Card Title component
		cardTitleFourTextView = this.findViewById(R.id.card_title_four_text_view);
		SpannableString cardTitleFourTextViewText = new SpannableString(this.getString(R.string.home_activity_card_title_four_text_view_text));
		cardTitleFourTextView.setText(cardTitleFourTextViewText);
		
		// Configure Never bother anyone component
		neverBotherAnyoneFourTextView = this.findViewById(R.id.never_bother_anyone_four_text_view);
		SpannableString neverBotherAnyoneFourTextViewText = new SpannableString(this.getString(R.string.home_activity_never_bother_anyone_four_text_view_text));
		neverBotherAnyoneFourTextView.setText(neverBotherAnyoneFourTextViewText);
		
		// Configure Center Text component
		centerTextTextView = this.findViewById(R.id.center_text_text_view);
		SpannableString centerTextTextViewText = new SpannableString(this.getString(R.string.home_activity_center_text_text_view_text));
		centerTextTextView.setText(centerTextTextViewText);
		
		// Configure Nav Header component
		navHeaderButton = this.findViewById(R.id.nav_header_button);
		navHeaderButton.setOnClickListener((view) -> {
	this.onNavHeaderPressed();
});
	}
	
	public void onNavHeaderPressed() {
	
	}
}
