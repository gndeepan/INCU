package com.gn.deepan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.graphics.Typeface;
import com.getkeepsafe.taptargetview.*;
import com.cyberalpha.iOSDialog.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class BookblockActivity extends AppCompatActivity {
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout book1;
	private LinearLayout book2;
	private LinearLayout book3;
	private LinearLayout book4;
	private LinearLayout book5;
	private LinearLayout book6;
	private LinearLayout linear2;
	private TextView textview1;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	
	private Intent b1 = new Intent();
	private Intent b2 = new Intent();
	private Intent b3 = new Intent();
	private Intent b4 = new Intent();
	private Intent b5 = new Intent();
	private Intent b6 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.bookblock);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		linear4 = findViewById(R.id.linear4);
		book1 = findViewById(R.id.book1);
		book2 = findViewById(R.id.book2);
		book3 = findViewById(R.id.book3);
		book4 = findViewById(R.id.book4);
		book5 = findViewById(R.id.book5);
		book6 = findViewById(R.id.book6);
		linear2 = findViewById(R.id.linear2);
		textview1 = findViewById(R.id.textview1);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		
		book1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				b1.setClass(getApplicationContext(), Book1Activity.class);
				startActivity(b1);
			}
		});
		
		book2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				b2.setClass(getApplicationContext(), Book2Activity.class);
				startActivity(b2);
			}
		});
		
		book3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				b3.setClass(getApplicationContext(), Book3Activity.class);
				startActivity(b3);
			}
		});
		
		book4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				b4.setClass(getApplicationContext(), Book4Activity.class);
				startActivity(b4);
			}
		});
		
		book5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				b5.setClass(getApplicationContext(), Book5Activity.class);
				startActivity(b5);
			}
		});
		
		book6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				b6.setClass(getApplicationContext(), Book6Activity.class);
				startActivity(b6);
			}
		});
	}
	
	private void initializeLogic() {
		_grdyellow(book1);
		_grdblue(book2);
		_grdwhyblue(book3);
		_grdred(book4);
		_grdbluerose(book5);
		_grdgreen(book6);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 1);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 1);
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 1);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 1);
		textview10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 1);
		textview11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 1);
		_transparent();
	}
	
	public void _grdyellow(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFFFFC107,
			0xFFFF9800
		});
		gd.setCornerRadius(20f);
		_view.setElevation(10f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _grdblue(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFF59D3FC,
			0xFF554DDE
		});
		gd.setCornerRadius(20f);
		_view.setElevation(10f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _grdwhyblue(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFF991CD1,
			0xFF043D74
		});
		gd.setCornerRadius(20f);
		_view.setElevation(10f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _grdred(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFFD4145A,
			0xFFFF4B2B
		});
		gd.setCornerRadius(20f);
		_view.setElevation(10f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _grdbluerose(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFFBE2EBF,
			0xFF4D4ADD
		});
		gd.setCornerRadius(20f);
		_view.setElevation(10f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _grdgreen(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{
			0xFF7BFFD6,
			0xFFA7FF7A
		});
		gd.setCornerRadius(20f);
		_view.setElevation(10f);
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _transparent() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { 
			Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(0xFF008375); w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); }
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}