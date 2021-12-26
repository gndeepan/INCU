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
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import com.airbnb.lottie.*;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AdapterView;
import android.graphics.Typeface;
import com.getkeepsafe.taptargetview.*;
import com.cyberalpha.iOSDialog.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class StudentchatActivity extends AppCompatActivity {
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private String username = "";
	private HashMap<String, Object> map = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	private ArrayList<String> dltkey = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout main;
	private LinearLayout chat;
	private LinearLayout linear4;
	private TextView textview1;
	private LinearLayout linear3;
	private EditText name;
	private LinearLayout linear2;
	private Button save;
	private LottieAnimationView lottie1;
	private LinearLayout linear13;
	private ListView listview2;
	private LinearLayout linear5;
	private ImageView imageview2;
	private TextView textview2;
	private ImageView imageview4;
	private LinearLayout typ;
	private ImageView camera;
	private EditText typmsg;
	private ImageView sent;
	
	private DatabaseReference chatdata = _firebase.getReference("chatdata");
	private ChildEventListener _chatdata_child_listener;
	private SharedPreferences stu;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.studentchat);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		main = findViewById(R.id.main);
		chat = findViewById(R.id.chat);
		linear4 = findViewById(R.id.linear4);
		textview1 = findViewById(R.id.textview1);
		linear3 = findViewById(R.id.linear3);
		name = findViewById(R.id.name);
		linear2 = findViewById(R.id.linear2);
		save = findViewById(R.id.save);
		lottie1 = findViewById(R.id.lottie1);
		linear13 = findViewById(R.id.linear13);
		listview2 = findViewById(R.id.listview2);
		linear5 = findViewById(R.id.linear5);
		imageview2 = findViewById(R.id.imageview2);
		textview2 = findViewById(R.id.textview2);
		imageview4 = findViewById(R.id.imageview4);
		typ = findViewById(R.id.typ);
		camera = findViewById(R.id.camera);
		typmsg = findViewById(R.id.typmsg);
		sent = findViewById(R.id.sent);
		stu = getSharedPreferences("stu", Activity.MODE_PRIVATE);
		
		name.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.trim().equals("")) {
					_Shadow(10, 45, "#E0E0E0", save);
					save.setTextColor(0xFF000000);
				}
				else {
					_Shadow(10, 45, "#FB8C00", save);
					save.setTextColor(0xFFFFFFFF);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		save.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				name.setText(name.getText().toString().replace("", ""));
				if (name.getText().toString().equals("") || name.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "blank");
				}
				else {
					chat.setVisibility(View.VISIBLE);
					main.setVisibility(View.GONE);
					username = name.getText().toString();
					stu.edit().putString("x", username).commit();
					stu.edit().putString("stuname", name.getText().toString()).commit();
				}
			}
		});
		
		listview2.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (username.equals(listmap.get((int)_position).get("Name").toString())) {
					iOSDialogBuilder me = new iOSDialogBuilder(StudentchatActivity.this);
					me
					.setTitle("Delete message")
					.setSubtitle("Are you sure?") 	
					.setBoldPositiveLabel(true)
						.setCancelable(false)
					.setFont(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"))
					.setPositiveListener("Delete",new iOSDialogClickListener() 
					{ 	 @Override 	 public void onClick(iOSDialog dialog) { 		
							chatdata.child(dltkey.get((int)(_position))).removeValue();
							dltkey.remove((int)(_position));
							SketchwareUtil.showMessage(getApplicationContext(), "Deleted");
							dialog.dismiss(); 	 
						}
					})	
					.setNegativeListener("Cancel", new iOSDialogClickListener() 
					{ 	 
						@Override 	 public void onClick(iOSDialog dialog) { 		
							dialog.dismiss(); 
						}
					})
					.build().show();
				}
				listview2.setStackFromBottom(true);
				return true;
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		sent.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				StudentchatActivity.this.getWindow().setSoftInputMode( WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN );
				typmsg.setText(typmsg.getText().toString().replace("", ""));
				if (typmsg.getText().toString().equals("") || typmsg.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "empty");
				}
				else {
					map = new HashMap<>();
					map.put("Name", username);
					map.put("Msg", typmsg.getText().toString());
					chatdata.push().updateChildren(map);
					SketchwareUtil.showMessage(getApplicationContext(), "sent");
				}
				typmsg.setText("");
			}
		});
		
		_chatdata_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				chatdata.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						listmap = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								listmap.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						dltkey.add(_childKey);
						listview2.setAdapter(new Listview2Adapter(listmap));
						listview2.post(new Runnable() { @Override public void run() { listview2.setSelection(listmap.size());}});
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				chatdata.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						listmap = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								listmap.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						listview2.setAdapter(new Listview2Adapter(listmap));
						((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		chatdata.addChildEventListener(_chatdata_child_listener);
	}
	
	private void initializeLogic() {
		textview2.setText(stu.getString("stuname", ""));
		//modified by ashishtechnozone
		Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor("#FF47004E"));
		
		
		lottie1.setAnimation("stud.json");
		typ.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)45, 0xFF471456));
		name.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF5D2B62));
		chat.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF250036,0xFF7C015E}));
		listview2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF250036,0xFF7C015E}));
		name.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		save.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		StudentchatActivity.this.getWindow().setSoftInputMode( WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN );
		listview2.setOverScrollMode(View.OVER_SCROLL_NEVER);listview2.setVerticalScrollBarEnabled(false);
		listview2.setDivider(null);listview2.setDividerHeight(0); listview2.setSelector(android.R.color.transparent);
		if (stu.getString("x", "").equals("")) {
			main.setVisibility(View.VISIBLE);
			chat.setVisibility(View.GONE);
		}
		else {
			chat.setVisibility(View.VISIBLE);
			main.setVisibility(View.GONE);
			username = stu.getString("x", "");
		}
	}
	
	public void _Shadow(final double _sadw, final double _cru, final String _wc, final View _widgets) {
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable();
		wd.setColor(Color.parseColor(_wc));
		wd.setCornerRadius((int)_cru);
		_widgets.setElevation((int)_sadw);
		_widgets.setBackground(wd);
	}
	
	
	public void _grd(final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{
			0xFF1E3F8F,
			0xFF050423
		});
		_view.setBackgroundDrawable(gd);
	}
	
	
	public void _Radius(final View _view, final double _radius) {
		//modified by ashishtechnozone
		android.graphics.drawable.GradientDrawable ab = new android.graphics.drawable.GradientDrawable();
		
		
		ab.setCornerRadius((float) _radius);
		_view.setBackground(ab);
		
		
	}
	
	public class Listview2Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.chatt, null);
			}
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final TextView textview4 = _view.findViewById(R.id.textview4);
			final TextView textview5 = _view.findViewById(R.id.textview5);
			
			textview4.setText(_data.get((int)_position).get("Name").toString());
			textview5.setText(_data.get((int)_position).get("Msg").toString());
			if (username.equals(listmap.get((int)_position).get("Name").toString())) {
				textview4.setVisibility(View.GONE);
				linear1.setGravity(Gravity.RIGHT);
				linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)45, 0xFFFF2184));
				linear1.setGravity(Gravity.RIGHT);
			}
			else {
				linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)45, 0xFF5D2B62));
				textview4.setVisibility(View.VISIBLE);
				linear1.setGravity(Gravity.LEFT);
			}
			textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
			textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
			
			return _view;
		}
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