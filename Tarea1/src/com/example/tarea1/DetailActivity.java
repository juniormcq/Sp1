package com.example.tarea1;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.util.Linkify;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends Activity implements OnClickListener{
	private String country = "";
	Button btnAdd;
	Button btnAdd2;
	String numero;

	public static final String TIENDA = "country";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		Intent intent = getIntent();
		country = intent.getStringExtra(TIENDA);
		btnAdd = (Button)findViewById(R.id.button1);
		btnAdd2 = (Button)findViewById(R.id.button2);
		btnAdd.setOnClickListener(this);
		btnAdd2.setOnClickListener(this);
		TextView txtm = (TextView)findViewById(R.id.txtname);
		TextView txtm1 = (TextView)findViewById(R.id.textView1);
		TextView txtm2= (TextView)findViewById(R.id.textView2);
		TextView txtm3 = (TextView)findViewById(R.id.textView3);
		TextView txtm4 = (TextView)findViewById(R.id.textView4);
		TextView txtm5 = (TextView)findViewById(R.id.textView5);
		TextView txtm6 = (TextView)findViewById(R.id.textView6);
		TextView txtm7 = (TextView)findViewById(R.id.textView7);
		txtm.setText(country);
		txtm7.setText("Horarios");
		if (country .equals("Tienda de Lego")){
			
			txtm1.setText("34 Main St, Queens, NY 11367, EE.UU.");
			Linkify.addLinks(txtm1, Linkify.MAP_ADDRESSES);
			txtm2.setText("23548792");
			numero = "23548792";
			Linkify.addLinks(txtm2, Linkify.ALL);
			txtm3.setText("www.tienndadelego.com");
			Linkify.addLinks(txtm3, Linkify.ALL);
			txtm4.setText("tiendadelego@gmail.com");
			Linkify.addLinks(txtm4, Linkify.ALL);
			txtm6.setText("Lunes-Viernes: 9 a.m. a 7 p.m.");
			txtm5.setText("Sabados: 10 a.m. a 4 p.m.");
		}else if (country .equals("Tienda de Libros")){
			
			txtm1.setText("34 Main St, Queens, NY 11367, EE.UU.");
			Linkify.addLinks(txtm1, Linkify.MAP_ADDRESSES);
			txtm2.setText("23358391");
			numero = "23358391";
			Linkify.addLinks(txtm2, Linkify.ALL);
			txtm3.setText("www.tienndadelibros.com");
			Linkify.addLinks(txtm3, Linkify.ALL);
			txtm4.setText("tiendadelibros@gmail.com");
			Linkify.addLinks(txtm4, Linkify.ALL);
			txtm6.setText("Lunes-Viernes: 7 a.m. a 6 p.m.");
			txtm5.setText("Sabados: 10 a.m. a 1 p.m.");
		}else if (country .equals("Tienda de zapatos")){
			
			txtm1.setText("34 Main St, Queens, NY 11367, EE.UU.");
			Linkify.addLinks(txtm1, Linkify.MAP_ADDRESSES);
			txtm2.setText("22134566");
			numero = "22134566";
			Linkify.addLinks(txtm2, Linkify.ALL);
			txtm3.setText("www.tienndadezapatos.com");
			Linkify.addLinks(txtm3, Linkify.ALL);
			txtm4.setText("tiendadezapatos@gmail.com");
			Linkify.addLinks(txtm4, Linkify.ALL);
			txtm6.setText("Lunes-Viernes: 8 a.m. a 6 p.m.");
			txtm5.setText("Sabados: 10 a.m. a 4 p.m.");
		}else if (country .equals("Tienda de ropa")){
			
			txtm1.setText("34 Main St, Queens, NY 11367, EE.UU.");
			Linkify.addLinks(txtm1, Linkify.MAP_ADDRESSES);
			txtm2.setText("22334567");
			numero = "22334567";
			Linkify.addLinks(txtm2, Linkify.ALL);
			txtm3.setText("www.tienndaderopa.com");
			Linkify.addLinks(txtm3, Linkify.ALL);
			txtm4.setText("tiendaderopa@gmail.com");
			Linkify.addLinks(txtm4, Linkify.ALL);
			txtm6.setText("Lunes-Viernes: 10 a.m. a 9 p.m.");
			txtm5.setText("Sabados: 9 a.m. a 6 p.m.");
		}else if (country .equals("Tienda de vinos")){
			
			txtm1.setText("34 Main St, Queens, NY 11367, EE.UU.");
			Linkify.addLinks(txtm1, Linkify.MAP_ADDRESSES);
			txtm2.setText("2658871");
			numero = "2658871";
			Linkify.addLinks(txtm2, Linkify.ALL);
			txtm3.setText("www.tienndadevinos.com");
			Linkify.addLinks(txtm3, Linkify.ALL);
			txtm4.setText("tiendadevinos@gmail.com");
			Linkify.addLinks(txtm4, Linkify.ALL);
			txtm6.setText("Lunes-Viernes: 10 a.m. a 6 p.m.");
			txtm5.setText("Sabados: 10 a.m. a 12 p.m.");
		}
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detail, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		String tienda = country;
		if (v.getId() == btnAdd.getId()){
			Log.e("entro2", "entro2" );

			Intent intent = new Intent(this, ImageActivity.class);
			intent.putExtra(ImageActivity.TIENDA2, tienda);
			startActivity(intent);
		}else if (v.getId()== btnAdd2.getId()) {
			Log.e("entro", "entro" );
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:" + numero));
			startActivity(callIntent);
			
		}	
		
	}

}
