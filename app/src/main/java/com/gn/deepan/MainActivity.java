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
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.*;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.graphics.Typeface;
import com.getkeepsafe.taptargetview.*;
import com.cyberalpha.iOSDialog.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private double number = 0;
	private String fontName = "";
	private String typeace = "";
	private String phoneNumber = "";
	private String otp = "";
	private HashMap<String, Object> map = new HashMap<>();
	private HashMap<String, Object> UN_Map_var = new HashMap<>();
	private HashMap<String, Object> UN_API = new HashMap<>();
	private HashMap<String, Object> UN_CurrentVersion = new HashMap<>();
	private String verificationCode = "";
	private String username = "";
	private HashMap<String, Object> map1 = new HashMap<>();
	
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout main;
	private LinearLayout login;
	private LinearLayout verification;
	private TextView textview16;
	private TextView textview15;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear22;
	private LinearLayout linear25;
	private LottieAnimationView lottie3;
	private TextView textview13;
	private LottieAnimationView lottie4;
	private TextView textview14;
	private LinearLayout linear2;
	private TextView textview12;
	private LinearLayout linear13;
	private LinearLayout linear15;
	private TextView textview1;
	private LottieAnimationView lottie1;
	private LinearLayout linear7;
	private Button button1;
	private ProgressBar progressbar1;
	private TextView textview11;
	private EditText edittext1;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear16;
	private TextView textview5;
	private LinearLayout linear10;
	private Button button2;
	private ProgressBar progressbar2;
	private LinearLayout linear11;
	private LinearLayout linear14;
	private ImageView imageview5;
	private TextView textview7;
	private LottieAnimationView lottie2;
	private EditText edittext2;
	private TextView textview8;
	private TextView textview10;
	private TextView textview9;
	
	private FirebaseAuth auth;
	private OnCompleteListener<AuthResult> _auth_create_user_listener;
	private OnCompleteListener<AuthResult> _auth_sign_in_listener;
	private OnCompleteListener<Void> _auth_reset_password_listener;
	private OnCompleteListener<Void> auth_updateEmailListener;
	private OnCompleteListener<Void> auth_updatePasswordListener;
	private OnCompleteListener<Void> auth_emailVerificationSentListener;
	private OnCompleteListener<Void> auth_deleteUserListener;
	private OnCompleteListener<Void> auth_updateProfileListener;
	private OnCompleteListener<AuthResult> auth_phoneAuthListener;
	private OnCompleteListener<AuthResult> auth_googleSignInListener;
	
	private TimerTask t;
	private Intent i = new Intent();
	private RequestNetwork ip;
	private RequestNetwork.RequestListener _ip_request_listener;
	private AlertDialog.Builder dialog;
	private Intent staffmain = new Intent();
	private Intent staffhome = new Intent();
	private SharedPreferences shar;
	private SharedPreferences shar1;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear4 = findViewById(R.id.linear4);
		main = findViewById(R.id.main);
		login = findViewById(R.id.login);
		verification = findViewById(R.id.verification);
		textview16 = findViewById(R.id.textview16);
		textview15 = findViewById(R.id.textview15);
		linear23 = findViewById(R.id.linear23);
		linear24 = findViewById(R.id.linear24);
		linear22 = findViewById(R.id.linear22);
		linear25 = findViewById(R.id.linear25);
		lottie3 = findViewById(R.id.lottie3);
		textview13 = findViewById(R.id.textview13);
		lottie4 = findViewById(R.id.lottie4);
		textview14 = findViewById(R.id.textview14);
		linear2 = findViewById(R.id.linear2);
		textview12 = findViewById(R.id.textview12);
		linear13 = findViewById(R.id.linear13);
		linear15 = findViewById(R.id.linear15);
		textview1 = findViewById(R.id.textview1);
		lottie1 = findViewById(R.id.lottie1);
		linear7 = findViewById(R.id.linear7);
		button1 = findViewById(R.id.button1);
		progressbar1 = findViewById(R.id.progressbar1);
		textview11 = findViewById(R.id.textview11);
		edittext1 = findViewById(R.id.edittext1);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		linear16 = findViewById(R.id.linear16);
		textview5 = findViewById(R.id.textview5);
		linear10 = findViewById(R.id.linear10);
		button2 = findViewById(R.id.button2);
		progressbar2 = findViewById(R.id.progressbar2);
		linear11 = findViewById(R.id.linear11);
		linear14 = findViewById(R.id.linear14);
		imageview5 = findViewById(R.id.imageview5);
		textview7 = findViewById(R.id.textview7);
		lottie2 = findViewById(R.id.lottie2);
		edittext2 = findViewById(R.id.edittext2);
		textview8 = findViewById(R.id.textview8);
		textview10 = findViewById(R.id.textview10);
		textview9 = findViewById(R.id.textview9);
		auth = FirebaseAuth.getInstance();
		ip = new RequestNetwork(this);
		dialog = new AlertDialog.Builder(this);
		shar = getSharedPreferences("shar", Activity.MODE_PRIVATE);
		shar1 = getSharedPreferences("shar1", Activity.MODE_PRIVATE);
		
		lottie3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				staffmain.setClass(getApplicationContext(), StaffsplashActivity.class);
				startActivity(staffmain);
			}
		});
		
		lottie4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((FirebaseAuth.getInstance().getCurrentUser() != null)) {
					i.setClass(getApplicationContext(), StudentsplashActivity.class);
					startActivity(i);
					finish();
				}
				else {
					login.setVisibility(View.VISIBLE);
					main.setVisibility(View.GONE);
				}
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().trim().equals(phoneNumber)) {
					
				}
				else {
					iOSDialogBuilder di = new iOSDialogBuilder(MainActivity.this);
					di
					.setTitle("Verification")
					.setSubtitle("Please confirm your phone number : ".concat(edittext1.getText().toString())) 	
					.setBoldPositiveLabel(true)
						.setCancelable(false)
					.setFont(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"))
					.setPositiveListener("Confirm",new iOSDialogClickListener() 
					{ 	 @Override 	 public void onClick(iOSDialog dialog) { 		
							button1.setVisibility(View.GONE);
							progressbar1.setVisibility(View.VISIBLE);
							phoneNumber = textview11.getText().toString().concat(edittext1.getText().toString());
							
							 
							com.google.firebase.auth.PhoneAuthProvider.getInstance().verifyPhoneNumber(
							                phoneNumber,   
							                (long)60, java.util.concurrent.TimeUnit.SECONDS, 
							MainActivity.this,
							              mCallback
							    
							);
							dialog.dismiss(); 	 
						}
					})	
					.setNegativeListener("Edit", new iOSDialogClickListener() 
					{ 	 
						@Override 	 public void onClick(iOSDialog dialog) { 		
							dialog.dismiss(); 
						}
					})
					.build().show();
				}
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.trim().equals("")) {
					_Shadow(3, 20, "#E0E0E0", button1);
					button1.setTextColor(0xFF000000);
				}
				else {
					_Shadow(3, 20, "#FB8C00", button1);
					button1.setTextColor(0xFFFFFFFF);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext2.getText().toString().trim().equals("")) {
					
				}
				else {
					button2.setVisibility(View.GONE);
					progressbar2.setVisibility(View.VISIBLE);
					otp = edittext2.getText().toString();
					com.google.firebase.auth.PhoneAuthCredential credential = com.google.firebase.auth.PhoneAuthProvider.getCredential(verificationCode, otp);
					auth.signInWithCredential(credential).addOnCompleteListener(MainActivity.this, _auth_sign_in_listener);
				}
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				login.setVisibility(View.VISIBLE);
				verification.setVisibility(View.GONE);
				main.setVisibility(View.GONE);
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.trim().equals("")) {
					_Shadow(3, 20, "#E0E0E0", button2);
					button2.setTextColor(0xFF000000);
				}
				else {
					_Shadow(3, 20, "#FB8C00", button2);
					button2.setTextColor(0xFFFFFFFF);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(Double.parseDouble(textview9.getText().toString()) == 0)) {
					SketchwareUtil.showMessage(getApplicationContext(), "Please wait 60 seconds");
				}
				else {
					
					 
					com.google.firebase.auth.PhoneAuthProvider.getInstance().verifyPhoneNumber(
					                phoneNumber,   
					                (long)60, java.util.concurrent.TimeUnit.SECONDS, 
					MainActivity.this,
					              mCallback
					    
					);
					textview9.setText("60");
				}
			}
		});
		
		_ip_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				textview11.setText(_response);
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		auth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		auth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_auth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					i.setClass(getApplicationContext(), StudentsplashActivity.class);
					startActivity(i);
					finish();
				}
				else {
					button2.setVisibility(View.VISIBLE);
					progressbar2.setVisibility(View.GONE);
					SketchwareUtil.showMessage(getApplicationContext(), "Verification code invalid!");
				}
			}
		};
		
		_auth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		button1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		textview11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		edittext1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		button2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		edittext2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		textview10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		textview12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/regular.ttf"), 0);
		textview13.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview15.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		textview16.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		_gd(linear7, "#EEEEEE", "#E0E0E0", 20);
		_gd(linear10, "#EEEEEE", "#E0E0E0", 20);
		_Shadow(6, 20, "#E0E0E0", button1);
		_Shadow(6, 20, "#E0E0E0", button2);
		_LengthOfEditText(edittext2, 6);
		_transparent();
		button1.setTextColor(0xFF37474F);
		button2.setTextColor(0xFF37474F);
		progressbar1.setVisibility(View.GONE);
		progressbar2.setVisibility(View.GONE);
		linear1.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFFFFA000,0xFFFDD835}));
		_removeScollBar(linear1);
		ip.startRequestNetwork(RequestNetworkController.GET, "https://ipapi.co/country_calling_code", "Calling_Code", _ip_request_listener);
		lottie1.setAnimation("number.json");
		lottie2.setAnimation("party.json");
		lottie3.setAnimation("Stf.json");
		lottie4.setAnimation("stu.json");
		if (shar1.getString("tab3_showed", "").equals("")) {
			final SpannableString spannedDesc = new SpannableString("Staffs Login Page");
			TapTargetView.showFor(MainActivity.this, TapTarget.forView(findViewById(R.id.lottie3), "Click here", spannedDesc)
			        .cancelable(true)
			        .drawShadow(true)
			        .titleTextDimen(R.dimen.title_text_size)
			        .tintTarget(false), new TapTargetView.Listener() {
				            @Override
				      public void onTargetClick(TapTargetView view) {
					        super.onTargetClick(view);
					        // .. which evidently starts the sequence we defined earlier
					        if (shar1.getString("tab4_showed", "").equals("")) {
						final SpannableString spannedDesc = new SpannableString("Students Login page");
						TapTargetView.showFor(MainActivity.this, TapTarget.forView(findViewById(R.id.lottie4), "Click here", spannedDesc)
						        .cancelable(true)
						        .drawShadow(true)
						        .titleTextDimen(R.dimen.title_text_size)
						        .tintTarget(false), new TapTargetView.Listener() {
							            @Override
							      public void onTargetClick(TapTargetView view) {
								        super.onTargetClick(view);
								        // .. which evidently starts the sequence we defined earlier
								        shar1.edit().putString("tab3_showed", "ko").commit();
								shar1.edit().putString("tab4_showed", "ko").commit();
								        
								      }
						});
					}
					        
					      }
			});
		}
	}
	
	public void _Shadow(final double _sadw, final double _cru, final String _wc, final View _widgets) {
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable();
		wd.setColor(Color.parseColor(_wc));
		wd.setCornerRadius((int)_cru);
		_widgets.setElevation((int)_sadw);
		_widgets.setBackground(wd);
	}
	
	
	public void _gd(final View _view, final String _c, final String _sc, final double _r) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		
		gd.setColor(Color.parseColor(_c));
		gd.setCornerRadius((float)_r);
		gd.setStroke(2, Color.parseColor(_sc));
		
		_view.setBackground(gd);
	}
	
	
	public void _StartFirebaseLogin() {
	}
	com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallback = new com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
		        
		        @Override
		        public void onVerificationCompleted(com.google.firebase.auth.PhoneAuthCredential phoneAuthCredential) {
			            Toast.makeText(MainActivity.this,"Code Received",Toast.LENGTH_SHORT).show();
			        }
		
		        @Override
		        public void onVerificationFailed(com.google.firebase.FirebaseException e) {
			            Toast.makeText(MainActivity.this,"verification fialed",Toast.LENGTH_SHORT).show();
			button1.setVisibility(View.VISIBLE);		progressbar1.setVisibility(View.GONE);
			        }
		
		        @Override
		        public void onCodeSent(String s, com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken forceResendingToken) {
			            super.onCodeSent(s, forceResendingToken);
			            verificationCode = s;
			            
			login.setVisibility(View.GONE);
			verification.setVisibility(View.VISIBLE);
			button1.setVisibility(View.VISIBLE);
			progressbar1.setVisibility(View.GONE);
			number = Double.parseDouble(textview9.getText().toString());
			textview9.setText(String.valueOf((long)(number)));
			t = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							number--;
							textview9.setText(String.valueOf((long)(number)));
							if (number == 0) {
								textview9.setText("00");
								t.cancel();
							}
						}
					});
				}
			};
			_timer.scheduleAtFixedRate(t, (int)(0), (int)(1000));
			Toast.makeText(MainActivity.this,"Code sent",Toast.LENGTH_SHORT).show();
			        }
		    };
	{
	}
	
	
	public void _removeScollBar(final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _LengthOfEditText(final TextView _editText, final double _value_character) {
		InputFilter[] gb = _editText.getFilters(); InputFilter[] newFilters = new InputFilter[gb.length + 1]; System.arraycopy(gb, 0, newFilters, 0, gb.length); newFilters[gb.length] = new InputFilter.LengthFilter((int)_value_character); _editText.setFilters(newFilters);
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