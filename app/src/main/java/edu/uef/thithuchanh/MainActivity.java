package edu.uef.thithuchanh;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView numbBeer, numCocktail, numLemonade, numMilkshake, numOrangeJuice, numBeerGermany, numCocktailThai;
    ImageButton beer, cocktail, lemonade, milkshake, orangejuice, beerGermany, cocktailThai;
    Button confirm, reset;

    public int valueBeer, valueCocktail, valueLemonade, valueMilkshake, valueOrangeJuice, valueBeerGermany, valueCocktailThai;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        confirm = findViewById(R.id.btnConfirm);
        reset = findViewById(R.id.btnReset);

        beer = findViewById(R.id.imgBeer);
        cocktail = findViewById(R.id.imgCocktail);
        lemonade = findViewById(R.id.imgLemonade);
        milkshake = findViewById(R.id.imgMilkshake);
        orangejuice = findViewById(R.id.imgOrangeJuice);
        beerGermany = findViewById(R.id.imgBeerGermany);
        cocktailThai = findViewById(R.id.imgCocktailThai);

        numbBeer = findViewById(R.id.txtNumBeer);
        numCocktail = findViewById(R.id.txtNumCocktail);
        numLemonade = findViewById(R.id.txtNumLemonade);
        numMilkshake = findViewById(R.id.txtNumMilkshake);
        numOrangeJuice = findViewById(R.id.txtNumOrangeJuice);
        numBeerGermany = findViewById(R.id.txtNumBeerGermany);
        numCocktailThai = findViewById(R.id.txtNumCocktailThai);


        beer.setOnClickListener(new View.OnClickListener() {
            private int click = 0;
            @Override
            public void onClick(View v) {
                click = click+1;
                numbBeer.setText("Orders: " + click);

                valueBeer = click;
            }
        });

        // Amount Beer
        cocktail.setOnClickListener(new View.OnClickListener() {
            private int click = 0;
            @Override
            public void onClick(View v) {
                click = click+1;
                numCocktail.setText("Orders: " + click);

                valueCocktail = click;
            }
        });

        // Amount Cocktail
        lemonade.setOnClickListener(new View.OnClickListener() {
            private int click = 0;
            @Override
            public void onClick(View v) {
                click = click+1;
                numLemonade.setText("Orders: " + click);

                valueLemonade = click;
            }
        });

        milkshake.setOnClickListener(new View.OnClickListener() {
            private int click = 0;
            @Override
            public void onClick(View v) {
                click = click+1;
                numMilkshake.setText("Orders: " + click);

                valueMilkshake = click;
            }
        });

        orangejuice.setOnClickListener(new View.OnClickListener() {
            private int click = 0;
            @Override
            public void onClick(View v) {
                click = click+1;
                numOrangeJuice.setText("Orders: " + click);

                valueOrangeJuice = click;
            }
        });

        beerGermany.setOnClickListener(new View.OnClickListener() {
            private int click = 0;
            @Override
            public void onClick(View v) {
                click = click+1;
                numBeerGermany.setText("Orders: " + click);

                valueBeerGermany = click;
            }
        });

        cocktailThai.setOnClickListener(new View.OnClickListener() {
            private int click = 0;
            @Override
            public void onClick(View v) {
                click = click+1;
                numCocktailThai.setText("Orders: " + click);

                valueCocktailThai = click;
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final CharSequence[] items = new String[]{
                        "Beers: " + valueBeer,
                        "Cocktail: " + valueCocktail,
                        "Lemonades: " + valueLemonade,
                        "Milkshakes: " + valueMilkshake,
                        "Orange juices: " + valueOrangeJuice,
                        "Beer Germany: " + valueBeerGermany,
                        "Cocktail Thai: " + valueCocktailThai};

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("This is your list of orders");
                builder.setItems(items, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        dialog.dismiss();
                    }
                });
                builder.show();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbBeer.setText("");
                numCocktail.setText("");
                numLemonade.setText("");
                numMilkshake.setText("");
                numOrangeJuice.setText("");
                numBeerGermany.setText("");
                numCocktailThai.setText("");

                valueBeer = 0;
                valueCocktail = 0;
                valueLemonade = 0;
                valueMilkshake = 0;
                valueOrangeJuice = 0;
                valueBeerGermany = 0;
                valueCocktailThai = 0;
            }
        });
    }
}