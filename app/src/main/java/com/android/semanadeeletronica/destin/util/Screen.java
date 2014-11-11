package com.android.semanadeeletronica.destin.util;//package com.miligrama.alineborges.miligrama.util;
import com.android.semanadeeletronica.destin.DetalhesActivity;
import com.android.semanadeeletronica.destin.MainActivity;

/**
 * Created by Aline Borges on 8/26/2014.
 */
public enum Screen {
	Main(MainActivity.class),
    Detalhes(DetalhesActivity.class);
	
	private Class activityClass;
	
	Screen(Class activityClass) {
		this.activityClass = activityClass;
	}
	
	public Class getActivityClass() {
		return this.activityClass;
	}
	
}
