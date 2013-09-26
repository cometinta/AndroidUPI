package com.androidbegin.fragmenttabstutorial;

import java.util.zip.Inflater;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class FragmentTab1 extends Fragment implements ActionBar.TabListener {

	private Fragment mFragment;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from fragment1.xml
		getActivity().setContentView(R.layout.fragmenttab1);

	    
	}

	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		mFragment = new FragmentTab1();
		// Attach fragment1.xml layout
		ft.add(android.R.id.content, mFragment);
		ft.attach(mFragment);

		Requester requester = new Requester();
		AsyncTask<String, String, String> result = requester.execute("http://ada.uprrp.edu/~esantos/SecurityService/controllers/GetAllNews.php","");
		String Result = result.toString();
		System.out.println(result);

		//setContentView(R.id.APPNews);
		//TextView textView = (TextView) findViewById(R.id.textView1);
		//textView.setText("text you want to display");
		
		//View v = Inflater.inflate(R.id.APPNews);
		//View innerView = v.findViewById(R.id.textView1);
		
		JSONArray pageName;
		try {
			JSONObject obj = new JSONObject(Result);
			pageName = obj.getJSONArray("News");
			
			System.out.println(pageName);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*JSONArray arr = obj.getJSONArray("posts");
		for (int i = 0; i < arr.length(); i++)
		{
		    String post_id = arr.getJSONObject(i).getString("Titulo");
		    String post_id = arr.getJSONObject(i).getString("Titulo");
		    String post_id = arr.getJSONObject(i).getString("Titulo");
		    String post_id = arr.getJSONObject(i).getString("Titulo");

		}
		*/
		
		
		
		
		
			/*try {
				JSONObject News = new JSONObject(Result);
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
	
	}

	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		// Remove fragment1.xml layout
		ft.remove(mFragment);
	}

	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	public void Load(Tab tab, FragmentTransaction ft) {
		
		    }	

}


