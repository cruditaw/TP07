package com.example.cdsm.tp07;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);

        TextView monTextView = new TextView(this);
        setContentView(monTextView); // set UIComponent as view !
        monTextView.setText("Mon premier layout Java");

        LinearLayout monLayout = new LinearLayout(this);

        setContentView(monLayout); // set UIComponent as view !

        monLayout.addView(monTextView); // add view child

        TextView monTextView2 = new TextView(this);
        monTextView2.setGravity(Gravity.CENTER);
        monTextView2.setText("Star Wars");

        monLayout.addView(monTextView2);
        monLayout.setOrientation(LinearLayout.HORIZONTAL);

        monLayout.removeView(monTextView);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        monTextView2.setLayoutParams(params);

        params.gravity = Gravity.BOTTOM;

        monTextView2.setGravity(Gravity.CENTER);
        ConstraintLayout.LayoutParams matchParentParams = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT);
        ConstraintLayout.LayoutParams wrapContentParams = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        ConstraintLayout.LayoutParams matchHeightWrapWidthParams = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);

        */


        LinearLayout.LayoutParams vPageLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);


        LinearLayout containerLayout = new LinearLayout(this);

        LinearLayout vPageLayout = new LinearLayout(this);
        vPageLayout.setOrientation(LinearLayout.VERTICAL);
        vPageLayout.setLayoutParams(vPageLayoutParams);







        setContentView(vPageLayout);


        vPageLayout.addView(makeHeader());
        vPageLayout.addView(makeInputFields());



    }

    public LinearLayout makeHeader() {
        LinearLayout.LayoutParams hPageLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        hPageLayoutParams.gravity = Gravity.CENTER;

        LinearLayout hPageLayout = new LinearLayout(this);
        hPageLayout.setOrientation(LinearLayout.HORIZONTAL);
        hPageLayout.setLayoutParams(hPageLayoutParams);

        LinearLayout.LayoutParams wrapHeightMatchWidthParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        wrapHeightMatchWidthParams.gravity = Gravity.CENTER;

        TextView txtTitle = new TextView(this);
        txtTitle.setText(R.string.Hello);
        txtTitle.setTextSize(30.0F);
        txtTitle.setLayoutParams(wrapHeightMatchWidthParams);
        hPageLayout.addView(txtTitle);
        return hPageLayout;
    }

    public LinearLayout makeInputFields() {
        LinearLayout.LayoutParams hPageLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        hPageLayoutParams.gravity = Gravity.CENTER;

        LinearLayout hPageLayout = new LinearLayout(this);
        hPageLayout.setOrientation(LinearLayout.HORIZONTAL);
        hPageLayout.setLayoutParams(hPageLayoutParams);

        LinearLayout.LayoutParams wrapHeightMatchWidthParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        wrapHeightMatchWidthParams.gravity = Gravity.BOTTOM;

        EditText editMinimum = new EditText(this);
        editMinimum.setTextSize(30.0F);
        editMinimum.setLayoutParams(wrapHeightMatchWidthParams);

        EditText editMaximum = new EditText(this);
        editMinimum.setTextSize(30.0F);
        editMaximum.setLayoutParams(wrapHeightMatchWidthParams);

        hPageLayout.addView(editMinimum);
        hPageLayout.addView(editMaximum);

        return hPageLayout;
    }
}
