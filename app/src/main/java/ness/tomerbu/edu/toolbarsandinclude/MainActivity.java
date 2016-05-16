package ness.tomerbu.edu.toolbarsandinclude;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    CardViewHolder card1, card2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.card1 = new CardViewHolder(findViewById(R.id.card1));
        this.card2 = new CardViewHolder(findViewById(R.id.card2));

    }
}



class CardViewHolder{
    Button btnLeft, btnRight;
    ImageView ivMiddle;

    public CardViewHolder(View card) {
        btnLeft = (Button) card.findViewById(R.id.btnLeftTop);
        btnRight = (Button) card.findViewById(R.id.btnBottomRight);
        ivMiddle = (ImageView) card.findViewById(R.id.ivCenter);

        initEvents();
    }

    private void initEvents() {
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLeft.setText("Tapped");
            }
        });
    }
}