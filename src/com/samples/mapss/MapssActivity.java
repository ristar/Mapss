package com.samples.mapss;

import java.util.List;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

import android.graphics.drawable.Drawable;

import android.os.Bundle;
import android.widget.TextView;

public class MapssActivity extends MapActivity 
{
    /** Called when the activity is first created. */
	

	private MapView mMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
  
        mMap=(MapView)findViewById(R.id.mapview);
        mMap.setBuiltInZoomControls(true);
       
        
    
        
        List<Overlay> mapOverlays = mMap.getOverlays();
        Drawable drawable = this.getResources().getDrawable(R.drawable.icon);
        CustomItemizedOverlay itemizedoverlay = new CustomItemizedOverlay(drawable);
  
        
        
        GeoPoint point = new GeoPoint((int )(55.79981*1E6),	(int)(37.53412*1E6));
        OverlayItem overlayitem = new OverlayItem(point, "Hola, Mundo!", "I'm in Mexico City!");
        
        itemizedoverlay.addOverlay(overlayitem);
        mapOverlays.add(itemizedoverlay);
        
    }
    

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	


	
}