package zadanie1.mtmp.sk.artoolkittest;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;

import org.artoolkit.ar6.base.ARActivity;
import org.artoolkit.ar6.base.rendering.ARRenderer;

/**
 * Created by z003r0bf on 2. 10. 2017.
 */

public class ARTrackingActivity extends ARActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }

    @Override
    protected ARRenderer supplyRenderer() {
        return new ARTrackingRenderer();
    }

    @Override
    protected FrameLayout supplyFrameLayout() {
        return (FrameLayout) this.findViewById(R.id.mainLayout);
    }
}
